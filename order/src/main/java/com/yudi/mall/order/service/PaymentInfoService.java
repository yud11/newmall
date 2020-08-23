package com.yudi.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * Ö§¸¶ÐÅÏ¢±í
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:02:29
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

