






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


public class SFSimpleQuery extends SFODataObject {



	@SerializedName("AuthID")

	private String AuthID;


	@SerializedName("ItemType")

	private String ItemType;


	@SerializedName("ParentID")

	private String ParentID;


	@SerializedName("CreatorID")

	private String CreatorID;


	@SerializedName("LuceneQuery")

	private String LuceneQuery;


	@SerializedName("SearchQuery")

	private String SearchQuery;


	@SerializedName("CreateStartDate")

	private String CreateStartDate;


	@SerializedName("CreateEndDate")

	private String CreateEndDate;


	@SerializedName("ItemNameOnly")

	private Boolean ItemNameOnly;




	public String getAuthID() {
		return AuthID;
	}


	public void setAuthID(String authid) {
		AuthID = authid;
	}


	public String getItemType() {
		return ItemType;
	}


	public void setItemType(String itemtype) {
		ItemType = itemtype;
	}


	public String getParentID() {
		return ParentID;
	}


	public void setParentID(String parentid) {
		ParentID = parentid;
	}


	public String getCreatorID() {
		return CreatorID;
	}


	public void setCreatorID(String creatorid) {
		CreatorID = creatorid;
	}


	public String getLuceneQuery() {
		return LuceneQuery;
	}


	public void setLuceneQuery(String lucenequery) {
		LuceneQuery = lucenequery;
	}


	public String getSearchQuery() {
		return SearchQuery;
	}


	public void setSearchQuery(String searchquery) {
		SearchQuery = searchquery;
	}


	public String getCreateStartDate() {
		return CreateStartDate;
	}


	public void setCreateStartDate(String createstartdate) {
		CreateStartDate = createstartdate;
	}


	public String getCreateEndDate() {
		return CreateEndDate;
	}


	public void setCreateEndDate(String createenddate) {
		CreateEndDate = createenddate;
	}


	public Boolean getItemNameOnly() {
		return ItemNameOnly;
	}


	public void setItemNameOnly(Boolean itemnameonly) {
		ItemNameOnly = itemnameonly;
	}

}