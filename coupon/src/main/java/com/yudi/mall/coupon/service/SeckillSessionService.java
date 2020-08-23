package com.yudi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * ÃëÉ±»î¶¯³¡´Î
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:41:28
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

