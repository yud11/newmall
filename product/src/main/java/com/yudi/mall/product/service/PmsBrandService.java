package com.yudi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * Æ·ÅÆ
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:46
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

