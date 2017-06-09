package com.hoa.leage.DAO.Impl;

import com.hoa.leage.DAO.GoldScoredDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoldScoredDAOImpl implements GoldScoredDAO {
    @Autowired
    private SessionFactory sessionFactory;
}
