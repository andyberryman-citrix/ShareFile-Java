






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


public class SFUser extends SFPrincipal {



	@SerializedName("Account")

	private SFAccount Account;


	@SerializedName("Company")

	private String Company;


	@SerializedName("TotalSharedFiles")

	private Integer TotalSharedFiles;


	@SerializedName("Contacted")

	private Integer Contacted;


	@SerializedName("FullName")

	private String FullName;


	@SerializedName("ReferredBy")

	private String ReferredBy;


	@SerializedName("Notifications")

	private ArrayList<SFNotification> Notifications;


	@SerializedName("DefaultZone")

	private SFZone DefaultZone;


	@SerializedName("FirstName")

	private String FirstName;


	@SerializedName("LastName")

	private String LastName;


	@SerializedName("DateCreated")

	private Date DateCreated;


	@SerializedName("FullNameShort")

	private String FullNameShort;


	@SerializedName("IsConfirmed")

	private Boolean IsConfirmed;


	@SerializedName("Password")

	private String Password;


	@SerializedName("Preferences")

	private SFUserPreferences Preferences;


	@SerializedName("Security")

	private SFUserSecurity Security;


	@SerializedName("FavoriteFolders")

	private ArrayList<SFFavoriteFolder> FavoriteFolders;


	@SerializedName("HomeFolder")

	private SFFolder HomeFolder;


	@SerializedName("Devices")

	private ArrayList<SFDeviceUser> Devices;


	@SerializedName("VirtualRoot")

	private SFFolder VirtualRoot;


	@SerializedName("Roles")

	private ArrayList<SFSafeEnum<SFUserRole>> Roles;


	@SerializedName("Info")

	private SFUserInfo Info;




	public SFAccount getAccount() {
		return Account;
	}


	public void setAccount(SFAccount account) {
		Account = account;
	}


	public String getCompany() {
		return Company;
	}


	public void setCompany(String company) {
		Company = company;
	}


	public Integer getTotalSharedFiles() {
		return TotalSharedFiles;
	}


	public void setTotalSharedFiles(Integer totalsharedfiles) {
		TotalSharedFiles = totalsharedfiles;
	}


	public Integer getContacted() {
		return Contacted;
	}


	public void setContacted(Integer contacted) {
		Contacted = contacted;
	}


		/**

		* The first and last name of the user

		*/

	public String getFullName() {
		return FullName;
	}


		/**

		* The first and last name of the user

		*/

	public void setFullName(String fullname) {
		FullName = fullname;
	}


	public String getReferredBy() {
		return ReferredBy;
	}


	public void setReferredBy(String referredby) {
		ReferredBy = referredby;
	}


	public ArrayList<SFNotification> getNotifications() {
		return Notifications;
	}


	public void setNotifications(ArrayList<SFNotification> notifications) {
		Notifications = notifications;
	}


	public SFZone getDefaultZone() {
		return DefaultZone;
	}


	public void setDefaultZone(SFZone defaultzone) {
		DefaultZone = defaultzone;
	}


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


	public Date getDateCreated() {
		return DateCreated;
	}


	public void setDateCreated(Date datecreated) {
		DateCreated = datecreated;
	}


	public String getFullNameShort() {
		return FullNameShort;
	}


	public void setFullNameShort(String fullnameshort) {
		FullNameShort = fullnameshort;
	}


	public Boolean getIsConfirmed() {
		return IsConfirmed;
	}


	public void setIsConfirmed(Boolean isconfirmed) {
		IsConfirmed = isconfirmed;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public SFUserPreferences getPreferences() {
		return Preferences;
	}


	public void setPreferences(SFUserPreferences preferences) {
		Preferences = preferences;
	}


	public SFUserSecurity getSecurity() {
		return Security;
	}


	public void setSecurity(SFUserSecurity security) {
		Security = security;
	}


	public ArrayList<SFFavoriteFolder> getFavoriteFolders() {
		return FavoriteFolders;
	}


	public void setFavoriteFolders(ArrayList<SFFavoriteFolder> favoritefolders) {
		FavoriteFolders = favoritefolders;
	}


	public SFFolder getHomeFolder() {
		return HomeFolder;
	}


	public void setHomeFolder(SFFolder homefolder) {
		HomeFolder = homefolder;
	}


	public ArrayList<SFDeviceUser> getDevices() {
		return Devices;
	}


	public void setDevices(ArrayList<SFDeviceUser> devices) {
		Devices = devices;
	}


	public SFFolder getVirtualRoot() {
		return VirtualRoot;
	}


	public void setVirtualRoot(SFFolder virtualroot) {
		VirtualRoot = virtualroot;
	}


	public ArrayList<SFSafeEnum<SFUserRole>> getRoles() {
		return Roles;
	}


	public void setRoles(ArrayList<SFSafeEnum<SFUserRole>> roles) {
		Roles = roles;
	}


	public SFUserInfo getInfo() {
		return Info;
	}


	public void setInfo(SFUserInfo info) {
		Info = info;
	}

}