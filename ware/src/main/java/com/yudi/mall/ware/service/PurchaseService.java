package com.yudi.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * ²É¹ºÐÅÏ¢
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:08:45
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

