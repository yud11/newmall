package com.yudi.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * ÉÌÆ·¿â´æ
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:08:44
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

