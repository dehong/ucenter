package com.dehong.sso.core.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "t_org_dept")
public class OrgDept {

    /** */
    @Column(name = "id")
    Long id;

    /** */
    @Column(name = "dept_code")
    String deptCode;

    /** */
    @Column(name = "dept_sn")
    String deptSn;

    /** */
    @Column(name = "dept_name")
    String deptName;

    /** */
    @Column(name = "dept_pinyin")
    String deptPinyin;

    /** */
    @Column(name = "dept_abbname")
    String deptAbbname;

    /** */
    @Column(name = "dept_alias")
    String deptAlias;

    /** */
    @Column(name = "dept_leve")
    Integer deptLeve;

    /** */
    @Column(name = "dept_inner_leve")
    Integer deptInnerLeve;

    /** */
    @Column(name = "order_no")
    Integer orderNo;

    /** */
    @Column(name = "dept_categories")
    String deptCategories;

    /** */
    @Column(name = "parent")
    String parent;

    /** */
    @Column(name = "at_hospital")
    String atHospital;

    /** */
    @Column(name = "at_ward")
    String atWard;

    /** */
    @Column(name = "district")
    String district;

    /** */
    @Column(name = "header_uuid")
    String headerUuid;

    /** */
    @Column(name = "isentity")
    Boolean isentity;

    /** */
    @Column(name = "iscostcenter")
    Boolean iscostcenter;

    /** */
    @Column(name = "isincomecenter")
    Boolean isincomecenter;

    /** */
    @Column(name = "erp_code")
    String erpCode;

    /** */
    @Column(name = "isavaliable")
    Boolean isavaliable;

    /** */
    @Column(name = "remark")
    String remark;

    /** */
    @Column(name = "description")
    String description;

    /** */
    @Column(name = "delete_falg")
    Boolean deleteFalg;

    /** */
    @Column(name = "effect_time")
    LocalDate effectTime;

    /** */
    @Column(name = "close_time")
    LocalDate closeTime;

    /** */
    @Column(name = "createtime")
    LocalDateTime createtime;

    /** */
    @Column(name = "updatetime")
    LocalDateTime updatetime;

    /** */
    @Column(name = "data_from")
    String dataFrom;

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
     * Returns the parent.
     * 
     * @return the parent
     */
    public String getParent() {
        return parent;
    }

    /** 
     * Sets the parent.
     * 
     * @param parent the parent
     */
    public void setParent(String parent) {
        this.parent = parent;
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
     * Returns the deleteFalg.
     * 
     * @return the deleteFalg
     */
    public Boolean getDeleteFalg() {
        return deleteFalg;
    }

    /** 
     * Sets the deleteFalg.
     * 
     * @param deleteFalg the deleteFalg
     */
    public void setDeleteFalg(Boolean deleteFalg) {
        this.deleteFalg = deleteFalg;
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