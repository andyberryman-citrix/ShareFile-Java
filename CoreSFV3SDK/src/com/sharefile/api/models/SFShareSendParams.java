
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

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.*;
import com.sharefile.api.enumerations.*;
import com.sharefile.api.models.*;

public class SFShareSendParams extends SFODataObject {

	@SerializedName("Items")
	private ArrayList<String> Items;
	@SerializedName("Emails")
	private ArrayList<String> Emails;
	@SerializedName("Subject")
	private String Subject;
	@SerializedName("Body")
	private String Body;
	@SerializedName("CcSender")
	private Boolean CcSender;
	@SerializedName("RequireLogin")
	private Boolean RequireLogin;
	@SerializedName("SendAnon")
	private Boolean SendAnon;
	@SerializedName("RequireUserInfo")
	private Boolean RequireUserInfo;
	@SerializedName("ExpirationDays")
	private Integer ExpirationDays;
	@SerializedName("NotifyOnDownload")
	private Boolean NotifyOnDownload;
	@SerializedName("IsViewOnly")
	private Boolean IsViewOnly;
	@SerializedName("MaxDownloads")
	private Integer MaxDownloads;

	public ArrayList<String> getItems() {
		return this.Items;
	}

	public void setItems(ArrayList<String> items) {
		this.Items = items;
	}
	public ArrayList<String> getEmails() {
		return this.Emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.Emails = emails;
	}
	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String subject) {
		this.Subject = subject;
	}
	public String getBody() {
		return this.Body;
	}

	public void setBody(String body) {
		this.Body = body;
	}
	public Boolean getCcSender() {
		return this.CcSender;
	}

	public void setCcSender(Boolean ccsender) {
		this.CcSender = ccsender;
	}
	public Boolean getRequireLogin() {
		return this.RequireLogin;
	}

	public void setRequireLogin(Boolean requirelogin) {
		this.RequireLogin = requirelogin;
	}
	public Boolean getSendAnon() {
		return this.SendAnon;
	}

	public void setSendAnon(Boolean sendanon) {
		this.SendAnon = sendanon;
	}
	public Boolean getRequireUserInfo() {
		return this.RequireUserInfo;
	}

	public void setRequireUserInfo(Boolean requireuserinfo) {
		this.RequireUserInfo = requireuserinfo;
	}
	public Integer getExpirationDays() {
		return this.ExpirationDays;
	}

	public void setExpirationDays(Integer expirationdays) {
		this.ExpirationDays = expirationdays;
	}
	public Boolean getNotifyOnDownload() {
		return this.NotifyOnDownload;
	}

	public void setNotifyOnDownload(Boolean notifyondownload) {
		this.NotifyOnDownload = notifyondownload;
	}
	public Boolean getIsViewOnly() {
		return this.IsViewOnly;
	}

	public void setIsViewOnly(Boolean isviewonly) {
		this.IsViewOnly = isviewonly;
	}
	public Integer getMaxDownloads() {
		return this.MaxDownloads;
	}

	public void setMaxDownloads(Integer maxdownloads) {
		this.MaxDownloads = maxdownloads;
	}

}