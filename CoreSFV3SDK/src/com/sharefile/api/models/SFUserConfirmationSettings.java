






// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------


package com.sharefile.api.models;


public class SFUserConfirmationSettings extends SFODataObject {



	@SerializedName("FirstName")

	private String FirstName;


	@SerializedName("LastName")

	private String LastName;


	@SerializedName("Company")

	private String Company;


	@SerializedName("Password")

	private String Password;


	@SerializedName("DayLightName")

	private String DayLightName;


	@SerializedName("UTCOffset")

	private String UTCOffset;


	@SerializedName("DateFormat")

	private String DateFormat;


	@SerializedName("TimeFormat")

	private String TimeFormat;


	@SerializedName("EmailInterval")

	private Integer EmailInterval;




	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstname) {
		FirstName = firstname;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastname) {
		LastName = lastname;
	}


	public String getCompany() {
		return Company;
	}


	public void setCompany(String company) {
		Company = company;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getDayLightName() {
		return DayLightName;
	}


	public void setDayLightName(String daylightname) {
		DayLightName = daylightname;
	}


	public String getUTCOffset() {
		return UTCOffset;
	}


	public void setUTCOffset(String utcoffset) {
		UTCOffset = utcoffset;
	}


	public String getDateFormat() {
		return DateFormat;
	}


	public void setDateFormat(String dateformat) {
		DateFormat = dateformat;
	}


	public String getTimeFormat() {
		return TimeFormat;
	}


	public void setTimeFormat(String timeformat) {
		TimeFormat = timeformat;
	}


	public Integer getEmailInterval() {
		return EmailInterval;
	}


	public void setEmailInterval(Integer emailinterval) {
		EmailInterval = emailinterval;
	}

}