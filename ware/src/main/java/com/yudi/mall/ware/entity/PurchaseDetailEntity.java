package com.yudi.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:08:44
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * ²É¹ºµ¥id
	 */
	private Long purchaseId;
	/**
	 * ²É¹ºÉÌÆ·id
	 */
	private Long skuId;
	/**
	 * ²É¹ºÊýÁ¿
	 */
	private Integer skuNum;
	/**
	 * ²É¹º½ð¶î
	 */
	private BigDecimal skuPrice;
	/**
	 * ²Ö¿âid
	 */
	private Long wareId;
	/**
	 * ×´Ì¬[0ÐÂ½¨£¬1ÒÑ·ÖÅä£¬2ÕýÔÚ²É¹º£¬3ÒÑÍê³É£¬4²É¹ºÊ§°Ü]
	 */
	private Integer status;

}
