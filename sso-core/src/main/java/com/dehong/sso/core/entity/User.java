package com.dehong.sso.core.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 *
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 5376162136254287012L;
    /**  */
    @Id
    @Column(name = "id")
    private Long id;

    /**  */
    @Column(name = "u_id")
    private Long uId;

    /**  */
    @Column(name = "user_name")
    private String userName;

    /**  */
    @Column(name = "password")
    private String password;

    /**  */
    @Column(name = "encryption_rule")
    private String encryptionRule;

    /**  */
    @Column(name = "valid_date")
    private LocalDate validDate;

    /**  */
    @Column(name = "user_from")
    private String userFrom;

    /**  */
    @Column(name = "is_online")
    private Boolean isOnline;

    /**  */
    @Column(name = "remark")
    private String remark;

    /**  */
    @Column(name = "password_des")
    private String passwordDes;

    /**  */
    @Column(name = "is_admin")
    private Boolean isAdmin;

    /**  */
    @Column(name = "is_enable")
    private Boolean isEnable;

    /**  */
    @Column(name = "createtime")
    private LocalDateTime createtime;

    /**  */
    @Column(name = "updatetime")
    private LocalDateTime updatetime;

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
     * Returns the uId.
     *
     * @return the uId
     */
    public Long getUId() {
        return uId;
    }

    /**
     * Sets the uId.
     *
     * @param uId the uId
     */
    public void setUId(Long uId) {
        this.uId = uId;
    }

    /**
     * Returns the userName.
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the userName.
     *
     * @param userName the userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the encryptionRule.
     *
     * @return the encryptionRule
     */
    public String getEncryptionRule() {
        return encryptionRule;
    }

    /**
     * Sets the encryptionRule.
     *
     * @param encryptionRule the encryptionRule
     */
    public void setEncryptionRule(String encryptionRule) {
        this.encryptionRule = encryptionRule;
    }

    /**
     * Returns the validDate.
     *
     * @return the validDate
     */
    public LocalDate getValidDate() {
        return validDate;
    }

    /**
     * Sets the validDate.
     *
     * @param validDate the validDate
     */
    public void setValidDate(LocalDate validDate) {
        this.validDate = validDate;
    }

    /**
     * Returns the userFrom.
     *
     * @return the userFrom
     */
    public String getUserFrom() {
        return userFrom;
    }

    /**
     * Sets the userFrom.
     *
     * @param userFrom the userFrom
     */
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    /**
     * Returns the isOnline.
     *
     * @return the isOnline
     */
    public Boolean getIsOnline() {
        return isOnline;
    }

    /**
     * Sets the isOnline.
     *
     * @param isOnline the isOnline
     */
    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * Returns the desc.
     *
     * @return the desc
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the desc.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Returns the passwordDes.
     *
     * @return the passwordDes
     */
    public String getPasswordDes() {
        return passwordDes;
    }

    /**
     * Sets the passwordDes.
     *
     * @param passwordDes the passwordDes
     */
    public void setPasswordDes(String passwordDes) {
        this.passwordDes = passwordDes;
    }

    /**
     * Returns the isAdmin.
     *
     * @return the isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Sets the isAdmin.
     *
     * @param isAdmin the isAdmin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * Returns the isEnable.
     *
     * @return the isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * Sets the isEnable.
     *
     * @param isEnable the isEnable
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * Returns the createtime.
     *
     * @return the createtime
     */
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    /**
     * Sets the createtime.
     *
     * @param createtime the createtime
     */
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    /**
     * Returns the updatetime.
     *
     * @return the updatetime
     */
    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    /**
     * Sets the updatetime.
     *
     * @param updatetime the updatetime
     */
    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }
}