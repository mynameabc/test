package com.service;

import com.entity.Test;
import com.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> getTestList() {
        return testMapper.selectAll();
    }
}
