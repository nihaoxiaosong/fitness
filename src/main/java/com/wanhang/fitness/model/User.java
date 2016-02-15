package com.wanhang.fitness.model;

import java.util.Date;
import java.util.List;

/**
 * 用户表
 * 
 * @author song
 *
 */
public class User {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 用户代码
	 */
	private String userCode;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 场馆id
	 */
	private Integer venueId;
	/**
	 * 场馆名称
	 */
	private String venueName;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 性别 0男，1女
	 */
	private Integer sex;
	/**
	 * 婚姻状况 0未婚，1已婚
	 */
	private Integer marriage;
	/**
	 * 身份证
	 */
	private String IDCard;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 家庭住址
	 */
	private String address;
	/**
	 * 就职状态 0在职，1离职
	 */
	private Integer workStatus;
	/**
	 * 入职日期
	 */
	private Date workBeginDate;
	/**
	 * 离职日期
	 */
	private Date workEndDate;
	/**
	 * 银行卡号
	 */
	private String bankCardCode;
	/**
	 * 衣服尺寸
	 */
	private String clothesSize;
	/**
	 * 裤子尺寸
	 */
	private String trousersSize;
	/**
	 * 鞋子尺寸
	 */
	private String shoesSize;
	/**
	 * 工作年限
	 */
	private Integer workYear;
	/**
	 * 毕业学校
	 */
	private String graduatedSchool;
	/**
	 * 专业
	 */
	private String specialty;
	/**
	 * 毕业日期
	 */
	private Date graduatedDate;
	/**
	 * 学历
	 */
	private String educationalBackground;
	/**
	 * 籍贯
	 */
	private String hometown;
	/**
	 * 户口所在地
	 */
	private String residence;
	/**
	 * 职称
	 */
	private String career;
	/**
	 * 证书号
	 */
	private String certificateNo;
	/**
	 * 证书编号
	 */
	private String certificateCode;
	/**
	 * 快捷入口
	 */
	private List<Shortcut> shortcutList;
	/**
	 * 用户关联的角色
	 */
	private List<UserRole> userRoleList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getVenueId() {
		return venueId;
	}

	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getMarriage() {
		return marriage;
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
	}

	public Date getWorkBeginDate() {
		return workBeginDate;
	}

	public void setWorkBeginDate(Date workBeginDate) {
		this.workBeginDate = workBeginDate;
	}

	public Date getWorkEndDate() {
		return workEndDate;
	}

	public void setWorkEndDate(Date workEndDate) {
		this.workEndDate = workEndDate;
	}

	public String getBankCardCode() {
		return bankCardCode;
	}

	public void setBankCardCode(String bankCardCode) {
		this.bankCardCode = bankCardCode;
	}

	public String getClothesSize() {
		return clothesSize;
	}

	public void setClothesSize(String clothesSize) {
		this.clothesSize = clothesSize;
	}

	public String getTrousersSize() {
		return trousersSize;
	}

	public void setTrousersSize(String trousersSize) {
		this.trousersSize = trousersSize;
	}

	public String getShoesSize() {
		return shoesSize;
	}

	public void setShoesSize(String shoesSize) {
		this.shoesSize = shoesSize;
	}

	public Integer getWorkYear() {
		return workYear;
	}

	public void setWorkYear(Integer workYear) {
		this.workYear = workYear;
	}

	public String getGraduatedSchool() {
		return graduatedSchool;
	}

	public void setGraduatedSchool(String graduatedSchool) {
		this.graduatedSchool = graduatedSchool;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Date getGraduatedDate() {
		return graduatedDate;
	}

	public void setGraduatedDate(Date graduatedDate) {
		this.graduatedDate = graduatedDate;
	}

	public String getEducationalBackground() {
		return educationalBackground;
	}

	public void setEducationalBackground(String educationalBackground) {
		this.educationalBackground = educationalBackground;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateCode() {
		return certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public List<UserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public List<Shortcut> getShortcutList() {
		return shortcutList;
	}

	public void setShortcutList(List<Shortcut> shortcutList) {
		this.shortcutList = shortcutList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", password=" + password
				+ ", venueId=" + venueId + ", venueName=" + venueName + ", birthday=" + birthday + ", sex=" + sex
				+ ", marriage=" + marriage + ", IDCard=" + IDCard + ", phone=" + phone + ", address=" + address
				+ ", workStatus=" + workStatus + ", workBeginDate=" + workBeginDate + ", workEndDate=" + workEndDate
				+ ", bankCardCode=" + bankCardCode + ", clothesSize=" + clothesSize + ", trousersSize=" + trousersSize
				+ ", shoesSize=" + shoesSize + ", workYear=" + workYear + ", graduatedSchool=" + graduatedSchool
				+ ", specialty=" + specialty + ", graduatedDate=" + graduatedDate + ", educationalBackground="
				+ educationalBackground + ", hometown=" + hometown + ", residence=" + residence + ", career=" + career
				+ ", certificateNo=" + certificateNo + ", certificateCode=" + certificateCode + ", shortcutList="
				+ shortcutList + ", userRoleList=" + userRoleList + "]";
	}
	
}
