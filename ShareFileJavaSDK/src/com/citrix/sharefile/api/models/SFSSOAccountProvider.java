
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFSSOAccountProvider extends SFODataObject {

	@SerializedName("LogoutUrl")
	private String LogoutUrl;
	@SerializedName("LoginUrl")
	private String LoginUrl;
	@SerializedName("IPRestrictions")
	private String IPRestrictions;
	@SerializedName("ForceSSO")
	private Boolean ForceSSO;
	@SerializedName("Certificate")
	private String Certificate;
	@SerializedName("Account")
	private SFAccount Account;
	@SerializedName("EntityID")
	private String EntityID;
	@SerializedName("SFEntityID")
	private String SFEntityID;
	@SerializedName("SPInitatedAuthContext")
	private String SPInitatedAuthContext;
	@SerializedName("SPInitatedAuthMethod")
	private String SPInitatedAuthMethod;
	@SerializedName("UseWebAuthentication")
	private Boolean UseWebAuthentication;
	@SerializedName("IsActive")
	private Boolean IsActive;
	@SerializedName("ProviderID")
	private String ProviderID;
	@SerializedName("DebugMode")
	private Boolean DebugMode;
	@SerializedName("LenientSignatures")
	private Boolean LenientSignatures;

	public String getLogoutUrl() {
		return this.LogoutUrl;
	}

	public void setLogoutUrl(String logouturl) {
		this.LogoutUrl = logouturl;
	}
	public String getLoginUrl() {
		return this.LoginUrl;
	}

	public void setLoginUrl(String loginurl) {
		this.LoginUrl = loginurl;
	}
	public String getIPRestrictions() {
		return this.IPRestrictions;
	}

	public void setIPRestrictions(String iprestrictions) {
		this.IPRestrictions = iprestrictions;
	}
	public Boolean getForceSSO() {
		return this.ForceSSO;
	}

	public void setForceSSO(Boolean forcesso) {
		this.ForceSSO = forcesso;
	}
	public String getCertificate() {
		return this.Certificate;
	}

	public void setCertificate(String certificate) {
		this.Certificate = certificate;
	}
	public SFAccount getAccount() {
		return this.Account;
	}

	public void setAccount(SFAccount account) {
		this.Account = account;
	}
	public String getEntityID() {
		return this.EntityID;
	}

	public void setEntityID(String entityid) {
		this.EntityID = entityid;
	}
	public String getSFEntityID() {
		return this.SFEntityID;
	}

	public void setSFEntityID(String sfentityid) {
		this.SFEntityID = sfentityid;
	}
	public String getSPInitatedAuthContext() {
		return this.SPInitatedAuthContext;
	}

	public void setSPInitatedAuthContext(String spinitatedauthcontext) {
		this.SPInitatedAuthContext = spinitatedauthcontext;
	}
	public String getSPInitatedAuthMethod() {
		return this.SPInitatedAuthMethod;
	}

	public void setSPInitatedAuthMethod(String spinitatedauthmethod) {
		this.SPInitatedAuthMethod = spinitatedauthmethod;
	}
	public Boolean getUseWebAuthentication() {
		return this.UseWebAuthentication;
	}

	public void setUseWebAuthentication(Boolean usewebauthentication) {
		this.UseWebAuthentication = usewebauthentication;
	}
	public Boolean getIsActive() {
		return this.IsActive;
	}

	public void setIsActive(Boolean isactive) {
		this.IsActive = isactive;
	}
	public String getProviderID() {
		return this.ProviderID;
	}

	public void setProviderID(String providerid) {
		this.ProviderID = providerid;
	}
	public Boolean getDebugMode() {
		return this.DebugMode;
	}

	public void setDebugMode(Boolean debugmode) {
		this.DebugMode = debugmode;
	}
	public Boolean getLenientSignatures() {
		return this.LenientSignatures;
	}

	public void setLenientSignatures(Boolean lenientsignatures) {
		this.LenientSignatures = lenientsignatures;
	}

}