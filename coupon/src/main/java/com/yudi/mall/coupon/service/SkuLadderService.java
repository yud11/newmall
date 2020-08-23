package com.yudi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * ÉÌÆ·½×ÌÝ¼Û¸ñ
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:41:28
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

