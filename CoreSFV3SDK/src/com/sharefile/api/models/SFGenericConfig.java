






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


public class SFGenericConfig extends SFODataObject {



	@SerializedName("User")

	private SFUser User;


	@SerializedName("ConfigName")

	private String ConfigName;


	@SerializedName("ConfigSize")

	private Integer ConfigSize;


	@SerializedName("CreationDate")

	private Date CreationDate;


	@SerializedName("ModifiedDate")

	private Date ModifiedDate;


	@SerializedName("Config")

	private String Config;




	public SFUser getUser() {
		return User;
	}


	public void setUser(SFUser user) {
		User = user;
	}


	public String getConfigName() {
		return ConfigName;
	}


	public void setConfigName(String configname) {
		ConfigName = configname;
	}


	public Integer getConfigSize() {
		return ConfigSize;
	}


	public void setConfigSize(Integer configsize) {
		ConfigSize = configsize;
	}


	public Date getCreationDate() {
		return CreationDate;
	}


	public void setCreationDate(Date creationdate) {
		CreationDate = creationdate;
	}


	public Date getModifiedDate() {
		return ModifiedDate;
	}


	public void setModifiedDate(Date modifieddate) {
		ModifiedDate = modifieddate;
	}


	public String getConfig() {
		return Config;
	}


	public void setConfig(String config) {
		Config = config;
	}

}