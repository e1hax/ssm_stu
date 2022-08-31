package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.dao.LogDao;
import com.ssm.service.AccountService;
import com.ssm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by e1hax on 2022-08-31.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, int money) throws IOException {
        try {
            accountDao.outMoney(out,money);
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }

    }
}
