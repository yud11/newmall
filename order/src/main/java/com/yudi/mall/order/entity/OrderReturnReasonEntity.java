package com.yudi.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÍË»õÔ­Òò
 * 
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 15:02:29
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÍË»õÔ­ÒòÃû
	 */
	private String name;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;
	/**
	 * ÆôÓÃ×´Ì¬
	 */
	private Integer status;
	/**
	 * create_time
	 */
	private Date createTime;

}
