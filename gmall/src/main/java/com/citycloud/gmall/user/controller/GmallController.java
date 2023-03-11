package com.citycloud.gmall.user.controller;

import com.citycloud.gmall.user.dto.UserDo;
import com.citycloud.gmall.user.param.BalanceVariationQuest;
import com.citycloud.gmall.user.service.GmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gmall")
public class GmallController {

    @Autowired
    private GmallService gmallService;

    //用户查询余额接口
    @GetMapping("/findById")
    public UserDo findById(@RequestParam("userId") Long userId){
        UserDo userDo = gmallService.findById(userId);
        return userDo;
    }

    //用户消费接口
    @PostMapping("/balance/variation")
    public int balanceVariation(@RequestBody BalanceVariationQuest balanceVariationQuest){
        int result = gmallService.balanceVariation(balanceVariationQuest);
        return result;
    }
}
