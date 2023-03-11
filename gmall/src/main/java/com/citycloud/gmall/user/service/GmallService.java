package com.citycloud.gmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.gmall.user.dto.UserDo;
import com.citycloud.gmall.user.param.BalanceVariationQuest;


public interface GmallService extends IService<UserDo> {

    UserDo findById(Long userId);

    int balanceVariation(BalanceVariationQuest balanceVariationQuest);
}
