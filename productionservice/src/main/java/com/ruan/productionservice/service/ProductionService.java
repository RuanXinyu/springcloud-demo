package com.ruan.productionservice.service;

import com.ruan.productionservice.model.Production;

import java.util.ArrayList;

public interface ProductionService {

    int delete(String uuid);

    int save(Production record);

    Production get(String uuid);

    int update(Production record);

    ArrayList<Production> list();
}
