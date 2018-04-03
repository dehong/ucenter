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
@Table(name = "t_role_user")
public class RoleUser implements Serializable {

    private static final long serialVersionUID = -2213036946788132313L;
    /**  */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**  */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**  */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * Returns the roleId.
     *
     * @return the roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * Sets the roleId.
     *
     * @param roleId the roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * Returns the userId.
     *
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the userId.
     *
     * @param userId the userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}