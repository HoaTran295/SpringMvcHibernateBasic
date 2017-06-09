package com.hoa.leage.DAO.Impl;

import com.hoa.leage.DAO.TeamDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAOImpl implements TeamDAO {
    @Autowired
    private SessionFactory sessionFactory;
}
