package com.ruan.productionservice.service.impl;

import com.ruan.productionservice.mapper.ProductionMapper;
import com.ruan.productionservice.model.Production;
import com.ruan.productionservice.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    ProductionMapper mapper;

    @Override
    public int delete(String uuid) {
        return mapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public int save(Production production) {
        production.setUuid(UUID.randomUUID().toString().replace("-", "").toLowerCase());
        production.setCreateTime(new Date());
        return mapper.insert(production);
    }

    @Override
    public int update(Production production) {
        return mapper.updateByPrimaryKeySelective(production);
    }

    @Override
    public Production get(String uuid) {
        return mapper.selectByPrimaryKey(uuid);
    }

    @Override
    public ArrayList<Production> list() {
        return mapper.selectAll();
    }
}
