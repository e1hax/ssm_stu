package com.ssm.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by e1hax on 2022-08-31.
 */
public interface AccountService {

    /**
     * 转账方法
     * @param out  转出人
     * @param in    收款人
     * @param money     金额
     */
    //@Transactional(rollbackFor = {IOException.class})
    @Transactional
    public void transfer(String out,String in,int money) throws IOException;
}
