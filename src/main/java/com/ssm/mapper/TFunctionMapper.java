package com.ssm.mapper;

import com.ssm.model.TFunction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TFunctionMapper {
    List<TFunction> listByFunction(int FunctionMax);

    List<TFunction> manage(TFunction function);
}