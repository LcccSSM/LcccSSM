package com.ssm.service;

import com.ssm.model.TFunction;

import java.util.List;

public interface IFunctionService {
    List<TFunction> listByFunction(int max);

    void manage(TFunction tFunction);
}