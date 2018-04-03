package com.dehong.sso.core.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 */
public class RoleDto implements Serializable {

    private static final long serialVersionUID = -3841135501710864979L;
    /**  */
    private Long id;

    /**  */
    private String name;

    /**  */
    private String type;

    /**  */
    private String description;

    /**  */
    private Boolean deleteFlag;

    /**  */
    private LocalDateTime createTime;

    /**  */
    private LocalDateTime updateTime;

    /**  */
    private LocalDateTime deleteTime;

    /**  */
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
     * Returns the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteTime=" + deleteTime +
                ", updateCount=" + updateCount +
                '}';
    }
}