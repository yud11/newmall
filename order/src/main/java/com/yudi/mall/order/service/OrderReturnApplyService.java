package com.yudi.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * ¶©µ¥ÍË»õÉêÇë
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:02:29
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

