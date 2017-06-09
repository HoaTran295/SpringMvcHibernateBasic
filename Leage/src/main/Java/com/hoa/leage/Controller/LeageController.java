package com.hoa.leage.Controller;

import com.hoa.leage.Service.LeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

@Controller
public class LeageController {

    @Autowired
    private LeageService leageService;

    @RequestMapping("/")
    public String add(){
        leageService.add();
        return "index";
    }
}
