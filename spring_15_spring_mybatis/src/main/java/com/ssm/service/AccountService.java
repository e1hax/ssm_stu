package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

/**
 * Created by e1hax on 2022-08-30.
 */
public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
