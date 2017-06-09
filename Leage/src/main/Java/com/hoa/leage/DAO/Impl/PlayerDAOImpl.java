package com.hoa.leage.DAO.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAOImpl {
    @Autowired
    private SessionFactory sessionFactory;
}
