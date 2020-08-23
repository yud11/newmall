package com.yudi.mall.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.yudi.mall.member.entity.MemberEntity;
import com.yudi.mall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yudi.mall.member.entity.GrowthChangeHistoryEntity;
import com.yudi.mall.member.service.GrowthChangeHistoryService;
import com.yudi.common.utils.PageUtils;
import com.yudi.common.utils.R;



/**
 * ³É³¤Öµ±ä»¯ÀúÊ·¼ÇÂ¼
 *
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:57:07
 */
@RestController
@RequestMapping("member/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Autowired
    private CouponFeignService couponFeignService;

    /**
     * 列表
     */
    @RequestMapping("/coupon/list")
    public R memberCoupon(){
        R r = couponFeignService.memberCoupons();
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("yudi");
        return R.ok().put("member",memberEntity).put("counpons",r.get("coupons"));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:growthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:growthchangehistory:info")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:growthchangehistory:save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:growthchangehistory:update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:growthchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
