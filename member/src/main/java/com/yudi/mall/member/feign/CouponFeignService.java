package com.yudi.mall.member.feign;

import com.yudi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yudi
 * @date 2020-07-22 21:09
 */
@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/membercoupons")
    public R memberCoupons();
}
