
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

public class SFStorageCenter extends SFODataObject {

	@SerializedName("Zone")
	private SFZone Zone;
	@SerializedName("Address")
	private String Address;
	@SerializedName("LocalAddress")
	private String LocalAddress;
	@SerializedName("ExternalAddress")
	private String ExternalAddress;
	@SerializedName("DefaultExternalUrl")
	private String DefaultExternalUrl;
	@SerializedName("HostName")
	private String HostName;
	@SerializedName("Services")
	private SFSafeEnumFlags<SFZoneService> Services;
	@SerializedName("Version")
	private String Version;
	@SerializedName("Enabled")
	private Boolean Enabled;
	@SerializedName("LastHeartBeat")
	private Date LastHeartBeat;
	@SerializedName("ExternalUrl")
	private String ExternalUrl;
	@SerializedName("MetadataProxyAddress")
	private String MetadataProxyAddress;
	@SerializedName("LastPingBack")
	private Date LastPingBack;
	@SerializedName("Metadata")
	private ArrayList<SFMetadata> Metadata;

	public SFZone getZone() {
		return this.Zone;
	}

	public void setZone(SFZone zone) {
		this.Zone = zone;
	}
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	public String getLocalAddress() {
		return this.LocalAddress;
	}

	public void setLocalAddress(String localaddress) {
		this.LocalAddress = localaddress;
	}
	public String getExternalAddress() {
		return this.ExternalAddress;
	}

	public void setExternalAddress(String externaladdress) {
		this.ExternalAddress = externaladdress;
	}
	public String getDefaultExternalUrl() {
		return this.DefaultExternalUrl;
	}

	public void setDefaultExternalUrl(String defaultexternalurl) {
		this.DefaultExternalUrl = defaultexternalurl;
	}
	public String getHostName() {
		return this.HostName;
	}

	public void setHostName(String hostname) {
		this.HostName = hostname;
	}
	public SFSafeEnumFlags<SFZoneService> getServices() {
		return this.Services;
	}

	public void setServices(SFSafeEnumFlags<SFZoneService> services) {
		this.Services = services;
	}
	public String getVersion() {
		return this.Version;
	}

	public void setVersion(String version) {
		this.Version = version;
	}
	public Boolean getEnabled() {
		return this.Enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.Enabled = enabled;
	}
	public Date getLastHeartBeat() {
		return this.LastHeartBeat;
	}

	public void setLastHeartBeat(Date lastheartbeat) {
		this.LastHeartBeat = lastheartbeat;
	}
	public String getExternalUrl() {
		return this.ExternalUrl;
	}

	public void setExternalUrl(String externalurl) {
		this.ExternalUrl = externalurl;
	}
	public String getMetadataProxyAddress() {
		return this.MetadataProxyAddress;
	}

	public void setMetadataProxyAddress(String metadataproxyaddress) {
		this.MetadataProxyAddress = metadataproxyaddress;
	}
	public Date getLastPingBack() {
		return this.LastPingBack;
	}

	public void setLastPingBack(Date lastpingback) {
		this.LastPingBack = lastpingback;
	}
	public ArrayList<SFMetadata> getMetadata() {
		return this.Metadata;
	}

	public void setMetadata(ArrayList<SFMetadata> metadata) {
		this.Metadata = metadata;
	}

}