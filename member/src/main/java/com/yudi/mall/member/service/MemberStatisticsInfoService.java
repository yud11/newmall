package com.yudi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * »áÔ±Í³¼ÆÐÅÏ¢
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:57:07
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

