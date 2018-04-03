package com.dehong.sso.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 *
 */
@Entity
@Table(name = "t_system_menu")
public class SystemMenu implements Serializable {

    private static final long serialVersionUID = -300711459655112779L;
    /**
     * 菜单id
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 菜单描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 父菜单id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**  */
    @Column(name = "path")
    private String path;

    /**  */
    @Column(name = "icon")
    private String icon;

    /**
     * 删除标志
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private LocalDateTime deleteTime;

    /**  */
    @Column(name = "update_count")
    private Integer updateCount;

    /**
     * Returns the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the parentId.
     *
     * @return the parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId.
     *
     * @param parentId the parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Returns the path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path.
     *
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Returns the icon.
     *
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Returns the deleteFlag.
     *
     * @return the deleteFlag
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the deleteFlag.
     *
     * @param deleteFlag the deleteFlag
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * Returns the createTime.
     *
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * Sets the createTime.
     *
     * @param createTime the createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Returns the updateTime.
     *
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the updateTime.
     *
     * @param updateTime the updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Returns the deleteTime.
     *
     * @return the deleteTime
     */
    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    /**
     * Sets the deleteTime.
     *
     * @param deleteTime the deleteTime
     */
    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * Returns the updateCount.
     *
     * @return the updateCount
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    /**
     * Sets the updateCount.
     *
     * @param updateCount the updateCount
     */
    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }
}