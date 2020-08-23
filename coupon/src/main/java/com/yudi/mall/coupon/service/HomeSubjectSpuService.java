package com.yudi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * ×¨ÌâÉÌÆ·
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:41:28
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

