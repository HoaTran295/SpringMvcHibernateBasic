package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.TeamDAO;
import com.hoa.leage.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDAO teamDAO;
}
