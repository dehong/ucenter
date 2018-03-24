package com.dehong.sso.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

@Entity
@Table(name = "FIMS_MENU")
public class FimsMenu {
	/** 菜单ID*/
	@Id
	@Column(name = "MENU_ID")
	private String menuId;
	
	/** 菜单名称*/
	@Column(name = "MENU_NAME")
	private String menuName;
	
	/** 菜单描述*/
	@Column(name = "DESCRIPTION")
	private String desc;
	
	/** 父菜单ID*/
	@Column(name = "PARENT_ID")
	private String parentId;
	
	/** 菜单对应前端路径*/
	@Column(name = "PATH")
	private String path;
	
	/** 删除标志*/
	@Column(name = "DELETE_FLAG")
	private int deleteFlag;
	
	/** 创建时间*/
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	/** 更新时间*/
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	/** 删除时间*/
	@Column(name = "DELETE_TIME")
	private Date deleteTime;
	
	/** 更新次数*/
	@Version
	@Column(name = "UPDATE_COUNT")
	private BigDecimal updateCount;

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public BigDecimal getUpdateCount()
	{
		return updateCount;
	}

	public void setUpdateCount(BigDecimal updateCount)
	{
		this.updateCount = updateCount;
	}

	@Override
	public String toString() {
		return "FimsMenu [menuId=" + menuId + ", menuName=" + menuName + ", desc=" + desc + ", parentId=" + parentId
				+ ", path=" + path + ", deleteFlag=" + deleteFlag + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", deleteTime=" + deleteTime + ", updateCount=" + updateCount + "]";
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
