package com.hoa.leage.DAO.Impl;

import com.hoa.leage.DAO.LeageDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LeageDAOImpl implements LeageDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add() {
        sessionFactory.getCurrentSession();
    }
}
