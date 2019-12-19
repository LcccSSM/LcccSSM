package com.ssm.controller;

import com.ssm.model.StateStatus;
import com.ssm.service.IStateStatusService;
import com.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateStausController {
    //JSON
    JsonData jsonData;
    @Autowired
    private IStateStatusService iStateStatusService;
//    @Autowired
//    private IUserService iUserService;

    //根据用户id查询实名信息
    @RequestMapping(value = "/selectState")
    @ResponseBody
    public StateStatus slectState(StateStatus stateStatus) {
        StateStatus status = iStateStatusService.selectByAuserid(stateStatus.getAuserid());
        return  status;
    }


}
