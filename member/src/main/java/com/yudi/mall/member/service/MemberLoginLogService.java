package com.yudi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * »áÔ±µÇÂ¼¼ÇÂ¼
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:57:07
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

