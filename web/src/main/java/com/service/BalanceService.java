package com.service;

import com.entity.Balance;
import com.mapper.BalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceService {

    @Autowired
    private BalanceMapper balanceMapper;

    public List<Balance> getBalanceList() {
        return balanceMapper.selectAll();
    }
}
