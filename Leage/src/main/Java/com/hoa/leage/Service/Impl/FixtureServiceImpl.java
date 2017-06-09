package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.FixtureDAO;
import com.hoa.leage.Service.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FixtureServiceImpl implements FixtureService {
    @Qualifier("fixtureDAOImpl")
    @Autowired
    private FixtureDAO fixtureDAO;
}
