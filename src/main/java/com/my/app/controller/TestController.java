package com.my.app.controller;

import com.my.app.mysql.ms_a.entity.MTestA;
import com.my.app.mysql.ms_a.service.IMTestAService;
import com.my.app.mysql.ms_b.entity.MTestB;
import com.my.app.mysql.ms_b.service.IMTestBService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @Resource
    private IMTestAService imTestAService;
    @Resource
    private IMTestBService imTestBService;

    @GetMapping(value = "/a")
    public List<MTestA> a() {
        return imTestAService.list();
    }

    @GetMapping(value = "/b")
    public List<MTestB> b() {
        return imTestBService.list();
    }
}
