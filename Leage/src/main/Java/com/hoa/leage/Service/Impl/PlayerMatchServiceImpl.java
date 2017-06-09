package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.PlayerMatchDAO;
import com.hoa.leage.Service.PlayerMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerMatchServiceImpl implements PlayerMatchService {
    @Autowired
    private PlayerMatchDAO playerMatchDAO;
}
