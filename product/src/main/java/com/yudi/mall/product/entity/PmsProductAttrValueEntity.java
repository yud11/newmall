package com.yudi.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÊôÐÔÖµ
 * 
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-14 20:55:47
 */
@Data
@TableName("pms_product_attr_value")
public class PmsProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÉÌÆ·id
	 */
	private Long spuId;
	/**
	 * ÊôÐÔid
	 */
	private Long attrId;
	/**
	 * ÊôÐÔÃû
	 */
	private String attrName;
	/**
	 * ÊôÐÔÖµ
	 */
	private String attrValue;
	/**
	 * Ë³Ðò
	 */
	private Integer attrSort;
	/**
	 * ¿ìËÙÕ¹Ê¾¡¾ÊÇ·ñÕ¹Ê¾ÔÚ½éÉÜÉÏ£»0-·ñ 1-ÊÇ¡¿
	 */
	private Integer quickShow;

}
