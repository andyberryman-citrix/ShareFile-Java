
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

public class SFODataObject extends Object {

	@SerializedName("odata.metadata")
	private String MetadataUrl;
	@SerializedName("Id")
	private String Id;
	@SerializedName("url")
	private URI url;
	@SerializedName("Properties")
	private Map<String, String> Properties;

		/**
		* ODATA Metadata information about the model instance
		*/
	public String getMetadataUrl() {
		return MetadataUrl;
	}

		/**
		* ODATA Metadata information about the model instance
		*/
	public void setMetadataUrl(String metadataurl) {
		MetadataUrl = metadataurl;
	}
		/**
		* Object Identifier
		*/
	public String getId() {
		return Id;
	}

		/**
		* Object Identifier
		*/
	public void setId(String id) {
		Id = id;
	}
	public URI geturl() {
		return url;
	}

	public void seturl(URI url) {
		url = url;
	}
	public Map<String, String> getProperties() {
		return Properties;
	}

	public void setProperties(Map<String, String> properties) {
		Properties = properties;
	}

		public void addProperty(String key, Object value) {
			if(value == null) return;
			
			if(Properties == null) {
				Properties = new HashMap<String,String>();
			}

			Properties.put(key, value.toString());
		}
}