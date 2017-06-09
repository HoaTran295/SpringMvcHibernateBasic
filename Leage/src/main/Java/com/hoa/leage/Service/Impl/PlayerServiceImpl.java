package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.PlayerDAO;
import com.hoa.leage.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerDAO playerDAO;

}
