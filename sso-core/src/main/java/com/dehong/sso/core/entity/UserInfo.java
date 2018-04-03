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
@Table(name = "t_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 8608946129104302338L;
    /**  */
    @Id
    @Column(name = "id")
    private Long id;

    /**  */
    @Column(name = "name")
    private String name;

    /**  */
    @Column(name = "displayname")
    private String displayname;

    /**  */
    @Column(name = "pinyin")
    private String pinyin;

    /**  */
    @Column(name = "gender")
    private Byte gender;

    /**  */
    @Column(name = "code")
    private String code;

    /**  */
    @Column(name = "sn")
    private String sn;

    /**  */
    @Column(name = "email")
    private String email;

    /**  */
    @Column(name = "phone")
    private String phone;

    /**  */
    @Column(name = "hospatil")
    private String hospatil;

    /**  */
    @Column(name = "district")
    private String district;

    /**  */
    @Column(name = "dept_id")
    private String deptId;

    /**  */
    @Column(name = "dept_name")
    private String deptName;

    /**  */
    @Column(name = "ward_id")
    private String wardId;

    /**  */
    @Column(name = "ward_name")
    private String wardName;

    /**  */
    @Column(name = "part_dept_id")
    private String partDeptId;

    /**  */
    @Column(name = "part_dept_name")
    private String partDeptName;

    /**  */
    @Column(name = "super_id")
    private String superId;

    /**  */
    @Column(name = "on_the_job")
    private String onTheJob;

    /**  */
    @Column(name = "organization_category")
    private String organizationCategory;

    /**  */
    @Column(name = "title")
    private String title;

    /**  */
    @Column(name = "job_category")
    private String jobCategory;

    /**  */
    @Column(name = "job_level")
    private String jobLevel;

    /**  */
    @Column(name = "job_name")
    private String jobName;

    /**  */
    @Column(name = "occupation_category")
    private String occupationCategory;

    /**  */
    @Column(name = "occupation_level")
    private String occupationLevel;

    /**  */
    @Column(name = "occupation_name")
    private String occupationName;

    /**  */
    @Column(name = "posts_categories")
    private String postsCategories;

    /**  */
    @Column(name = "position")
    private String position;

    /**  */
    @Column(name = "type_of_work")
    private String typeOfWork;

    /**  */
    @Column(name = "labor_form")
    private String laborForm;

    /**  */
    @Column(name = "used_name")
    private String usedName;

    /**  */
    @Column(name = "birthday")
    private LocalDate birthday;

    /**  */
    @Column(name = "identity_no")
    private String identityNo;

    /**  */
    @Column(name = "native")
    private String nativeFiled;

    /**  */
    @Column(name = "present_address")
    private String presentAddress;

    /**  */
    @Column(name = "present_address_postcode")
    private String presentAddressPostcode;

    /**  */
    @Column(name = "hkszd")
    private String hkszd;

    /**  */
    @Column(name = "birth_place")
    private String birthPlace;

    /**  */
    @Column(name = "health")
    private String health;

    /**  */
    @Column(name = "bloodtype")
    private String bloodtype;

    /**  */
    @Column(name = "nation")
    private String nation;

    /**  */
    @Column(name = "marital_status")
    private String maritalStatus;

    /**  */
    @Column(name = "work_phone")
    private String workPhone;

    /**  */
    @Column(name = "home_telephone")
    private String homeTelephone;

    /**  */
    @Column(name = "fax")
    private String fax;

    /**  */
    @Column(name = "wxhm")
    private String wxhm;

    /**  */
    @Column(name = "qqhm")
    private String qqhm;

    /**  */
    @Column(name = "lxr")
    private String lxr;

    /**  */
    @Column(name = "lxr_zj")
    private String lxrZj;

    /**  */
    @Column(name = "lxr_sj")
    private String lxrSj;

    /**  */
    @Column(name = "lxr_gx")
    private String lxrGx;

    /**  */
    @Column(name = "lxr_zz")
    private String lxrZz;

    /**  */
    @Column(name = "cjgzsj")
    private LocalDate cjgzsj;

    /**  */
    @Column(name = "rzsj")
    private LocalDate rzsj;

    /**  */
    @Column(name = "zzsj")
    private LocalDate zzsj;

    /**  */
    @Column(name = "cadres_identity")
    private String cadresIdentity;

    /**  */
    @Column(name = "xcszy")
    private String xcszy;

    /**  */
    @Column(name = "jygwjl")
    private String jygwjl;

    /**  */
    @Column(name = "bysj")
    private LocalDate bysj;

    /**  */
    @Column(name = "education")
    private String education;

    /**  */
    @Column(name = "degree")
    private String degree;

    /**  */
    @Column(name = "school_length")
    private String schoolLength;

    /**  */
    @Column(name = "byxx")
    private String byxx;

    /**  */
    @Column(name = "major")
    private String major;

    /**  */
    @Column(name = "party")
    private String party;

    /**  */
    @Column(name = "party_date")
    private LocalDate partyDate;

    /**  */
    @Column(name = "cjdpsszdw")
    private String cjdpsszdw;

    /**  */
    @Column(name = "ltxsj")
    private LocalDate ltxsj;

    /**  */
    @Column(name = "retire_category")
    private String retireCategory;

    /**  */
    @Column(name = "bridge_condition")
    private String bridgeCondition;

    /**  */
    @Column(name = "desc")
    private String desc;

    /**  */
    @Column(name = "delete_falg")
    private Boolean deleteFalg;

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
     * Returns the gender.
     *
     * @return the gender
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     *
     * @param gender the gender
     */
    public void setGender(Byte gender) {
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
     * Returns the phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * Returns the deptId.
     *
     * @return the deptId
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * Sets the deptId.
     *
     * @param deptId the deptId
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
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
     * Returns the wardId.
     *
     * @return the wardId
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * Sets the wardId.
     *
     * @param wardId the wardId
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
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
     * Returns the partDeptId.
     *
     * @return the partDeptId
     */
    public String getPartDeptId() {
        return partDeptId;
    }

    /**
     * Sets the partDeptId.
     *
     * @param partDeptId the partDeptId
     */
    public void setPartDeptId(String partDeptId) {
        this.partDeptId = partDeptId;
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
     * Returns the superId.
     *
     * @return the superId
     */
    public String getSuperId() {
        return superId;
    }

    /**
     * Sets the superId.
     *
     * @param superId the superId
     */
    public void setSuperId(String superId) {
        this.superId = superId;
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
     * Returns the nativeFiled.
     *
     * @return the nativeFiled
     */
    public String getNativeFiled() {
        return nativeFiled;
    }

    /**
     * Sets the native.
     *
     * @param nativeFiled the nativeFiled
     */
    public void setNativeFiled(String nativeFiled) {
        this.nativeFiled = nativeFiled;
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
     * Returns the desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
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