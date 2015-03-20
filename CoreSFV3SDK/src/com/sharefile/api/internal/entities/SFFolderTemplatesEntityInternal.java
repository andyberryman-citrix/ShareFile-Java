
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

package com.sharefile.api.internal.entities;

import com.sharefile.api.*;
import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.internal.models.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.enumerations.SFSafeEnumFlags;

public class SFFolderTemplatesEntityInternal extends SFFolderTemplatesEntity
{
	public SFFolderTemplatesEntityInternal(ISFApiClient client) {
		super(client);
	}

	public ISFQuery<SFAsyncOperation> bulkApply(URI url, String folderId, Integer batchSize) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (folderId == null) {
			throw new InvalidOrMissingParameterException("folderId");
		}
		if (batchSize == null) {
			throw new InvalidOrMissingParameterException("batchSize");
		}

		SFApiQuery<SFAsyncOperation> sfApiQuery = new SFApiQuery<SFAsyncOperation>(this.client);
		sfApiQuery.setFrom("FolderTemplates");
		sfApiQuery.setAction("BulkApply");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("folderId", folderId);
		sfApiQuery.addQueryString("batchSize", batchSize);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<SFAsyncOperation> bulkApply(URI url, String folderId) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (folderId == null) {
			throw new InvalidOrMissingParameterException("folderId");
		}

		SFApiQuery<SFAsyncOperation> sfApiQuery = new SFApiQuery<SFAsyncOperation>(this.client);
		sfApiQuery.setFrom("FolderTemplates");
		sfApiQuery.setAction("BulkApply");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("folderId", folderId);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

