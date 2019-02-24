package com.controller;

import com.entity.Balance;
import com.entity.Test;
import com.service.BalanceService;
import com.service.TestService;
import communal.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="会员模块")
@RestController
@RequestMapping(value="/test")
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private BalanceService balanceService;

    @ApiOperation(value="---", notes="")
    @GetMapping(value="getTestList", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Test> getTest(){
        return testService.getTestList();
    }

    @ApiOperation(value="---", notes="")
    @GetMapping(value="getBalanceList", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Balance> getBalanceList() {
        return balanceService.getBalanceList();
    }
}
