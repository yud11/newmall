package com.yudi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.product.entity.PmsSpuCommentEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÆÀ¼Û
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:46
 */
public interface PmsSpuCommentService extends IService<PmsSpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

