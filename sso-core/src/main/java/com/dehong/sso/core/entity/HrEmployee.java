package com.dehong.sso.core.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "hr_employee")
public class HrEmployee {

    /** */
    @Column(name = "UUID")
    String uuid;

    /** */
    @Column(name = "NAME")
    String name;

    /** */
    @Column(name = "DISPLAYNAME")
    String displayname;

    /** */
    @Column(name = "PINYIN")
    String pinyin;

    /** */
    @Column(name = "IS_DROPED")
    Boolean isDroped;

    /** */
    @Column(name = "GENDER")
    String gender;

    /** */
    @Column(name = "CODE")
    String code;

    /** */
    @Column(name = "SN")
    String sn;

    /** */
    @Column(name = "HOSPATIL")
    String hospatil;

    /** */
    @Column(name = "DISTRICT")
    String district;

    /** */
    @Column(name = "DEPT_UUID")
    String deptUuid;

    /** */
    @Column(name = "DEPT_NAME")
    String deptName;

    /** */
    @Column(name = "WARD_UUID")
    String wardUuid;

    /** */
    @Column(name = "WARD_NAME")
    String wardName;

    /** */
    @Column(name = "PART_DEPT_UUID")
    String partDeptUuid;

    /** */
    @Column(name = "PART_DEPT_NAME")
    String partDeptName;

    /** */
    @Column(name = "SUPER_UUID")
    String superUuid;

    /** */
    @Column(name = "ON_THE_JOB")
    String onTheJob;

    /** */
    @Column(name = "ORGANIZATION_CATEGORY")
    String organizationCategory;

    /** */
    @Column(name = "TITLE")
    String title;

    /** */
    @Column(name = "JOB_CATEGORY")
    String jobCategory;

    /** */
    @Column(name = "JOB_LEVEL")
    String jobLevel;

    /** */
    @Column(name = "JOB_NAME")
    String jobName;

    /** */
    @Column(name = "OCCUPATION_CATEGORY")
    String occupationCategory;

    /** */
    @Column(name = "OCCUPATION_LEVEL")
    String occupationLevel;

    /** */
    @Column(name = "OCCUPATION_NAME")
    String occupationName;

    /** */
    @Column(name = "POSTS_CATEGORIES")
    String postsCategories;

    /** */
    @Column(name = "POSITION")
    String position;

    /** */
    @Column(name = "TYPE_OF_WORK")
    String typeOfWork;

    /** */
    @Column(name = "LABOR_FORM")
    String laborForm;

    /** */
    @Column(name = "USED_NAME")
    String usedName;

    /** */
    @Column(name = "BIRTHDAY")
    LocalDate birthday;

    /** */
    @Column(name = "IDENTITY_NO")
    String identityNo;

    /** */
    @Column(name = "NATIVE")
    String native1;

    /** */
    @Column(name = "PRESENT_ADDRESS")
    String presentAddress;

    /** */
    @Column(name = "PRESENT_ADDRESS_POSTCODE")
    String presentAddressPostcode;

    /** */
    @Column(name = "HKSZD")
    String hkszd;

    /** */
    @Column(name = "BIRTH_PLACE")
    String birthPlace;

    /** */
    @Column(name = "HEALTH")
    String health;

    /** */
    @Column(name = "BLOODTYPE")
    String bloodtype;

    /** */
    @Column(name = "NATION")
    String nation;

    /** */
    @Column(name = "MARITAL_STATUS")
    String maritalStatus;

    /** */
    @Column(name = "MOBILE_PHONE")
    String mobilePhone;

    /** */
    @Column(name = "WORK_PHONE")
    String workPhone;

    /** */
    @Column(name = "HOME_TELEPHONE")
    String homeTelephone;

    /** */
    @Column(name = "FAX")
    String fax;

    /** */
    @Column(name = "WXHM")
    String wxhm;

    /** */
    @Column(name = "QQHM")
    String qqhm;

    /** */
    @Column(name = "EMAIL")
    String email;

    /** */
    @Column(name = "LXR")
    String lxr;

    /** */
    @Column(name = "LXR_ZJ")
    String lxrZj;

    /** */
    @Column(name = "LXR_SJ")
    String lxrSj;

    /** */
    @Column(name = "LXR_GX")
    String lxrGx;

    /** */
    @Column(name = "LXR_ZZ")
    String lxrZz;

    /** */
    @Column(name = "CJGZSJ")
    LocalDate cjgzsj;

    /** */
    @Column(name = "RZSJ")
    LocalDate rzsj;

    /** */
    @Column(name = "ZZSJ")
    LocalDate zzsj;

    /** */
    @Column(name = "CADRES_IDENTITY")
    String cadresIdentity;

    /** */
    @Column(name = "XCSZY")
    String xcszy;

    /** */
    @Column(name = "JYGWJL")
    String jygwjl;

    /** */
    @Column(name = "BYSJ")
    LocalDate bysj;

    /** */
    @Column(name = "EDUCATION")
    String education;

    /** */
    @Column(name = "DEGREE")
    String degree;

    /** */
    @Column(name = "SCHOOL_LENGTH")
    String schoolLength;

    /** */
    @Column(name = "BYXX")
    String byxx;

    /** */
    @Column(name = "MAJOR")
    String major;

    /** */
    @Column(name = "PARTY")
    String party;

    /** */
    @Column(name = "PARTY_DATE")
    LocalDate partyDate;

    /** */
    @Column(name = "CJDPSSZDW")
    String cjdpsszdw;

    /** */
    @Column(name = "LTXSJ")
    LocalDate ltxsj;

    /** */
    @Column(name = "RETIRE_CATEGORY")
    String retireCategory;

    /** */
    @Column(name = "BRIDGE_CONDITION")
    String bridgeCondition;

    /** */
    @Column(name = "REMARK")
    String remark;

    /** */
    @Column(name = "DESCRIPTION")
    String description;

    /** */
    @Column(name = "CREATETIME")
    LocalDateTime createtime;

    /** */
    @Column(name = "UPDATETIME")
    LocalDateTime updatetime;

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
     * Returns the displayname.
     * 
     * @return the displayname
     */
    public String getDisplayname() {
        return displayname;
    }

    /** 
     * Sets the displayname.
     * 
     * @param displayname the displayname
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /** 
     * Returns the pinyin.
     * 
     * @return the pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /** 
     * Sets the pinyin.
     * 
     * @param pinyin the pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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
     * Returns the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /** 
     * Sets the gender.
     * 
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** 
     * Returns the code.
     * 
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /** 
     * Sets the code.
     * 
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Returns the sn.
     * 
     * @return the sn
     */
    public String getSn() {
        return sn;
    }

    /** 
     * Sets the sn.
     * 
     * @param sn the sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /** 
     * Returns the hospatil.
     * 
     * @return the hospatil
     */
    public String getHospatil() {
        return hospatil;
    }

    /** 
     * Sets the hospatil.
     * 
     * @param hospatil the hospatil
     */
    public void setHospatil(String hospatil) {
        this.hospatil = hospatil;
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
     * Returns the deptUuid.
     * 
     * @return the deptUuid
     */
    public String getDeptUuid() {
        return deptUuid;
    }

    /** 
     * Sets the deptUuid.
     * 
     * @param deptUuid the deptUuid
     */
    public void setDeptUuid(String deptUuid) {
        this.deptUuid = deptUuid;
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
     * Returns the wardUuid.
     * 
     * @return the wardUuid
     */
    public String getWardUuid() {
        return wardUuid;
    }

    /** 
     * Sets the wardUuid.
     * 
     * @param wardUuid the wardUuid
     */
    public void setWardUuid(String wardUuid) {
        this.wardUuid = wardUuid;
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
     * Returns the partDeptUuid.
     * 
     * @return the partDeptUuid
     */
    public String getPartDeptUuid() {
        return partDeptUuid;
    }

    /** 
     * Sets the partDeptUuid.
     * 
     * @param partDeptUuid the partDeptUuid
     */
    public void setPartDeptUuid(String partDeptUuid) {
        this.partDeptUuid = partDeptUuid;
    }

    /** 
     * Returns the partDeptName.
     * 
     * @return the partDeptName
     */
    public String getPartDeptName() {
        return partDeptName;
    }

    /** 
     * Sets the partDeptName.
     * 
     * @param partDeptName the partDeptName
     */
    public void setPartDeptName(String partDeptName) {
        this.partDeptName = partDeptName;
    }

    /** 
     * Returns the superUuid.
     * 
     * @return the superUuid
     */
    public String getSuperUuid() {
        return superUuid;
    }

    /** 
     * Sets the superUuid.
     * 
     * @param superUuid the superUuid
     */
    public void setSuperUuid(String superUuid) {
        this.superUuid = superUuid;
    }

    /** 
     * Returns the onTheJob.
     * 
     * @return the onTheJob
     */
    public String getOnTheJob() {
        return onTheJob;
    }

    /** 
     * Sets the onTheJob.
     * 
     * @param onTheJob the onTheJob
     */
    public void setOnTheJob(String onTheJob) {
        this.onTheJob = onTheJob;
    }

    /** 
     * Returns the organizationCategory.
     * 
     * @return the organizationCategory
     */
    public String getOrganizationCategory() {
        return organizationCategory;
    }

    /** 
     * Sets the organizationCategory.
     * 
     * @param organizationCategory the organizationCategory
     */
    public void setOrganizationCategory(String organizationCategory) {
        this.organizationCategory = organizationCategory;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the jobCategory.
     * 
     * @return the jobCategory
     */
    public String getJobCategory() {
        return jobCategory;
    }

    /** 
     * Sets the jobCategory.
     * 
     * @param jobCategory the jobCategory
     */
    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    /** 
     * Returns the jobLevel.
     * 
     * @return the jobLevel
     */
    public String getJobLevel() {
        return jobLevel;
    }

    /** 
     * Sets the jobLevel.
     * 
     * @param jobLevel the jobLevel
     */
    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    /** 
     * Returns the jobName.
     * 
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /** 
     * Sets the jobName.
     * 
     * @param jobName the jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /** 
     * Returns the occupationCategory.
     * 
     * @return the occupationCategory
     */
    public String getOccupationCategory() {
        return occupationCategory;
    }

    /** 
     * Sets the occupationCategory.
     * 
     * @param occupationCategory the occupationCategory
     */
    public void setOccupationCategory(String occupationCategory) {
        this.occupationCategory = occupationCategory;
    }

    /** 
     * Returns the occupationLevel.
     * 
     * @return the occupationLevel
     */
    public String getOccupationLevel() {
        return occupationLevel;
    }

    /** 
     * Sets the occupationLevel.
     * 
     * @param occupationLevel the occupationLevel
     */
    public void setOccupationLevel(String occupationLevel) {
        this.occupationLevel = occupationLevel;
    }

    /** 
     * Returns the occupationName.
     * 
     * @return the occupationName
     */
    public String getOccupationName() {
        return occupationName;
    }

    /** 
     * Sets the occupationName.
     * 
     * @param occupationName the occupationName
     */
    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    /** 
     * Returns the postsCategories.
     * 
     * @return the postsCategories
     */
    public String getPostsCategories() {
        return postsCategories;
    }

    /** 
     * Sets the postsCategories.
     * 
     * @param postsCategories the postsCategories
     */
    public void setPostsCategories(String postsCategories) {
        this.postsCategories = postsCategories;
    }

    /** 
     * Returns the position.
     * 
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Sets the position.
     * 
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Returns the typeOfWork.
     * 
     * @return the typeOfWork
     */
    public String getTypeOfWork() {
        return typeOfWork;
    }

    /** 
     * Sets the typeOfWork.
     * 
     * @param typeOfWork the typeOfWork
     */
    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    /** 
     * Returns the laborForm.
     * 
     * @return the laborForm
     */
    public String getLaborForm() {
        return laborForm;
    }

    /** 
     * Sets the laborForm.
     * 
     * @param laborForm the laborForm
     */
    public void setLaborForm(String laborForm) {
        this.laborForm = laborForm;
    }

    /** 
     * Returns the usedName.
     * 
     * @return the usedName
     */
    public String getUsedName() {
        return usedName;
    }

    /** 
     * Sets the usedName.
     * 
     * @param usedName the usedName
     */
    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    /** 
     * Returns the birthday.
     * 
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /** 
     * Sets the birthday.
     * 
     * @param birthday the birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /** 
     * Returns the identityNo.
     * 
     * @return the identityNo
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /** 
     * Sets the identityNo.
     * 
     * @param identityNo the identityNo
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /** 
     * Returns the native1.
     * 
     * @return the native1
     */
    public String getNative() {
        return native1;
    }

    /** 
     * Sets the native.
     * 
     * @param native1 the native1
     */
    public void setNative(String native1) {
        this.native1 = native1;
    }

    /** 
     * Returns the presentAddress.
     * 
     * @return the presentAddress
     */
    public String getPresentAddress() {
        return presentAddress;
    }

    /** 
     * Sets the presentAddress.
     * 
     * @param presentAddress the presentAddress
     */
    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    /** 
     * Returns the presentAddressPostcode.
     * 
     * @return the presentAddressPostcode
     */
    public String getPresentAddressPostcode() {
        return presentAddressPostcode;
    }

    /** 
     * Sets the presentAddressPostcode.
     * 
     * @param presentAddressPostcode the presentAddressPostcode
     */
    public void setPresentAddressPostcode(String presentAddressPostcode) {
        this.presentAddressPostcode = presentAddressPostcode;
    }

    /** 
     * Returns the hkszd.
     * 
     * @return the hkszd
     */
    public String getHkszd() {
        return hkszd;
    }

    /** 
     * Sets the hkszd.
     * 
     * @param hkszd the hkszd
     */
    public void setHkszd(String hkszd) {
        this.hkszd = hkszd;
    }

    /** 
     * Returns the birthPlace.
     * 
     * @return the birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Sets the birthPlace.
     * 
     * @param birthPlace the birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Returns the health.
     * 
     * @return the health
     */
    public String getHealth() {
        return health;
    }

    /** 
     * Sets the health.
     * 
     * @param health the health
     */
    public void setHealth(String health) {
        this.health = health;
    }

    /** 
     * Returns the bloodtype.
     * 
     * @return the bloodtype
     */
    public String getBloodtype() {
        return bloodtype;
    }

    /** 
     * Sets the bloodtype.
     * 
     * @param bloodtype the bloodtype
     */
    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    /** 
     * Returns the nation.
     * 
     * @return the nation
     */
    public String getNation() {
        return nation;
    }

    /** 
     * Sets the nation.
     * 
     * @param nation the nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /** 
     * Returns the maritalStatus.
     * 
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /** 
     * Sets the maritalStatus.
     * 
     * @param maritalStatus the maritalStatus
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /** 
     * Returns the mobilePhone.
     * 
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /** 
     * Sets the mobilePhone.
     * 
     * @param mobilePhone the mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /** 
     * Returns the workPhone.
     * 
     * @return the workPhone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /** 
     * Sets the workPhone.
     * 
     * @param workPhone the workPhone
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /** 
     * Returns the homeTelephone.
     * 
     * @return the homeTelephone
     */
    public String getHomeTelephone() {
        return homeTelephone;
    }

    /** 
     * Sets the homeTelephone.
     * 
     * @param homeTelephone the homeTelephone
     */
    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    /** 
     * Returns the fax.
     * 
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Sets the fax.
     * 
     * @param fax the fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Returns the wxhm.
     * 
     * @return the wxhm
     */
    public String getWxhm() {
        return wxhm;
    }

    /** 
     * Sets the wxhm.
     * 
     * @param wxhm the wxhm
     */
    public void setWxhm(String wxhm) {
        this.wxhm = wxhm;
    }

    /** 
     * Returns the qqhm.
     * 
     * @return the qqhm
     */
    public String getQqhm() {
        return qqhm;
    }

    /** 
     * Sets the qqhm.
     * 
     * @param qqhm the qqhm
     */
    public void setQqhm(String qqhm) {
        this.qqhm = qqhm;
    }

    /** 
     * Returns the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Sets the email.
     * 
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Returns the lxr.
     * 
     * @return the lxr
     */
    public String getLxr() {
        return lxr;
    }

    /** 
     * Sets the lxr.
     * 
     * @param lxr the lxr
     */
    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    /** 
     * Returns the lxrZj.
     * 
     * @return the lxrZj
     */
    public String getLxrZj() {
        return lxrZj;
    }

    /** 
     * Sets the lxrZj.
     * 
     * @param lxrZj the lxrZj
     */
    public void setLxrZj(String lxrZj) {
        this.lxrZj = lxrZj;
    }

    /** 
     * Returns the lxrSj.
     * 
     * @return the lxrSj
     */
    public String getLxrSj() {
        return lxrSj;
    }

    /** 
     * Sets the lxrSj.
     * 
     * @param lxrSj the lxrSj
     */
    public void setLxrSj(String lxrSj) {
        this.lxrSj = lxrSj;
    }

    /** 
     * Returns the lxrGx.
     * 
     * @return the lxrGx
     */
    public String getLxrGx() {
        return lxrGx;
    }

    /** 
     * Sets the lxrGx.
     * 
     * @param lxrGx the lxrGx
     */
    public void setLxrGx(String lxrGx) {
        this.lxrGx = lxrGx;
    }

    /** 
     * Returns the lxrZz.
     * 
     * @return the lxrZz
     */
    public String getLxrZz() {
        return lxrZz;
    }

    /** 
     * Sets the lxrZz.
     * 
     * @param lxrZz the lxrZz
     */
    public void setLxrZz(String lxrZz) {
        this.lxrZz = lxrZz;
    }

    /** 
     * Returns the cjgzsj.
     * 
     * @return the cjgzsj
     */
    public LocalDate getCjgzsj() {
        return cjgzsj;
    }

    /** 
     * Sets the cjgzsj.
     * 
     * @param cjgzsj the cjgzsj
     */
    public void setCjgzsj(LocalDate cjgzsj) {
        this.cjgzsj = cjgzsj;
    }

    /** 
     * Returns the rzsj.
     * 
     * @return the rzsj
     */
    public LocalDate getRzsj() {
        return rzsj;
    }

    /** 
     * Sets the rzsj.
     * 
     * @param rzsj the rzsj
     */
    public void setRzsj(LocalDate rzsj) {
        this.rzsj = rzsj;
    }

    /** 
     * Returns the zzsj.
     * 
     * @return the zzsj
     */
    public LocalDate getZzsj() {
        return zzsj;
    }

    /** 
     * Sets the zzsj.
     * 
     * @param zzsj the zzsj
     */
    public void setZzsj(LocalDate zzsj) {
        this.zzsj = zzsj;
    }

    /** 
     * Returns the cadresIdentity.
     * 
     * @return the cadresIdentity
     */
    public String getCadresIdentity() {
        return cadresIdentity;
    }

    /** 
     * Sets the cadresIdentity.
     * 
     * @param cadresIdentity the cadresIdentity
     */
    public void setCadresIdentity(String cadresIdentity) {
        this.cadresIdentity = cadresIdentity;
    }

    /** 
     * Returns the xcszy.
     * 
     * @return the xcszy
     */
    public String getXcszy() {
        return xcszy;
    }

    /** 
     * Sets the xcszy.
     * 
     * @param xcszy the xcszy
     */
    public void setXcszy(String xcszy) {
        this.xcszy = xcszy;
    }

    /** 
     * Returns the jygwjl.
     * 
     * @return the jygwjl
     */
    public String getJygwjl() {
        return jygwjl;
    }

    /** 
     * Sets the jygwjl.
     * 
     * @param jygwjl the jygwjl
     */
    public void setJygwjl(String jygwjl) {
        this.jygwjl = jygwjl;
    }

    /** 
     * Returns the bysj.
     * 
     * @return the bysj
     */
    public LocalDate getBysj() {
        return bysj;
    }

    /** 
     * Sets the bysj.
     * 
     * @param bysj the bysj
     */
    public void setBysj(LocalDate bysj) {
        this.bysj = bysj;
    }

    /** 
     * Returns the education.
     * 
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /** 
     * Sets the education.
     * 
     * @param education the education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /** 
     * Returns the degree.
     * 
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /** 
     * Sets the degree.
     * 
     * @param degree the degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /** 
     * Returns the schoolLength.
     * 
     * @return the schoolLength
     */
    public String getSchoolLength() {
        return schoolLength;
    }

    /** 
     * Sets the schoolLength.
     * 
     * @param schoolLength the schoolLength
     */
    public void setSchoolLength(String schoolLength) {
        this.schoolLength = schoolLength;
    }

    /** 
     * Returns the byxx.
     * 
     * @return the byxx
     */
    public String getByxx() {
        return byxx;
    }

    /** 
     * Sets the byxx.
     * 
     * @param byxx the byxx
     */
    public void setByxx(String byxx) {
        this.byxx = byxx;
    }

    /** 
     * Returns the major.
     * 
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /** 
     * Sets the major.
     * 
     * @param major the major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /** 
     * Returns the party.
     * 
     * @return the party
     */
    public String getParty() {
        return party;
    }

    /** 
     * Sets the party.
     * 
     * @param party the party
     */
    public void setParty(String party) {
        this.party = party;
    }

    /** 
     * Returns the partyDate.
     * 
     * @return the partyDate
     */
    public LocalDate getPartyDate() {
        return partyDate;
    }

    /** 
     * Sets the partyDate.
     * 
     * @param partyDate the partyDate
     */
    public void setPartyDate(LocalDate partyDate) {
        this.partyDate = partyDate;
    }

    /** 
     * Returns the cjdpsszdw.
     * 
     * @return the cjdpsszdw
     */
    public String getCjdpsszdw() {
        return cjdpsszdw;
    }

    /** 
     * Sets the cjdpsszdw.
     * 
     * @param cjdpsszdw the cjdpsszdw
     */
    public void setCjdpsszdw(String cjdpsszdw) {
        this.cjdpsszdw = cjdpsszdw;
    }

    /** 
     * Returns the ltxsj.
     * 
     * @return the ltxsj
     */
    public LocalDate getLtxsj() {
        return ltxsj;
    }

    /** 
     * Sets the ltxsj.
     * 
     * @param ltxsj the ltxsj
     */
    public void setLtxsj(LocalDate ltxsj) {
        this.ltxsj = ltxsj;
    }

    /** 
     * Returns the retireCategory.
     * 
     * @return the retireCategory
     */
    public String getRetireCategory() {
        return retireCategory;
    }

    /** 
     * Sets the retireCategory.
     * 
     * @param retireCategory the retireCategory
     */
    public void setRetireCategory(String retireCategory) {
        this.retireCategory = retireCategory;
    }

    /** 
     * Returns the bridgeCondition.
     * 
     * @return the bridgeCondition
     */
    public String getBridgeCondition() {
        return bridgeCondition;
    }

    /** 
     * Sets the bridgeCondition.
     * 
     * @param bridgeCondition the bridgeCondition
     */
    public void setBridgeCondition(String bridgeCondition) {
        this.bridgeCondition = bridgeCondition;
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