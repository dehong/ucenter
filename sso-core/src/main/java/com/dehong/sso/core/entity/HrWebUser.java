package com.dehong.sso.core.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "hr_web_user")
public class HrWebUser {

    /** */
    @Column(name = "UUID")
    String uuid;

    /** */
    @Column(name = "DUUID")
    String duuid;

    /** */
    @Column(name = "USER_NAME")
    String userName;

    /** */
    @Column(name = "PASSWORD")
    String password;

    /** */
    @Column(name = "ENCRYPTION_RULE")
    String encryptionRule;

    /** */
    @Column(name = "VALID_DATE")
    LocalDate validDate;

    /** */
    @Column(name = "USER_FROM")
    String userFrom;

    /** */
    @Column(name = "IS_ONLINE")
    Boolean isOnline;

    /** */
    @Column(name = "REMARK")
    String remark;

    /** */
    @Column(name = "PASSWORD_DES")
    String passwordDes;

    /** */
    @Column(name = "CREATETIME")
    LocalDateTime createtime;

    /** */
    @Column(name = "UPDATETIME")
    LocalDateTime updatetime;

    /** */
    @Column(name = "is_admin")
    Boolean isAdmin;

    /** */
    @Column(name = "is_enable")
    Boolean isEnable;

    /** 
     * Returns the uuid.
     * 
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /** 
     * Sets the uuid.
     * 
     * @param uuid the uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /** 
     * Returns the duuid.
     * 
     * @return the duuid
     */
    public String getDuuid() {
        return duuid;
    }

    /** 
     * Sets the duuid.
     * 
     * @param duuid the duuid
     */
    public void setDuuid(String duuid) {
        this.duuid = duuid;
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
     * Returns the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Sets the remark.
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
}