package com.yudi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * ÉÌÆ·spu»ý·ÖÉèÖÃ
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:41:28
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

