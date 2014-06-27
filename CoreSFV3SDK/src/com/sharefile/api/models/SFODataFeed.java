
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

public class SFODataFeed<T> extends SFODataObject {

	@SerializedName("odata.count")
	private Integer count;
	@SerializedName("value")
	private ArrayList<T> Feed;
	@SerializedName("odata.nextLink")
	private String NextLink;

	public Integer getcount() {
		return count;
	}

	public void setcount(Integer count) {
		count = count;
	}
	public ArrayList<T> getFeed() {
		return Feed;
	}

	public void setFeed(ArrayList<T> feed) {
		Feed = feed;
	}
	public String getNextLink() {
		return NextLink;
	}

	public void setNextLink(String nextlink) {
		NextLink = nextlink;
	}

}