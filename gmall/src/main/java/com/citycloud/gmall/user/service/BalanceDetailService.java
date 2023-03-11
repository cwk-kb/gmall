package com.citycloud.gmall.user.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.gmall.user.dto.BalanceDetail;
import com.citycloud.gmall.user.param.BalanceVariationQuest;

import java.util.List;

/**
 *
 */
public interface BalanceDetailService extends IService<BalanceDetail> {

    int createBalance(BalanceVariationQuest balanceVariationQuest);

    Page<BalanceDetail> findListById(Long userId);
}
