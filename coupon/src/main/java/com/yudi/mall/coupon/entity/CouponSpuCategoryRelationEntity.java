package com.yudi.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÓÅ»ÝÈ¯·ÖÀà¹ØÁª
 * 
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:41:28
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÓÅ»ÝÈ¯id
	 */
	private Long couponId;
	/**
	 * ²úÆ··ÖÀàid
	 */
	private Long categoryId;
	/**
	 * ²úÆ··ÖÀàÃû³Æ
	 */
	private String categoryName;

}
