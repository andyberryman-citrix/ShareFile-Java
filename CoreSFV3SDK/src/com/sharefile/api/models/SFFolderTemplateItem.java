
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

public class SFFolderTemplateItem extends SFODataObject {

	@SerializedName("Name")
	private String Name;
	@SerializedName("Description")
	private String Description;
	@SerializedName("Items")
	private ArrayList<SFFolderTemplateItem> Items;

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}
	public ArrayList<SFFolderTemplateItem> getItems() {
		return this.Items;
	}

	public void setItems(ArrayList<SFFolderTemplateItem> items) {
		this.Items = items;
	}

}