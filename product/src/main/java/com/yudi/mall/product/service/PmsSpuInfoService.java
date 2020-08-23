package com.yudi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.product.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spuÐÅÏ¢
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:46
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

