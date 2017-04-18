/*Copyright (c) 2015-2016 IBM Training*/
package com.hrdb.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.hrdb.User;

/**
 * Specifies methods used to obtain and modify User related information
 * which is stored in the database.
 */
@Repository("hrdb.UserDao")
public class UserDao extends WMGenericDaoImpl<User, Integer> {

    @Autowired
    @Qualifier("hrdbTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}
