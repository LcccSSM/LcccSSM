package com.ssm.service.impl;

import com.ssm.mapper.TFunctionMapper;
import com.ssm.model.TFunction;
import com.ssm.service.IFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FunctionServiceImpl implements IFunctionService {

    @Autowired
    private TFunctionMapper functionMapper;

    @Override
    public List<TFunction> listByFunction(int max) {
        System.out.println(max);
        List<TFunction> tFunctions = functionMapper.listByFunction(max);
        for (TFunction tFunction : tFunctions) {
            tFunction.setMethod(tFunction.getMethod()+"_");
        }
        for (TFunction tFunction : tFunctions) {
            this.manage(tFunction);
        }
        return tFunctions;
    }

    @Override
    public void manage(TFunction tFunction) {
        List<TFunction> tFunctions = functionMapper.manage(tFunction);
        tFunction.setChildren(tFunctions);
    }
}
