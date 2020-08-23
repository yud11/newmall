package com.yudi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * ³É³¤Öµ±ä»¯ÀúÊ·¼ÇÂ¼
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:57:07
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

