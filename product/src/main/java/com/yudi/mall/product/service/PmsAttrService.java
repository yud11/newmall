package com.yudi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÊôÐÔ
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:47
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

