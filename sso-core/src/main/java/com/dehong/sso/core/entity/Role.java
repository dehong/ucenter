package com.dehong.sso.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 *
 */
@Entity
@Table(name = "t_role")
public class Role implements Serializable {
    private static final long serialVersionUID = 8200736942524006850L;
    /**  */
    @Id
    @Column(name = "id")
    private Long id;

    /**  */
    @Column(name = "name")
    private String name;

    /**  */
    @Column(name = "type")
    private String type;

    /**  */
    @Column(name = "description")
    private String description;

    /**  */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    /**  */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**  */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**  */
    @Column(name = "delete_time")
    private LocalDateTime deleteTime;

    /**  */
    @Column(name = "update_count")
    @Version
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
}