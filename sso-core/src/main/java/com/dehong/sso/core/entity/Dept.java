package com.dehong.sso.core.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "org_dept")
public class Dept {

    /** */
    @Column(name = "UUID")
    String uuid;

    /** */
    @Column(name = "DEPT_CODE")
    String deptCode;

    /** */
    @Column(name = "DEPT_SN")
    String deptSn;

    /** */
    @Column(name = "DEPT_NAME")
    String deptName;

    /** */
    @Column(name = "DEPT_PINYIN")
    String deptPinyin;

    /** */
    @Column(name = "DEPT_ABBNAME")
    String deptAbbname;

    /** */
    @Column(name = "DEPT_ALIAS")
    String deptAlias;

    /** */
    @Column(name = "DEPT_LEVE")
    Integer deptLeve;

    /** */
    @Column(name = "DEPT_INNER_LEVE")
    Integer deptInnerLeve;

    /** */
    @Column(name = "ORDER_NO")
    Integer orderNo;

    /** */
    @Column(name = "DEPT_CATEGORIES")
    String deptCategories;

    /** */
    @Column(name = "PAR_UUID")
    String parUuid;

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
    @Column(name = "ERP_CODE")
    String erpCode;

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
    LocalDate closeTime;

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
     * Returns the deptCode.
     * 
     * @return the deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    /** 
     * Sets the deptCode.
     * 
     * @param deptCode the deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /** 
     * Returns the deptSn.
     * 
     * @return the deptSn
     */
    public String getDeptSn() {
        return deptSn;
    }

    /** 
     * Sets the deptSn.
     * 
     * @param deptSn the deptSn
     */
    public void setDeptSn(String deptSn) {
        this.deptSn = deptSn;
    }

    /** 
     * Returns the deptName.
     * 
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /** 
     * Sets the deptName.
     * 
     * @param deptName the deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** 
     * Returns the deptPinyin.
     * 
     * @return the deptPinyin
     */
    public String getDeptPinyin() {
        return deptPinyin;
    }

    /** 
     * Sets the deptPinyin.
     * 
     * @param deptPinyin the deptPinyin
     */
    public void setDeptPinyin(String deptPinyin) {
        this.deptPinyin = deptPinyin;
    }

    /** 
     * Returns the deptAbbname.
     * 
     * @return the deptAbbname
     */
    public String getDeptAbbname() {
        return deptAbbname;
    }

    /** 
     * Sets the deptAbbname.
     * 
     * @param deptAbbname the deptAbbname
     */
    public void setDeptAbbname(String deptAbbname) {
        this.deptAbbname = deptAbbname;
    }

    /** 
     * Returns the deptAlias.
     * 
     * @return the deptAlias
     */
    public String getDeptAlias() {
        return deptAlias;
    }

    /** 
     * Sets the deptAlias.
     * 
     * @param deptAlias the deptAlias
     */
    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    /** 
     * Returns the deptLeve.
     * 
     * @return the deptLeve
     */
    public Integer getDeptLeve() {
        return deptLeve;
    }

    /** 
     * Sets the deptLeve.
     * 
     * @param deptLeve the deptLeve
     */
    public void setDeptLeve(Integer deptLeve) {
        this.deptLeve = deptLeve;
    }

    /** 
     * Returns the deptInnerLeve.
     * 
     * @return the deptInnerLeve
     */
    public Integer getDeptInnerLeve() {
        return deptInnerLeve;
    }

    /** 
     * Sets the deptInnerLeve.
     * 
     * @param deptInnerLeve the deptInnerLeve
     */
    public void setDeptInnerLeve(Integer deptInnerLeve) {
        this.deptInnerLeve = deptInnerLeve;
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
     * Returns the deptCategories.
     * 
     * @return the deptCategories
     */
    public String getDeptCategories() {
        return deptCategories;
    }

    /** 
     * Sets the deptCategories.
     * 
     * @param deptCategories the deptCategories
     */
    public void setDeptCategories(String deptCategories) {
        this.deptCategories = deptCategories;
    }

    /** 
     * Returns the parUuid.
     * 
     * @return the parUuid
     */
    public String getParUuid() {
        return parUuid;
    }

    /** 
     * Sets the parUuid.
     * 
     * @param parUuid the parUuid
     */
    public void setParUuid(String parUuid) {
        this.parUuid = parUuid;
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
     * Returns the erpCode.
     * 
     * @return the erpCode
     */
    public String getErpCode() {
        return erpCode;
    }

    /** 
     * Sets the erpCode.
     * 
     * @param erpCode the erpCode
     */
    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
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
    public LocalDate getCloseTime() {
        return closeTime;
    }

    /** 
     * Sets the closeTime.
     * 
     * @param closeTime the closeTime
     */
    public void setCloseTime(LocalDate closeTime) {
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