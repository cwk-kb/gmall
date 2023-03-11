package com.citycloud.gmall.user.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BalanceVariationQuest {

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "明细类型")
    private Long detailState;

    @ApiModelProperty(value = "金额")
    private BigDecimal money;
}
