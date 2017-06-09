package com.hoa.leage.Service.Impl;

import com.hoa.leage.DAO.GoldScoredDAO;
import com.hoa.leage.Service.GoldScoredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoldScoredServiceImpl implements GoldScoredService {
    @Autowired
    private GoldScoredDAO goldScoredDAO;
}
