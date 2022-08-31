package com.ssm.service.impl;

import com.ssm.dao.LogDao;
import com.ssm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by e1hax on 2022-08-31.
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, int money ) {
        logDao.log("转账操作由"+out+"到"+in+",金额："+money);
    }
}
