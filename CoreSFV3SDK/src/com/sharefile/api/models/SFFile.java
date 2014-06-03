
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

public class SFFile extends SFItem {

	@SerializedName("FilePath")
	private String FilePath;
	@SerializedName("Hash")
	private String Hash;
	@SerializedName("HasPreview")
	private Boolean HasPreview;
	@SerializedName("VirusStatus")
	private SFSafeEnum<SFFileVirusStatus> VirusStatus;
	@SerializedName("LockedBy")
	private SFUser LockedBy;
	@SerializedName("Version")
	private Float Version;

		/**
		* Represents the Object Storage Identifier for this File. This field is
		* used in Object Storage providers - including sharefile.com and Storage Zones. Other
		* providers like CIFS and SharePoint do not need external references for object
		* blobs and do not populate this field.
		*/
	public String getFilePath() {
		return FilePath;
	}

		/**
		* Represents the Object Storage Identifier for this File. This field is
		* used in Object Storage providers - including sharefile.com and Storage Zones. Other
		* providers like CIFS and SharePoint do not need external references for object
		* blobs and do not populate this field.
		*/
	public void setFilePath(String filepath) {
		FilePath = filepath;
	}
		/**
		* MD5 Hash of the File contents.
		*/
	public String getHash() {
		return Hash;
	}

		/**
		* MD5 Hash of the File contents.
		*/
	public void setHash(String hash) {
		Hash = hash;
	}
		/**
		* Indicates that the File has an image Preview.
		*/
	public Boolean getHasPreview() {
		return HasPreview;
	}

		/**
		* Indicates that the File has an image Preview.
		*/
	public void setHasPreview(Boolean haspreview) {
		HasPreview = haspreview;
	}
		/**
		* Current Anti-Virus scanning status for this file
		*/
	public SFSafeEnum<SFFileVirusStatus> getVirusStatus() {
		return VirusStatus;
	}

		/**
		* Current Anti-Virus scanning status for this file
		*/
	public void setVirusStatus(SFSafeEnum<SFFileVirusStatus> virusstatus) {
		VirusStatus = virusstatus;
	}
		/**
		* Indicates the user that has locked the file
		*/
	public SFUser getLockedBy() {
		return LockedBy;
	}

		/**
		* Indicates the user that has locked the file
		*/
	public void setLockedBy(SFUser lockedby) {
		LockedBy = lockedby;
	}
		/**
		* File version.
		*/
	public Float getVersion() {
		return Version;
	}

		/**
		* File version.
		*/
	public void setVersion(Float version) {
		Version = version;
	}

}