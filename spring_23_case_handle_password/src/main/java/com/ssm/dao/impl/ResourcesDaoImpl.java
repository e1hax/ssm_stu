package com.ssm.dao.impl;

import com.ssm.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/**
 * Created by e1hax on 2022-08-31.
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        return password.equals("root");
    }
}
