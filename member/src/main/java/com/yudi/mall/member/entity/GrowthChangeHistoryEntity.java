package com.yudi.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ³É³¤Öµ±ä»¯ÀúÊ·¼ÇÂ¼
 * 
 * @author yudi
 * @email 18856040820@163.com
 * @date 2020-07-19 14:57:07
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ¸Ä±äµÄÖµ£¨Õý¸º¼ÆÊý£©
	 */
	private Integer changeCount;
	/**
	 * ±¸×¢
	 */
	private String note;
	/**
	 * »ý·ÖÀ´Ô´[0-¹ºÎï£¬1-¹ÜÀíÔ±ÐÞ¸Ä]
	 */
	private Integer sourceType;

}
