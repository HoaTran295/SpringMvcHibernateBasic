package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.LeageDAO;
import com.hoa.leage.Service.LeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LeageServiceImpl implements LeageService{

    @Qualifier("leageDAOImpl")
    @Autowired
    private LeageDAO leageDAO;

    @Override
    @Transactional
    public void add() {
        leageDAO.add();
    }
}
