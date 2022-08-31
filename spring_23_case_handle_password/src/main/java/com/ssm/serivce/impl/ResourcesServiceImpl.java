package com.ssm.serivce.impl;

import com.ssm.dao.ResourcesDao;
import com.ssm.serivce.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by e1hax on 2022-08-31.
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url, password);
    }
}
