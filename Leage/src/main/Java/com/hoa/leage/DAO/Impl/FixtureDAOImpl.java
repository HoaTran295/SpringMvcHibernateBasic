package com.hoa.leage.DAO.Impl;

import com.hoa.leage.DAO.FixtureDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FixtureDAOImpl implements FixtureDAO {
    @Autowired
    private SessionFactory sessionFactory;
}
