package com.citycloud.gmall.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.gmall.user.dto.UserDo;
import com.citycloud.gmall.user.mapper.UserMapper;
import com.citycloud.gmall.user.param.BalanceVariationQuest;
import com.citycloud.gmall.user.service.BalanceDetailService;
import com.citycloud.gmall.user.service.GmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GmallServiceImpl extends ServiceImpl<UserMapper, UserDo>
        implements GmallService {

    @Autowired
    private BalanceDetailService balanceDetailService;


    @Override
    public UserDo findById(Long userId) {
        UserDo userDo = this.getById(userId);
        return userDo;
    }

    @Override
    public int balanceVariation(BalanceVariationQuest balanceVariationQuest) {
        //拿到用户的id,明细状态和金额
        Long detailState = balanceVariationQuest.getDetailState();
        Long userId = balanceVariationQuest.getUserId();
        BigDecimal money = balanceVariationQuest.getMoney();

        if(detailState.equals(1L)||detailState.equals(4L)){
            //是消费或取出类型,查出用户金额后减掉用掉的金额在保存起来
            UserDo userDo = this.getById(userId);
            userDo.setBalance(userDo.getBalance().subtract(money));
            this.updateById(userDo);
        }
        if(detailState.equals(2L)||detailState.equals(3L)){
            //是退款或充值类型,查出用户金额后加上获取的金额在保存起来
            UserDo userDo = this.getById(userId);
            userDo.setBalance(userDo.getBalance().add(money));
            this.updateById(userDo);
        }

        //同时在明细表种记录下来
        balanceDetailService.createBalance(balanceVariationQuest);
        return 1;
    }
}
