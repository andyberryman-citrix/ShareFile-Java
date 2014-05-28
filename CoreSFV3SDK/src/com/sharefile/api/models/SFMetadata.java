






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


public class SFMetadata extends SFODataObject {



	@SerializedName("Name")

	private String Name;


	@SerializedName("Value")

	private String Value;


	@SerializedName("IsPublic")

	private Boolean IsPublic;




		/**

		* The name of a custom metadata entry

		*/

	public String getName() {
		return Name;
	}


		/**

		* The name of a custom metadata entry

		*/

	public void setName(String name) {
		Name = name;
	}


		/**

		* The value of a custom metadata entry

		*/

	public String getValue() {
		return Value;
	}


		/**

		* The value of a custom metadata entry

		*/

	public void setValue(String value) {
		Value = value;
	}


		/**

		* Whether the metadata entry is public or private. Used only by the zone or storage center metadata where only zone admins have access to private metadata.

		*/

	public Boolean getIsPublic() {
		return IsPublic;
	}


		/**

		* Whether the metadata entry is public or private. Used only by the zone or storage center metadata where only zone admins have access to private metadata.

		*/

	public void setIsPublic(Boolean ispublic) {
		IsPublic = ispublic;
	}

}