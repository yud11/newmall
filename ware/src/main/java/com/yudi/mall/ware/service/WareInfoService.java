package com.yudi.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yudi.common.utils.PageUtils;
import com.yudi.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * ²Ö¿âÐÅÏ¢
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:08:44
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

