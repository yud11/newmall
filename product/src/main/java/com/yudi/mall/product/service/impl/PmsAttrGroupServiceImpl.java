package com.yudi.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yudi.common.utils.PageUtils;
import com.yudi.common.utils.Query;

import com.yudi.mall.product.dao.PmsAttrGroupDao;
import com.yudi.mall.product.entity.PmsAttrGroupEntity;
import com.yudi.mall.product.service.PmsAttrGroupService;


@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl extends ServiceImpl<PmsAttrGroupDao, PmsAttrGroupEntity> implements PmsAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrGroupEntity> page = this.page(
                new Query<PmsAttrGroupEntity>().getPage(params),
                new QueryWrapper<PmsAttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}