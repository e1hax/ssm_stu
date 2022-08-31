package com.ssm.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by e1hax on 2022-08-31.
 */
public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out,String in,int money);
}
