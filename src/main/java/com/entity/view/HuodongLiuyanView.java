package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.HuodongLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 活动留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("huodong_liuyan")
public class HuodongLiuyanView extends HuodongLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 活动
		/**
		* 活动名称
		*/

		@ColumnInfo(comment="活动名称",type="varchar(200)")
		private String huodongName;
		/**
		* 活动编号
		*/

		@ColumnInfo(comment="活动编号",type="varchar(200)")
		private String huodongUuidNumber;
		/**
		* 活动照片
		*/

		@ColumnInfo(comment="活动照片",type="varchar(200)")
		private String huodongPhoto;
		/**
		* 活动地点
		*/

		@ColumnInfo(comment="活动地点",type="varchar(200)")
		private String huodongAddress;
		/**
		* 活动类型
		*/
		@ColumnInfo(comment="活动类型",type="int(11)")
		private Integer huodongTypes;
			/**
			* 活动类型的值
			*/
			@ColumnInfo(comment="活动类型的字典表值",type="varchar(200)")
			private String huodongValue;
		/**
		* 活动最大参与人数
		*/

		@ColumnInfo(comment="活动最大参与人数",type="int(11)")
		private Integer huodongKucunNumber;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 活动开始时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="活动开始时间",type="timestamp")
		private Date huodongKaishiTime;
		/**
		* 活动热度
		*/

		@ColumnInfo(comment="活动热度",type="int(11)")
		private Integer huodongClicknum;
		/**
		* 活动内容
		*/

		@ColumnInfo(comment="活动内容",type="longtext")
		private String huodongContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer huodongDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public HuodongLiuyanView() {

	}

	public HuodongLiuyanView(HuodongLiuyanEntity huodongLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, huodongLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 活动

		/**
		* 获取： 活动名称
		*/
		public String getHuodongName() {
			return huodongName;
		}
		/**
		* 设置： 活动名称
		*/
		public void setHuodongName(String huodongName) {
			this.huodongName = huodongName;
		}

		/**
		* 获取： 活动编号
		*/
		public String getHuodongUuidNumber() {
			return huodongUuidNumber;
		}
		/**
		* 设置： 活动编号
		*/
		public void setHuodongUuidNumber(String huodongUuidNumber) {
			this.huodongUuidNumber = huodongUuidNumber;
		}

		/**
		* 获取： 活动照片
		*/
		public String getHuodongPhoto() {
			return huodongPhoto;
		}
		/**
		* 设置： 活动照片
		*/
		public void setHuodongPhoto(String huodongPhoto) {
			this.huodongPhoto = huodongPhoto;
		}

		/**
		* 获取： 活动地点
		*/
		public String getHuodongAddress() {
			return huodongAddress;
		}
		/**
		* 设置： 活动地点
		*/
		public void setHuodongAddress(String huodongAddress) {
			this.huodongAddress = huodongAddress;
		}
		/**
		* 获取： 活动类型
		*/
		public Integer getHuodongTypes() {
			return huodongTypes;
		}
		/**
		* 设置： 活动类型
		*/
		public void setHuodongTypes(Integer huodongTypes) {
			this.huodongTypes = huodongTypes;
		}


			/**
			* 获取： 活动类型的值
			*/
			public String getHuodongValue() {
				return huodongValue;
			}
			/**
			* 设置： 活动类型的值
			*/
			public void setHuodongValue(String huodongValue) {
				this.huodongValue = huodongValue;
			}

		/**
		* 获取： 活动最大参与人数
		*/
		public Integer getHuodongKucunNumber() {
			return huodongKucunNumber;
		}
		/**
		* 设置： 活动最大参与人数
		*/
		public void setHuodongKucunNumber(Integer huodongKucunNumber) {
			this.huodongKucunNumber = huodongKucunNumber;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 活动开始时间
		*/
		public Date getHuodongKaishiTime() {
			return huodongKaishiTime;
		}
		/**
		* 设置： 活动开始时间
		*/
		public void setHuodongKaishiTime(Date huodongKaishiTime) {
			this.huodongKaishiTime = huodongKaishiTime;
		}

		/**
		* 获取： 活动热度
		*/
		public Integer getHuodongClicknum() {
			return huodongClicknum;
		}
		/**
		* 设置： 活动热度
		*/
		public void setHuodongClicknum(Integer huodongClicknum) {
			this.huodongClicknum = huodongClicknum;
		}

		/**
		* 获取： 活动内容
		*/
		public String getHuodongContent() {
			return huodongContent;
		}
		/**
		* 设置： 活动内容
		*/
		public void setHuodongContent(String huodongContent) {
			this.huodongContent = huodongContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getHuodongDelete() {
			return huodongDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setHuodongDelete(Integer huodongDelete) {
			this.huodongDelete = huodongDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "HuodongLiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", huodongName=" + huodongName +
			", huodongUuidNumber=" + huodongUuidNumber +
			", huodongPhoto=" + huodongPhoto +
			", huodongAddress=" + huodongAddress +
			", huodongKucunNumber=" + huodongKucunNumber +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", huodongKaishiTime=" + DateUtil.convertString(huodongKaishiTime,"yyyy-MM-dd") +
			", huodongClicknum=" + huodongClicknum +
			", huodongContent=" + huodongContent +
			", huodongDelete=" + huodongDelete +
			"} " + super.toString();
	}
}
