
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

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFAccountPreferences extends SFODataObject {

	@SerializedName("EnableViewOnly")
	private Boolean EnableViewOnly;
	@SerializedName("EnableWatermarkOnViewOnly")
	private Boolean EnableWatermarkOnViewOnly;
	@SerializedName("AllowProactiveNotifications")
	private Boolean AllowProactiveNotifications;
	@SerializedName("ShowUserListToClients")
	private Boolean ShowUserListToClients;
	@SerializedName("RequireLoginOnDownload")
	private Boolean RequireLoginOnDownload;
	@SerializedName("RequireLoginByDefault")
	private Boolean RequireLoginByDefault;
	@SerializedName("EnableClientSend")
	private Boolean EnableClientSend;
	@SerializedName("EnableThumbnails")
	private Boolean EnableThumbnails;
	@SerializedName("EnableSSO")
	private Boolean EnableSSO;
	@SerializedName("VirusStrictness")
	private Integer VirusStrictness;
	@SerializedName("EnableSfAdi")
	private Boolean EnableSfAdi;
	@SerializedName("EnableMultipleZones")
	private Boolean EnableMultipleZones;
	@SerializedName("DefaultZone")
	private SFZone DefaultZone;
	@SerializedName("EnableVersioning")
	private Boolean EnableVersioning;
	@SerializedName("SystemType")
	private String SystemType;
	@SerializedName("EnableSync")
	private Boolean EnableSync;
	@SerializedName("EnableSyncAutoUpdate")
	private Boolean EnableSyncAutoUpdate;
	@SerializedName("SystemName")
	private String SystemName;
	@SerializedName("HomeScreenName")
	private String HomeScreenName;
	@SerializedName("ShowTermsCheckbox")
	private Boolean ShowTermsCheckbox;
	@SerializedName("TermsCheckboxText")
	private String TermsCheckboxText;
	@SerializedName("TermsCheckboxStrictness")
	private Integer TermsCheckboxStrictness;
	@SerializedName("RequireCompanyNameWithUserInfo")
	private Boolean RequireCompanyNameWithUserInfo;
	@SerializedName("EnableEditor")
	private Boolean EnableEditor;
	@SerializedName("ShareIDMaxExpirationDays")
	private Integer ShareIDMaxExpirationDays;
	@SerializedName("AdminIsSuperUser")
	private Boolean AdminIsSuperUser;
	@SerializedName("ShowFolderAccessList")
	private Boolean ShowFolderAccessList;
	@SerializedName("FromEmailIsShareFile")
	private Boolean FromEmailIsShareFile;
	@SerializedName("UseAlternateSMTP")
	private Boolean UseAlternateSMTP;
	@SerializedName("ShowPasswordInEmail")
	private Boolean ShowPasswordInEmail;
	@SerializedName("EmailPasswordText")
	private String EmailPasswordText;
	@SerializedName("EnableSelfNotificationsUpload")
	private Boolean EnableSelfNotificationsUpload;
	@SerializedName("EnableSelfNotificationsDownload")
	private Boolean EnableSelfNotificationsDownload;
	@SerializedName("EnableUploadShareIDReceipt")
	private Boolean EnableUploadShareIDReceipt;
	@SerializedName("DefaultConsolidatedNotificationInterval")
	private Integer DefaultConsolidatedNotificationInterval;
	@SerializedName("ExpirationDays")
	private Integer ExpirationDays;
	@SerializedName("DefaultSortField")
	private String DefaultSortField;
	@SerializedName("DefaultSortOrder")
	private String DefaultSortOrder;
	@SerializedName("DefaultIsVersioned")
	private Boolean DefaultIsVersioned;
	@SerializedName("DefaultMaxVersions")
	private Integer DefaultMaxVersions;
	@SerializedName("ViewOnlyWatermarkText")
	private String ViewOnlyWatermarkText;
	@SerializedName("EnableDocViewerPrinting")
	private Boolean EnableDocViewerPrinting;
	@SerializedName("EnableWatermarkedDownloads")
	private Boolean EnableWatermarkedDownloads;
	@SerializedName("EnableCaseSensitivePasswords")
	private Boolean EnableCaseSensitivePasswords;
	@SerializedName("EnableTwoFactorAuth")
	private Boolean EnableTwoFactorAuth;
	@SerializedName("LoginFailMaxAttempts")
	private Integer LoginFailMaxAttempts;
	@SerializedName("LoginFailLockoutSecs")
	private Integer LoginFailLockoutSecs;
	@SerializedName("IPRestrictions")
	private String IPRestrictions;
	@SerializedName("InactiveTimeoutMins")
	private Integer InactiveTimeoutMins;
	@SerializedName("OAuth2RefreshTokenLifetimeMinutes")
	private Integer OAuth2RefreshTokenLifetimeMinutes;
	@SerializedName("PasswordRegEx")
	private String PasswordRegEx;
	@SerializedName("PasswordRegExFormula")
	private String PasswordRegExFormula;
	@SerializedName("PasswordRegExDescription")
	private String PasswordRegExDescription;
	@SerializedName("EnableActivationLinks")
	private Boolean EnableActivationLinks;
	@SerializedName("IsFINRA")
	private Boolean IsFINRA;
	@SerializedName("EnableOAuth")
	private Boolean EnableOAuth;
	@SerializedName("EnableQandA")
	private Boolean EnableQandA;
	@SerializedName("EnableQandATextInNotifications")
	private Boolean EnableQandATextInNotifications;
	@SerializedName("UXMode")
	private SFSafeEnum<SFUXMode> UXMode;
	@SerializedName("IndustryCode")
	private Integer IndustryCode;
	@SerializedName("PasswordMaxAgeDays")
	private Integer PasswordMaxAgeDays;
	@SerializedName("PasswordHistoryCount")
	private Integer PasswordHistoryCount;
	@SerializedName("MinimumLength")
	private Integer MinimumLength;
	@SerializedName("AlphaRequired")
	private Boolean AlphaRequired;
	@SerializedName("CaseRequired")
	private Boolean CaseRequired;
	@SerializedName("NumericRequired")
	private Boolean NumericRequired;
	@SerializedName("SpecialRequired")
	private Boolean SpecialRequired;
	@SerializedName("AllowedSpecialCharacters")
	private String AllowedSpecialCharacters;
	@SerializedName("EnableWebDAV")
	private Boolean EnableWebDAV;
	@SerializedName("EnableFTP")
	private Boolean EnableFTP;
	@SerializedName("EnableSFTP")
	private Boolean EnableSFTP;
	@SerializedName("DisableMarketing")
	private Boolean DisableMarketing;
	@SerializedName("VDRDocViewerURL")
	private String VDRDocViewerURL;
	@SerializedName("EnableSMBConnectorForAccount")
	private Boolean EnableSMBConnectorForAccount;
	@SerializedName("AccountID")
	private String AccountID;
	@SerializedName("EnableGetApp")
	private Boolean EnableGetApp;
	@SerializedName("EnableStorageZoneConnector")
	private Boolean EnableStorageZoneConnector;
	@SerializedName("HasAnyConnectorZones")
	private Boolean HasAnyConnectorZones;

	public Boolean getEnableViewOnly() {
		return EnableViewOnly;
	}

	public void setEnableViewOnly(Boolean enableviewonly) {
		EnableViewOnly = enableviewonly;
	}
	public Boolean getEnableWatermarkOnViewOnly() {
		return EnableWatermarkOnViewOnly;
	}

	public void setEnableWatermarkOnViewOnly(Boolean enablewatermarkonviewonly) {
		EnableWatermarkOnViewOnly = enablewatermarkonviewonly;
	}
	public Boolean getAllowProactiveNotifications() {
		return AllowProactiveNotifications;
	}

	public void setAllowProactiveNotifications(Boolean allowproactivenotifications) {
		AllowProactiveNotifications = allowproactivenotifications;
	}
	public Boolean getShowUserListToClients() {
		return ShowUserListToClients;
	}

	public void setShowUserListToClients(Boolean showuserlisttoclients) {
		ShowUserListToClients = showuserlisttoclients;
	}
	public Boolean getRequireLoginOnDownload() {
		return RequireLoginOnDownload;
	}

	public void setRequireLoginOnDownload(Boolean requireloginondownload) {
		RequireLoginOnDownload = requireloginondownload;
	}
	public Boolean getRequireLoginByDefault() {
		return RequireLoginByDefault;
	}

	public void setRequireLoginByDefault(Boolean requireloginbydefault) {
		RequireLoginByDefault = requireloginbydefault;
	}
	public Boolean getEnableClientSend() {
		return EnableClientSend;
	}

	public void setEnableClientSend(Boolean enableclientsend) {
		EnableClientSend = enableclientsend;
	}
	public Boolean getEnableThumbnails() {
		return EnableThumbnails;
	}

	public void setEnableThumbnails(Boolean enablethumbnails) {
		EnableThumbnails = enablethumbnails;
	}
	public Boolean getEnableSSO() {
		return EnableSSO;
	}

	public void setEnableSSO(Boolean enablesso) {
		EnableSSO = enablesso;
	}
	public Integer getVirusStrictness() {
		return VirusStrictness;
	}

	public void setVirusStrictness(Integer virusstrictness) {
		VirusStrictness = virusstrictness;
	}
	public Boolean getEnableSfAdi() {
		return EnableSfAdi;
	}

	public void setEnableSfAdi(Boolean enablesfadi) {
		EnableSfAdi = enablesfadi;
	}
	public Boolean getEnableMultipleZones() {
		return EnableMultipleZones;
	}

	public void setEnableMultipleZones(Boolean enablemultiplezones) {
		EnableMultipleZones = enablemultiplezones;
	}
	public SFZone getDefaultZone() {
		return DefaultZone;
	}

	public void setDefaultZone(SFZone defaultzone) {
		DefaultZone = defaultzone;
	}
	public Boolean getEnableVersioning() {
		return EnableVersioning;
	}

	public void setEnableVersioning(Boolean enableversioning) {
		EnableVersioning = enableversioning;
	}
	public String getSystemType() {
		return SystemType;
	}

	public void setSystemType(String systemtype) {
		SystemType = systemtype;
	}
	public Boolean getEnableSync() {
		return EnableSync;
	}

	public void setEnableSync(Boolean enablesync) {
		EnableSync = enablesync;
	}
	public Boolean getEnableSyncAutoUpdate() {
		return EnableSyncAutoUpdate;
	}

	public void setEnableSyncAutoUpdate(Boolean enablesyncautoupdate) {
		EnableSyncAutoUpdate = enablesyncautoupdate;
	}
	public String getSystemName() {
		return SystemName;
	}

	public void setSystemName(String systemname) {
		SystemName = systemname;
	}
	public String getHomeScreenName() {
		return HomeScreenName;
	}

	public void setHomeScreenName(String homescreenname) {
		HomeScreenName = homescreenname;
	}
	public Boolean getShowTermsCheckbox() {
		return ShowTermsCheckbox;
	}

	public void setShowTermsCheckbox(Boolean showtermscheckbox) {
		ShowTermsCheckbox = showtermscheckbox;
	}
	public String getTermsCheckboxText() {
		return TermsCheckboxText;
	}

	public void setTermsCheckboxText(String termscheckboxtext) {
		TermsCheckboxText = termscheckboxtext;
	}
	public Integer getTermsCheckboxStrictness() {
		return TermsCheckboxStrictness;
	}

	public void setTermsCheckboxStrictness(Integer termscheckboxstrictness) {
		TermsCheckboxStrictness = termscheckboxstrictness;
	}
	public Boolean getRequireCompanyNameWithUserInfo() {
		return RequireCompanyNameWithUserInfo;
	}

	public void setRequireCompanyNameWithUserInfo(Boolean requirecompanynamewithuserinfo) {
		RequireCompanyNameWithUserInfo = requirecompanynamewithuserinfo;
	}
	public Boolean getEnableEditor() {
		return EnableEditor;
	}

	public void setEnableEditor(Boolean enableeditor) {
		EnableEditor = enableeditor;
	}
	public Integer getShareIDMaxExpirationDays() {
		return ShareIDMaxExpirationDays;
	}

	public void setShareIDMaxExpirationDays(Integer shareidmaxexpirationdays) {
		ShareIDMaxExpirationDays = shareidmaxexpirationdays;
	}
	public Boolean getAdminIsSuperUser() {
		return AdminIsSuperUser;
	}

	public void setAdminIsSuperUser(Boolean adminissuperuser) {
		AdminIsSuperUser = adminissuperuser;
	}
	public Boolean getShowFolderAccessList() {
		return ShowFolderAccessList;
	}

	public void setShowFolderAccessList(Boolean showfolderaccesslist) {
		ShowFolderAccessList = showfolderaccesslist;
	}
	public Boolean getFromEmailIsShareFile() {
		return FromEmailIsShareFile;
	}

	public void setFromEmailIsShareFile(Boolean fromemailissharefile) {
		FromEmailIsShareFile = fromemailissharefile;
	}
	public Boolean getUseAlternateSMTP() {
		return UseAlternateSMTP;
	}

	public void setUseAlternateSMTP(Boolean usealternatesmtp) {
		UseAlternateSMTP = usealternatesmtp;
	}
	public Boolean getShowPasswordInEmail() {
		return ShowPasswordInEmail;
	}

	public void setShowPasswordInEmail(Boolean showpasswordinemail) {
		ShowPasswordInEmail = showpasswordinemail;
	}
	public String getEmailPasswordText() {
		return EmailPasswordText;
	}

	public void setEmailPasswordText(String emailpasswordtext) {
		EmailPasswordText = emailpasswordtext;
	}
	public Boolean getEnableSelfNotificationsUpload() {
		return EnableSelfNotificationsUpload;
	}

	public void setEnableSelfNotificationsUpload(Boolean enableselfnotificationsupload) {
		EnableSelfNotificationsUpload = enableselfnotificationsupload;
	}
	public Boolean getEnableSelfNotificationsDownload() {
		return EnableSelfNotificationsDownload;
	}

	public void setEnableSelfNotificationsDownload(Boolean enableselfnotificationsdownload) {
		EnableSelfNotificationsDownload = enableselfnotificationsdownload;
	}
	public Boolean getEnableUploadShareIDReceipt() {
		return EnableUploadShareIDReceipt;
	}

	public void setEnableUploadShareIDReceipt(Boolean enableuploadshareidreceipt) {
		EnableUploadShareIDReceipt = enableuploadshareidreceipt;
	}
	public Integer getDefaultConsolidatedNotificationInterval() {
		return DefaultConsolidatedNotificationInterval;
	}

	public void setDefaultConsolidatedNotificationInterval(Integer defaultconsolidatednotificationinterval) {
		DefaultConsolidatedNotificationInterval = defaultconsolidatednotificationinterval;
	}
	public Integer getExpirationDays() {
		return ExpirationDays;
	}

	public void setExpirationDays(Integer expirationdays) {
		ExpirationDays = expirationdays;
	}
	public String getDefaultSortField() {
		return DefaultSortField;
	}

	public void setDefaultSortField(String defaultsortfield) {
		DefaultSortField = defaultsortfield;
	}
	public String getDefaultSortOrder() {
		return DefaultSortOrder;
	}

	public void setDefaultSortOrder(String defaultsortorder) {
		DefaultSortOrder = defaultsortorder;
	}
	public Boolean getDefaultIsVersioned() {
		return DefaultIsVersioned;
	}

	public void setDefaultIsVersioned(Boolean defaultisversioned) {
		DefaultIsVersioned = defaultisversioned;
	}
	public Integer getDefaultMaxVersions() {
		return DefaultMaxVersions;
	}

	public void setDefaultMaxVersions(Integer defaultmaxversions) {
		DefaultMaxVersions = defaultmaxversions;
	}
	public String getViewOnlyWatermarkText() {
		return ViewOnlyWatermarkText;
	}

	public void setViewOnlyWatermarkText(String viewonlywatermarktext) {
		ViewOnlyWatermarkText = viewonlywatermarktext;
	}
	public Boolean getEnableDocViewerPrinting() {
		return EnableDocViewerPrinting;
	}

	public void setEnableDocViewerPrinting(Boolean enabledocviewerprinting) {
		EnableDocViewerPrinting = enabledocviewerprinting;
	}
	public Boolean getEnableWatermarkedDownloads() {
		return EnableWatermarkedDownloads;
	}

	public void setEnableWatermarkedDownloads(Boolean enablewatermarkeddownloads) {
		EnableWatermarkedDownloads = enablewatermarkeddownloads;
	}
	public Boolean getEnableCaseSensitivePasswords() {
		return EnableCaseSensitivePasswords;
	}

	public void setEnableCaseSensitivePasswords(Boolean enablecasesensitivepasswords) {
		EnableCaseSensitivePasswords = enablecasesensitivepasswords;
	}
	public Boolean getEnableTwoFactorAuth() {
		return EnableTwoFactorAuth;
	}

	public void setEnableTwoFactorAuth(Boolean enabletwofactorauth) {
		EnableTwoFactorAuth = enabletwofactorauth;
	}
	public Integer getLoginFailMaxAttempts() {
		return LoginFailMaxAttempts;
	}

	public void setLoginFailMaxAttempts(Integer loginfailmaxattempts) {
		LoginFailMaxAttempts = loginfailmaxattempts;
	}
	public Integer getLoginFailLockoutSecs() {
		return LoginFailLockoutSecs;
	}

	public void setLoginFailLockoutSecs(Integer loginfaillockoutsecs) {
		LoginFailLockoutSecs = loginfaillockoutsecs;
	}
	public String getIPRestrictions() {
		return IPRestrictions;
	}

	public void setIPRestrictions(String iprestrictions) {
		IPRestrictions = iprestrictions;
	}
	public Integer getInactiveTimeoutMins() {
		return InactiveTimeoutMins;
	}

	public void setInactiveTimeoutMins(Integer inactivetimeoutmins) {
		InactiveTimeoutMins = inactivetimeoutmins;
	}
	public Integer getOAuth2RefreshTokenLifetimeMinutes() {
		return OAuth2RefreshTokenLifetimeMinutes;
	}

	public void setOAuth2RefreshTokenLifetimeMinutes(Integer oauth2refreshtokenlifetimeminutes) {
		OAuth2RefreshTokenLifetimeMinutes = oauth2refreshtokenlifetimeminutes;
	}
	public String getPasswordRegEx() {
		return PasswordRegEx;
	}

	public void setPasswordRegEx(String passwordregex) {
		PasswordRegEx = passwordregex;
	}
	public String getPasswordRegExFormula() {
		return PasswordRegExFormula;
	}

	public void setPasswordRegExFormula(String passwordregexformula) {
		PasswordRegExFormula = passwordregexformula;
	}
	public String getPasswordRegExDescription() {
		return PasswordRegExDescription;
	}

	public void setPasswordRegExDescription(String passwordregexdescription) {
		PasswordRegExDescription = passwordregexdescription;
	}
	public Boolean getEnableActivationLinks() {
		return EnableActivationLinks;
	}

	public void setEnableActivationLinks(Boolean enableactivationlinks) {
		EnableActivationLinks = enableactivationlinks;
	}
	public Boolean getIsFINRA() {
		return IsFINRA;
	}

	public void setIsFINRA(Boolean isfinra) {
		IsFINRA = isfinra;
	}
	public Boolean getEnableOAuth() {
		return EnableOAuth;
	}

	public void setEnableOAuth(Boolean enableoauth) {
		EnableOAuth = enableoauth;
	}
	public Boolean getEnableQandA() {
		return EnableQandA;
	}

	public void setEnableQandA(Boolean enableqanda) {
		EnableQandA = enableqanda;
	}
	public Boolean getEnableQandATextInNotifications() {
		return EnableQandATextInNotifications;
	}

	public void setEnableQandATextInNotifications(Boolean enableqandatextinnotifications) {
		EnableQandATextInNotifications = enableqandatextinnotifications;
	}
	public SFSafeEnum<SFUXMode> getUXMode() {
		return UXMode;
	}

	public void setUXMode(SFSafeEnum<SFUXMode> uxmode) {
		UXMode = uxmode;
	}
	public Integer getIndustryCode() {
		return IndustryCode;
	}

	public void setIndustryCode(Integer industrycode) {
		IndustryCode = industrycode;
	}
	public Integer getPasswordMaxAgeDays() {
		return PasswordMaxAgeDays;
	}

	public void setPasswordMaxAgeDays(Integer passwordmaxagedays) {
		PasswordMaxAgeDays = passwordmaxagedays;
	}
	public Integer getPasswordHistoryCount() {
		return PasswordHistoryCount;
	}

	public void setPasswordHistoryCount(Integer passwordhistorycount) {
		PasswordHistoryCount = passwordhistorycount;
	}
	public Integer getMinimumLength() {
		return MinimumLength;
	}

	public void setMinimumLength(Integer minimumlength) {
		MinimumLength = minimumlength;
	}
	public Boolean getAlphaRequired() {
		return AlphaRequired;
	}

	public void setAlphaRequired(Boolean alpharequired) {
		AlphaRequired = alpharequired;
	}
	public Boolean getCaseRequired() {
		return CaseRequired;
	}

	public void setCaseRequired(Boolean caserequired) {
		CaseRequired = caserequired;
	}
	public Boolean getNumericRequired() {
		return NumericRequired;
	}

	public void setNumericRequired(Boolean numericrequired) {
		NumericRequired = numericrequired;
	}
	public Boolean getSpecialRequired() {
		return SpecialRequired;
	}

	public void setSpecialRequired(Boolean specialrequired) {
		SpecialRequired = specialrequired;
	}
	public String getAllowedSpecialCharacters() {
		return AllowedSpecialCharacters;
	}

	public void setAllowedSpecialCharacters(String allowedspecialcharacters) {
		AllowedSpecialCharacters = allowedspecialcharacters;
	}
	public Boolean getEnableWebDAV() {
		return EnableWebDAV;
	}

	public void setEnableWebDAV(Boolean enablewebdav) {
		EnableWebDAV = enablewebdav;
	}
	public Boolean getEnableFTP() {
		return EnableFTP;
	}

	public void setEnableFTP(Boolean enableftp) {
		EnableFTP = enableftp;
	}
	public Boolean getEnableSFTP() {
		return EnableSFTP;
	}

	public void setEnableSFTP(Boolean enablesftp) {
		EnableSFTP = enablesftp;
	}
	public Boolean getDisableMarketing() {
		return DisableMarketing;
	}

	public void setDisableMarketing(Boolean disablemarketing) {
		DisableMarketing = disablemarketing;
	}
	public String getVDRDocViewerURL() {
		return VDRDocViewerURL;
	}

	public void setVDRDocViewerURL(String vdrdocviewerurl) {
		VDRDocViewerURL = vdrdocviewerurl;
	}
	public Boolean getEnableSMBConnectorForAccount() {
		return EnableSMBConnectorForAccount;
	}

	public void setEnableSMBConnectorForAccount(Boolean enablesmbconnectorforaccount) {
		EnableSMBConnectorForAccount = enablesmbconnectorforaccount;
	}
	public String getAccountID() {
		return AccountID;
	}

	public void setAccountID(String accountid) {
		AccountID = accountid;
	}
	public Boolean getEnableGetApp() {
		return EnableGetApp;
	}

	public void setEnableGetApp(Boolean enablegetapp) {
		EnableGetApp = enablegetapp;
	}
	public Boolean getEnableStorageZoneConnector() {
		return EnableStorageZoneConnector;
	}

	public void setEnableStorageZoneConnector(Boolean enablestoragezoneconnector) {
		EnableStorageZoneConnector = enablestoragezoneconnector;
	}
	public Boolean getHasAnyConnectorZones() {
		return HasAnyConnectorZones;
	}

	public void setHasAnyConnectorZones(Boolean hasanyconnectorzones) {
		HasAnyConnectorZones = hasanyconnectorzones;
	}

}