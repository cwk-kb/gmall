package com.citycloud.gmall.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.citycloud.gmall.user.dto.BalanceDetail;
import com.citycloud.gmall.user.param.BalanceVariationQuest;
import com.citycloud.gmall.user.service.BalanceDetailService;
import com.citycloud.gmall.user.mapper.BalanceDetailMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
public class BalanceDetailServiceImpl extends ServiceImpl<BalanceDetailMapper, BalanceDetail>
    implements BalanceDetailService{

    @Override
    public int createBalance(BalanceVariationQuest balanceVariationQuest) {
        //存入用户的id,明细状态和金额
        BalanceDetail balanceDetail = new BalanceDetail();
        balanceDetail.setUserId(balanceVariationQuest.getUserId());
        balanceDetail.setMoney(balanceVariationQuest.getMoney());
        balanceDetail.setDetailState(balanceVariationQuest.getDetailState());
        balanceDetail.setRecordTime(new Date());

        this.save(balanceDetail);
        return 1;
    }

    @Override
    public Page<BalanceDetail> findListById(Long userId) {
        QueryWrapper<BalanceDetail> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",userId);
        Page<BalanceDetail> page = new Page<BalanceDetail>();
        page = this.page(page,wrapper);
        return page;
    }
}




