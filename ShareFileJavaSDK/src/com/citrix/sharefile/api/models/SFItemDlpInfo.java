
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
import com.citrix.sharefile.api.enumerations.SFSafeEnum;

public class SFItemDlpInfo extends SFODataObject {

	@SerializedName("Status")
	private SFSafeEnum<SFDlpStatus> Status;

		/**
		* File scan status
		*/
	public SFSafeEnum<SFDlpStatus> getStatus() {
		return this.Status;
	}

		/**
		* File scan status
		*/
	public void setStatus(SFSafeEnum<SFDlpStatus> status) {
		this.Status = status;
	}

}