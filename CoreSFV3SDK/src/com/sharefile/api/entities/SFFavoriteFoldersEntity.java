
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

package com.sharefile.api.entities;

import com.sharefile.api.*;
import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.enumerations.SFSafeEnumFlags;

public class SFFavoriteFoldersEntity extends SFODataEntityBase
{
	public SFFavoriteFoldersEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get List of FavoriteFolders
	* Retrieves the list of Favorite folders for a given user.
	* @param url 	 	
	* @return A list of Favorite Folders specified by this user
	*/
	public ISFQuery<SFODataFeed<SFFavoriteFolder>> getByUser(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFODataFeed<SFFavoriteFolder>> sfApiQuery = new SFApiQuery<SFODataFeed<SFFavoriteFolder>>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("FavoriteFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get FavoriteFolder
	* Retrieves a single Favorite Folder
	* @param itemUrl 	 	
	* @return A list of Favorite Folders specified by this user
	*/
	public ISFQuery<SFFavoriteFolder> getByUser(URI itemUrl, String userid) throws InvalidOrMissingParameterException 	{
		if (itemUrl == null) {
			throw new InvalidOrMissingParameterException("itemUrl");
		}
		if (userid == null) {
			throw new InvalidOrMissingParameterException("userid");
		}

		SFApiQuery<SFFavoriteFolder> sfApiQuery = new SFApiQuery<SFFavoriteFolder>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("FavoriteFolders");
		sfApiQuery.addIds(itemUrl);
		sfApiQuery.addActionIds(userid);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Item as Favorite Folder
	* Retrieves a Favorite Folder representation of a given parent Item
	* @param parentUrl 	 	
	* @return The specified Favorite Folder if it belongs to the specified parent Item
	*/
	public ISFQuery<SFFavoriteFolder> getFavoriteFolderByItem(URI parentUrl) throws InvalidOrMissingParameterException 	{
		if (parentUrl == null) {
			throw new InvalidOrMissingParameterException("parentUrl");
		}

		SFApiQuery<SFFavoriteFolder> sfApiQuery = new SFApiQuery<SFFavoriteFolder>(this.client);
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("FavoriteFolder");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get FavoriteFolder
	* Retrieve a single Favorite Folder from a give user
	* @return The selected Favorite Folder
	*/
	public ISFQuery<SFFavoriteFolder> get(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFFavoriteFolder> sfApiQuery = new SFApiQuery<SFFavoriteFolder>(this.client);
		sfApiQuery.setFrom("FavoriteFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Create FavoriteFolder
    * {
    * "Folder": { "Id":"fo96aec5-d637-4124-bcc9-c86fd7301e4d" },
    * "FolderAlias" : "alias"
    * }
	* Adds an existing folder to the list of favorites of a given user.
	* @param url 	 	
	* @param folder 	 	
	* @return A new FavoriteFolder record
	*/
	public ISFQuery<SFFavoriteFolder> createByUser(URI url, SFFavoriteFolder folder) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (folder == null) {
			throw new InvalidOrMissingParameterException("folder");
		}

		SFApiQuery<SFFavoriteFolder> sfApiQuery = new SFApiQuery<SFFavoriteFolder>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("FavoriteFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(folder);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Delete FavoriteFolder
	* Removes a favorite folder from a user's list.
	* @param url 	 	
	*/
	public ISFQuery delete(URI url, String itemid) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (itemid == null) {
			throw new InvalidOrMissingParameterException("itemid");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("FavoriteFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(itemid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	public ISFQuery deleteByUser(URI url, String itemId) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (itemId == null) {
			throw new InvalidOrMissingParameterException("itemId");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("FavoriteFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(itemId);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

