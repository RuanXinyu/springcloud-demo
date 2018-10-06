package com.ruan.productionservice.controller;

import com.ruan.productionservice.model.Production;
import com.ruan.productionservice.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/mall/production")
public class ProductionController {

    @Autowired
    ProductionService productionService;

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int save(Production production){
        return productionService.save(production);
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int update(Production production){
        return productionService.update(production);
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int delete(@PathVariable("id") String id){
        return productionService.delete(id);
    }

    @ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Production get(@PathVariable("id") String id){
        return productionService.get(id);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ArrayList<Production> list(){
        return productionService.list();
    }
}
