package com.citycloud.gmall.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.citycloud.gmall.user.dto.BalanceDetail;
import com.citycloud.gmall.user.param.BalanceVariationQuest;
import com.citycloud.gmall.user.service.BalanceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balance/detail")
public class BalanceDetailController {

    @Autowired
    private BalanceDetailService balanceDetailService;

    //创建消费明细接口
    @PostMapping("/create")
    public int createBalance(@RequestBody BalanceVariationQuest balanceVariationQuest){
        int result = balanceDetailService.createBalance(balanceVariationQuest);
        return result;
    }

    //查询用户金额变动明细接口
    @GetMapping("/findListById")
    public Page<BalanceDetail> findListById(@RequestParam Long userId){
        Page<BalanceDetail> result = balanceDetailService.findListById(userId);
        return result;
    }
}
