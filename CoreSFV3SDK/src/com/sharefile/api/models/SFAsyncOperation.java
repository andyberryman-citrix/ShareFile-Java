
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

public class SFAsyncOperation extends SFODataObject {

	@SerializedName("Operation")
	private SFSafeEnum<SFAsyncOperationType> Operation;
	@SerializedName("Account")
	private SFAccount Account;
	@SerializedName("AuthorityZone")
	private SFZone AuthorityZone;
	@SerializedName("Source")
	private SFItem Source;
	@SerializedName("User")
	private SFUser User;
	@SerializedName("CreationDate")
	private Date CreationDate;
	@SerializedName("State")
	private SFSafeEnum<SFAsyncOperationState> State;
	@SerializedName("UpdateDate")
	private Date UpdateDate;
	@SerializedName("Target")
	private SFItem Target;
	@SerializedName("BatchID")
	private String BatchID;
	@SerializedName("BatchSourceID")
	private String BatchSourceID;
	@SerializedName("BatchTargetID")
	private String BatchTargetID;

		/**
		* Operation type
		*/
	public SFSafeEnum<SFAsyncOperationType> getOperation() {
		return Operation;
	}

		/**
		* Operation type
		*/
	public void setOperation(SFSafeEnum<SFAsyncOperationType> operation) {
		Operation = operation;
	}
		/**
		* ShareFile Account
		*/
	public SFAccount getAccount() {
		return Account;
	}

		/**
		* ShareFile Account
		*/
	public void setAccount(SFAccount account) {
		Account = account;
	}
		/**
		* Represents the Zone that is driving the asynchronous operation process. It
		* may be null if the operation is driven by the control plane.
		*/
	public SFZone getAuthorityZone() {
		return AuthorityZone;
	}

		/**
		* Represents the Zone that is driving the asynchronous operation process. It
		* may be null if the operation is driven by the control plane.
		*/
	public void setAuthorityZone(SFZone authorityzone) {
		AuthorityZone = authorityzone;
	}
		/**
		* Source Item for the operation.
		*/
	public SFItem getSource() {
		return Source;
	}

		/**
		* Source Item for the operation.
		*/
	public void setSource(SFItem source) {
		Source = source;
	}
		/**
		* User that initiated the operation
		*/
	public SFUser getUser() {
		return User;
	}

		/**
		* User that initiated the operation
		*/
	public void setUser(SFUser user) {
		User = user;
	}
		/**
		* Operation creation date
		*/
	public Date getCreationDate() {
		return CreationDate;
	}

		/**
		* Operation creation date
		*/
	public void setCreationDate(Date creationdate) {
		CreationDate = creationdate;
	}
		/**
		* Operation state. States 'Created' and 'Scheduled' indicate the operation is
		* in progress; States 'Success' and 'Failure' indicate the operatoin is finalized
		*/
	public SFSafeEnum<SFAsyncOperationState> getState() {
		return State;
	}

		/**
		* Operation state. States 'Created' and 'Scheduled' indicate the operation is
		* in progress; States 'Success' and 'Failure' indicate the operatoin is finalized
		*/
	public void setState(SFSafeEnum<SFAsyncOperationState> state) {
		State = state;
	}
		/**
		* Last time the operation state was modified
		*/
	public Date getUpdateDate() {
		return UpdateDate;
	}

		/**
		* Last time the operation state was modified
		*/
	public void setUpdateDate(Date updatedate) {
		UpdateDate = updatedate;
	}
		/**
		* Target Item for the operation.
		*/
	public SFItem getTarget() {
		return Target;
	}

		/**
		* Target Item for the operation.
		*/
	public void setTarget(SFItem target) {
		Target = target;
	}
		/**
		* Batch Identifier for an asynchronous operation that includes multiple Items - for
		* example, a recursive Copy will create a single AsyncOp instance per file, all sharing
		* the same BatchID
		*/
	public String getBatchID() {
		return BatchID;
	}

		/**
		* Batch Identifier for an asynchronous operation that includes multiple Items - for
		* example, a recursive Copy will create a single AsyncOp instance per file, all sharing
		* the same BatchID
		*/
	public void setBatchID(String batchid) {
		BatchID = batchid;
	}
		/**
		* Item ID used as source for the Batch operation
		*/
	public String getBatchSourceID() {
		return BatchSourceID;
	}

		/**
		* Item ID used as source for the Batch operation
		*/
	public void setBatchSourceID(String batchsourceid) {
		BatchSourceID = batchsourceid;
	}
		/**
		* Item ID used as target for the Batch operation
		*/
	public String getBatchTargetID() {
		return BatchTargetID;
	}

		/**
		* Item ID used as target for the Batch operation
		*/
	public void setBatchTargetID(String batchtargetid) {
		BatchTargetID = batchtargetid;
	}

}