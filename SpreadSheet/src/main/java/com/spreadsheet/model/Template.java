package com.spreadsheet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="template")
public class Template {
	
	@Column(name="krnid")
	private Long   krnId;
	
	@Column(name="area")
	private String area;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="givenname")
	private String givenName;
	
	@Column(name="familyname")
	private String familyName;
	
	@Id
	@Column(name="mail",nullable=false,unique=true)
	private String mail;
	
	@Column(name="workphone")
	private String workPhone;
	
	@Column(name="mobile")
	private Long   mobile;
	
	@Column(name="middlename")
	private String middleName;
	
	@Column(name="homephone")
	private String homePhone;
	
	@Column(name="preferredlanguage")
	private String preferredLanguage;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="employeenumber")
	private Long   employeeNumber;
	
	@Column(name="sendwelcomemail")
	private String sendWelcomeMail;
	
	@Column(name="antares")
	private String antares;
	
	@Column(name="telios")
	private String telios;
	
	@Column(name="storm")
	private String storm;
	
	@Column(name="servicenow")
	private String serviceNow;
	
	@Column(name="comarch")
	private String comarch;
	
	@Column(name="coreTenantadmin")
	private String coreTenantAdmin;
	
	@Column(name="beheren")
	private String beheren;
	
	@Column(name="clientitmanager")
	private String clientITManager;
	
	public Template() {
		super();
	}	

	public Template(Long krnId, String area, String userName, String givenName, String familyName, String mail,
			String workPhone, Long mobile, String middleName, String homePhone, String preferredLanguage, String gender,
			Long employeeNumber, String sendWelcomeMail, String antares, String telios, String storm, String serviceNow,
			String comarch, String coreTenantAdmin, String beheren, String clientITManager) {
		super();
		this.krnId = krnId;
		this.area = area;
		this.userName = userName;
		this.givenName = givenName;
		this.familyName = familyName;
		this.mail = mail;
		this.workPhone = workPhone;
		this.mobile = mobile;
		this.middleName = middleName;
		this.homePhone = homePhone;
		this.preferredLanguage = preferredLanguage;
		this.gender = gender;
		this.employeeNumber = employeeNumber;
		this.sendWelcomeMail = sendWelcomeMail;
		this.antares = antares;
		this.telios = telios;
		this.storm = storm;
		this.serviceNow = serviceNow;
		this.comarch = comarch;
		this.coreTenantAdmin = coreTenantAdmin;
		this.beheren = beheren;
		this.clientITManager = clientITManager;
	}

	public Long getKrnId() {
		return krnId;
	}

	public void setKrnId(Long krnId) {
		this.krnId = krnId;
	}	

	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("set User"+userName);
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getSendWelcomeMail() {
		return sendWelcomeMail;
	}

	public void setSendWelcomeMail(String sendWelcomeMail) {
		this.sendWelcomeMail = sendWelcomeMail;
	}

	public String getAntares() {
		return antares;
	}

	public void setAntares(String antares) {
		this.antares = antares;
	}

	public String getTelios() {
		return telios;
	}

	public void setTelios(String telios) {
		this.telios = telios;
	}

	public String getStorm() {
		return storm;
	}

	public void setStorm(String storm) {
		this.storm = storm;
	}

	public String getServiceNow() {
		return serviceNow;
	}

	public void setServiceNow(String serviceNow) {
		this.serviceNow = serviceNow;
	}

	public String getComarch() {
		return comarch;
	}

	public void setComarch(String comarch) {
		this.comarch = comarch;
	}

	public String getCoreTenantAdmin() {
		return coreTenantAdmin;
	}

	public void setCoreTenantAdmin(String coreTenantAdmin) {
		this.coreTenantAdmin = coreTenantAdmin;
	}

	public String getBeheren() {
		return beheren;
	}

	public void setBeheren(String beheren) {
		this.beheren = beheren;
	}

	public String getClientITManager() {
		return clientITManager;
	}

	public void setClientITManager(String clientITManager) {
		this.clientITManager = clientITManager;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((antares == null) ? 0 : antares.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((beheren == null) ? 0 : beheren.hashCode());
		result = prime * result + ((clientITManager == null) ? 0 : clientITManager.hashCode());
		result = prime * result + ((comarch == null) ? 0 : comarch.hashCode());
		result = prime * result + ((coreTenantAdmin == null) ? 0 : coreTenantAdmin.hashCode());
		result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result + ((familyName == null) ? 0 : familyName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((givenName == null) ? 0 : givenName.hashCode());
		result = prime * result + ((homePhone == null) ? 0 : homePhone.hashCode());
		result = prime * result + ((krnId == null) ? 0 : krnId.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((preferredLanguage == null) ? 0 : preferredLanguage.hashCode());
		result = prime * result + ((sendWelcomeMail == null) ? 0 : sendWelcomeMail.hashCode());
		result = prime * result + ((serviceNow == null) ? 0 : serviceNow.hashCode());
		result = prime * result + ((storm == null) ? 0 : storm.hashCode());
		result = prime * result + ((telios == null) ? 0 : telios.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Template other = (Template) obj;
		if (antares == null) {
			if (other.antares != null)
				return false;
		} else if (!antares.equals(other.antares))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (beheren == null) {
			if (other.beheren != null)
				return false;
		} else if (!beheren.equals(other.beheren))
			return false;
		if (clientITManager == null) {
			if (other.clientITManager != null)
				return false;
		} else if (!clientITManager.equals(other.clientITManager))
			return false;
		if (comarch == null) {
			if (other.comarch != null)
				return false;
		} else if (!comarch.equals(other.comarch))
			return false;
		if (coreTenantAdmin == null) {
			if (other.coreTenantAdmin != null)
				return false;
		} else if (!coreTenantAdmin.equals(other.coreTenantAdmin))
			return false;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		if (familyName == null) {
			if (other.familyName != null)
				return false;
		} else if (!familyName.equals(other.familyName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (givenName == null) {
			if (other.givenName != null)
				return false;
		} else if (!givenName.equals(other.givenName))
			return false;
		if (homePhone == null) {
			if (other.homePhone != null)
				return false;
		} else if (!homePhone.equals(other.homePhone))
			return false;
		if (krnId == null) {
			if (other.krnId != null)
				return false;
		} else if (!krnId.equals(other.krnId))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (preferredLanguage == null) {
			if (other.preferredLanguage != null)
				return false;
		} else if (!preferredLanguage.equals(other.preferredLanguage))
			return false;
		if (sendWelcomeMail == null) {
			if (other.sendWelcomeMail != null)
				return false;
		} else if (!sendWelcomeMail.equals(other.sendWelcomeMail))
			return false;
		if (serviceNow == null) {
			if (other.serviceNow != null)
				return false;
		} else if (!serviceNow.equals(other.serviceNow))
			return false;
		if (storm == null) {
			if (other.storm != null)
				return false;
		} else if (!storm.equals(other.storm))
			return false;
		if (telios == null) {
			if (other.telios != null)
				return false;
		} else if (!telios.equals(other.telios))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (workPhone == null) {
			if (other.workPhone != null)
				return false;
		} else if (!workPhone.equals(other.workPhone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Template [krnId=" + krnId + ", area=" + area + ", userName=" + userName + ", givenName=" + givenName
				+ ", familyName=" + familyName + ", mail=" + mail + ", workPhone=" + workPhone + ", mobile=" + mobile
				+ ", middleName=" + middleName + ", homePhone=" + homePhone + ", preferredLanguage=" + preferredLanguage
				+ ", gender=" + gender + ", employeeNumber=" + employeeNumber + ", sendWelcomeMail=" + sendWelcomeMail
				+ ", antares=" + antares + ", telios=" + telios + ", storm=" + storm + ", serviceNow=" + serviceNow
				+ ", comarch=" + comarch + ", coreTenantAdmin=" + coreTenantAdmin + ", beheren=" + beheren
				+ ", clientITManager=" + clientITManager + "]";
	}

}
