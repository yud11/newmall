package com.yudi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.product.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * skuÍ¼Æ¬
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:47
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

