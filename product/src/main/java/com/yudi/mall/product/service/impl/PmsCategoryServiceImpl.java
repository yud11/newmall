package com.yudi.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yudi.common.utils.PageUtils;
import com.yudi.common.utils.Query;

import com.yudi.mall.product.dao.PmsCategoryDao;
import com.yudi.mall.product.entity.PmsCategoryEntity;
import com.yudi.mall.product.service.PmsCategoryService;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> listTree() {
        List<PmsCategoryEntity> all = baseMapper.selectList(null);
        List<PmsCategoryEntity> treeList = all.stream().filter(c -> c.getParentCid() == 0)
                .map(menu -> {
                            menu.setChild(getChild(menu, all));
                            return menu;
                        }
                )
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());

        return treeList;
    }


    private List<PmsCategoryEntity> getChild(PmsCategoryEntity root, List<PmsCategoryEntity> all) {
        List<PmsCategoryEntity> list = all.stream().filter(c -> c.getParentCid() == root.getCatId())
                .map(menu -> {
                            menu.setChild(getChild(menu, all));
                            return menu;
                        }
                )
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return list;

    }

}