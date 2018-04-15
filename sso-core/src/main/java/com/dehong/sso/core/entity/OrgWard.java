package com.dehong.sso.core.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "org_ward")
public class OrgWard {

    /** */
    @Column(name = "UUID")
    String uuid;

    /** */
    @Column(name = "WARD_CODE")
    String wardCode;

    /** */
    @Column(name = "WARD_SN")
    String wardSn;

    /** */
    @Column(name = "WARD_NAME")
    String wardName;

    /** */
    @Column(name = "WARD_PINYIN")
    String wardPinyin;

    /** */
    @Column(name = "WARD_ABBNAME")
    String wardAbbname;

    /** */
    @Column(name = "WARD_ALIAS")
    String wardAlias;

    /** */
    @Column(name = "ORDER_NO")
    Integer orderNo;

    /** */
    @Column(name = "WARD_CATEGORIES")
    String wardCategories;

    /** */
    @Column(name = "AT_HOSPITAL")
    String atHospital;

    /** */
    @Column(name = "AT_WARD")
    String atWard;

    /** */
    @Column(name = "DISTRICT")
    String district;

    /** */
    @Column(name = "HEADER_UUID")
    String headerUuid;

    /** */
    @Column(name = "ISENTITY")
    Boolean isentity;

    /** */
    @Column(name = "ISCOSTCENTER")
    Boolean iscostcenter;

    /** */
    @Column(name = "ISINCOMECENTER")
    Boolean isincomecenter;

    /** */
    @Column(name = "ISAVALIABLE")
    Boolean isavaliable;

    /** */
    @Column(name = "REMARK")
    String remark;

    /** */
    @Column(name = "DESCRIPTION")
    String description;

    /** */
    @Column(name = "IS_DROPED")
    Boolean isDroped;

    /** */
    @Column(name = "EFFECT_TIME")
    LocalDate effectTime;

    /** */
    @Column(name = "CLOSE_TIME")
    LocalDateTime closeTime;

    /** */
    @Column(name = "CREATETIME")
    LocalDateTime createtime;

    /** */
    @Column(name = "UPDATETIME")
    LocalDateTime updatetime;

    /** */
    @Column(name = "DATA_FROM")
    String dataFrom;

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
     * Returns the wardCode.
     * 
     * @return the wardCode
     */
    public String getWardCode() {
        return wardCode;
    }

    /** 
     * Sets the wardCode.
     * 
     * @param wardCode the wardCode
     */
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    /** 
     * Returns the wardSn.
     * 
     * @return the wardSn
     */
    public String getWardSn() {
        return wardSn;
    }

    /** 
     * Sets the wardSn.
     * 
     * @param wardSn the wardSn
     */
    public void setWardSn(String wardSn) {
        this.wardSn = wardSn;
    }

    /** 
     * Returns the wardName.
     * 
     * @return the wardName
     */
    public String getWardName() {
        return wardName;
    }

    /** 
     * Sets the wardName.
     * 
     * @param wardName the wardName
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /** 
     * Returns the wardPinyin.
     * 
     * @return the wardPinyin
     */
    public String getWardPinyin() {
        return wardPinyin;
    }

    /** 
     * Sets the wardPinyin.
     * 
     * @param wardPinyin the wardPinyin
     */
    public void setWardPinyin(String wardPinyin) {
        this.wardPinyin = wardPinyin;
    }

    /** 
     * Returns the wardAbbname.
     * 
     * @return the wardAbbname
     */
    public String getWardAbbname() {
        return wardAbbname;
    }

    /** 
     * Sets the wardAbbname.
     * 
     * @param wardAbbname the wardAbbname
     */
    public void setWardAbbname(String wardAbbname) {
        this.wardAbbname = wardAbbname;
    }

    /** 
     * Returns the wardAlias.
     * 
     * @return the wardAlias
     */
    public String getWardAlias() {
        return wardAlias;
    }

    /** 
     * Sets the wardAlias.
     * 
     * @param wardAlias the wardAlias
     */
    public void setWardAlias(String wardAlias) {
        this.wardAlias = wardAlias;
    }

    /** 
     * Returns the orderNo.
     * 
     * @return the orderNo
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /** 
     * Sets the orderNo.
     * 
     * @param orderNo the orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /** 
     * Returns the wardCategories.
     * 
     * @return the wardCategories
     */
    public String getWardCategories() {
        return wardCategories;
    }

    /** 
     * Sets the wardCategories.
     * 
     * @param wardCategories the wardCategories
     */
    public void setWardCategories(String wardCategories) {
        this.wardCategories = wardCategories;
    }

    /** 
     * Returns the atHospital.
     * 
     * @return the atHospital
     */
    public String getAtHospital() {
        return atHospital;
    }

    /** 
     * Sets the atHospital.
     * 
     * @param atHospital the atHospital
     */
    public void setAtHospital(String atHospital) {
        this.atHospital = atHospital;
    }

    /** 
     * Returns the atWard.
     * 
     * @return the atWard
     */
    public String getAtWard() {
        return atWard;
    }

    /** 
     * Sets the atWard.
     * 
     * @param atWard the atWard
     */
    public void setAtWard(String atWard) {
        this.atWard = atWard;
    }

    /** 
     * Returns the district.
     * 
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /** 
     * Sets the district.
     * 
     * @param district the district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /** 
     * Returns the headerUuid.
     * 
     * @return the headerUuid
     */
    public String getHeaderUuid() {
        return headerUuid;
    }

    /** 
     * Sets the headerUuid.
     * 
     * @param headerUuid the headerUuid
     */
    public void setHeaderUuid(String headerUuid) {
        this.headerUuid = headerUuid;
    }

    /** 
     * Returns the isentity.
     * 
     * @return the isentity
     */
    public Boolean getIsentity() {
        return isentity;
    }

    /** 
     * Sets the isentity.
     * 
     * @param isentity the isentity
     */
    public void setIsentity(Boolean isentity) {
        this.isentity = isentity;
    }

    /** 
     * Returns the iscostcenter.
     * 
     * @return the iscostcenter
     */
    public Boolean getIscostcenter() {
        return iscostcenter;
    }

    /** 
     * Sets the iscostcenter.
     * 
     * @param iscostcenter the iscostcenter
     */
    public void setIscostcenter(Boolean iscostcenter) {
        this.iscostcenter = iscostcenter;
    }

    /** 
     * Returns the isincomecenter.
     * 
     * @return the isincomecenter
     */
    public Boolean getIsincomecenter() {
        return isincomecenter;
    }

    /** 
     * Sets the isincomecenter.
     * 
     * @param isincomecenter the isincomecenter
     */
    public void setIsincomecenter(Boolean isincomecenter) {
        this.isincomecenter = isincomecenter;
    }

    /** 
     * Returns the isavaliable.
     * 
     * @return the isavaliable
     */
    public Boolean getIsavaliable() {
        return isavaliable;
    }

    /** 
     * Sets the isavaliable.
     * 
     * @param isavaliable the isavaliable
     */
    public void setIsavaliable(Boolean isavaliable) {
        this.isavaliable = isavaliable;
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
     * Returns the isDroped.
     * 
     * @return the isDroped
     */
    public Boolean getIsDroped() {
        return isDroped;
    }

    /** 
     * Sets the isDroped.
     * 
     * @param isDroped the isDroped
     */
    public void setIsDroped(Boolean isDroped) {
        this.isDroped = isDroped;
    }

    /** 
     * Returns the effectTime.
     * 
     * @return the effectTime
     */
    public LocalDate getEffectTime() {
        return effectTime;
    }

    /** 
     * Sets the effectTime.
     * 
     * @param effectTime the effectTime
     */
    public void setEffectTime(LocalDate effectTime) {
        this.effectTime = effectTime;
    }

    /** 
     * Returns the closeTime.
     * 
     * @return the closeTime
     */
    public LocalDateTime getCloseTime() {
        return closeTime;
    }

    /** 
     * Sets the closeTime.
     * 
     * @param closeTime the closeTime
     */
    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
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
     * Returns the dataFrom.
     * 
     * @return the dataFrom
     */
    public String getDataFrom() {
        return dataFrom;
    }

    /** 
     * Sets the dataFrom.
     * 
     * @param dataFrom the dataFrom
     */
    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }
}