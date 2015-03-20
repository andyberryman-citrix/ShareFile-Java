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

import java.util.HashMap;

public class EntityTypeMap {

    private static final Map<string, Class> _entityTypeMap = new HashMap<string, Class>();
    private static Object mapLock = new Object();

    public static Map<string, Class> getEntityTypeMap() {
        synchronized(mapLock) {
            if(_entityTypeMap.size() > 0) {
                return _entityTypeMap;
            }

            _entityTypeMap.Add("AccessControlsBulkParams", SFAccessControlsBulkParams.class);
            _entityTypeMap.Add("AccessControlsBulkParamss", SFAccessControlsBulkParams.class);
            _entityTypeMap.Add("AccessControlParam", SFAccessControlParam.class);
            _entityTypeMap.Add("AccessControlParams", SFAccessControlParam.class);
            _entityTypeMap.Add("InboxMetadata", SFInboxMetadata.class);
            _entityTypeMap.Add("InboxMetadatas", SFInboxMetadata.class);
            _entityTypeMap.Add("FolderTemplate", SFFolderTemplate.class);
            _entityTypeMap.Add("FolderTemplates", SFFolderTemplate.class);
            _entityTypeMap.Add("FolderTemplateItem", SFFolderTemplateItem.class);
            _entityTypeMap.Add("FolderTemplateItems", SFFolderTemplateItem.class);
            _entityTypeMap.Add("UserUsage", SFUserUsage.class);
            _entityTypeMap.Add("UserUsages", SFUserUsage.class);
            _entityTypeMap.Add("DiskSpace", SFDiskSpace.class);
            _entityTypeMap.Add("DiskSpaces", SFDiskSpace.class);
            _entityTypeMap.Add("BillingInfo", SFBillingInfo.class);
            _entityTypeMap.Add("BillingInfos", SFBillingInfo.class);
            _entityTypeMap.Add("UploadRequestParams", SFUploadRequestParams.class);
            _entityTypeMap.Add("UploadRequestParamss", SFUploadRequestParams.class);
            _entityTypeMap.Add("ESignature", SFESignature.class);
            _entityTypeMap.Add("ESignatures", SFESignature.class);
            _entityTypeMap.Add("MarketAnalytics", SFMarketAnalytics.class);
            _entityTypeMap.Add("MarketAnalyticss", SFMarketAnalytics.class);
            _entityTypeMap.Add("FileLock", SFFileLock.class);
            _entityTypeMap.Add("FileLocks", SFFileLock.class);
            _entityTypeMap.Add("PowerTools", SFPowerTools.class);
            _entityTypeMap.Add("PowerToolss", SFPowerTools.class);
            _entityTypeMap.Add("Item", SFItem.class);
            _entityTypeMap.Add("Items", SFItem.class);
            _entityTypeMap.Add("Folder", SFFolder.class);
            _entityTypeMap.Add("Folders", SFFolder.class);
            _entityTypeMap.Add("ConnectorGroup", SFConnectorGroup.class);
            _entityTypeMap.Add("ConnectorGroups", SFConnectorGroup.class);
            _entityTypeMap.Add("ConnectorGroupZone", SFConnectorGroupZone.class);
            _entityTypeMap.Add("ConnectorGroupZones", SFConnectorGroupZone.class);
            _entityTypeMap.Add("ConnectorGroupAccessControl", SFConnectorGroupAccessControl.class);
            _entityTypeMap.Add("ConnectorGroupAccessControls", SFConnectorGroupAccessControl.class);
            _entityTypeMap.Add("Principal", SFPrincipal.class);
            _entityTypeMap.Add("Principals", SFPrincipal.class);
            _entityTypeMap.Add("PreviewPlatformInfo", SFPreviewPlatformInfo.class);
            _entityTypeMap.Add("PreviewPlatformInfos", SFPreviewPlatformInfo.class);
            _entityTypeMap.Add("ShareResendParams", SFShareResendParams.class);
            _entityTypeMap.Add("ToolInformation", SFToolInformation.class);
            _entityTypeMap.Add("ToolInformations", SFToolInformation.class);
            _entityTypeMap.Add("AccessControl", SFAccessControl.class);
            _entityTypeMap.Add("AccessControls", SFAccessControl.class);
            _entityTypeMap.Add("AccessControlDomains", SFAccessControlDomains.class);
            _entityTypeMap.Add("Account", SFAccount.class);
            _entityTypeMap.Add("Accounts", SFAccount.class);
            _entityTypeMap.Add("AccountPreferences", SFAccountPreferences.class);
            _entityTypeMap.Add("User", SFUser.class);
            _entityTypeMap.Add("Users", SFUser.class);
            _entityTypeMap.Add("AccountUser", SFAccountUser.class);
            _entityTypeMap.Add("AccountUsers", SFAccountUser.class);
            _entityTypeMap.Add("AsyncOperation", SFAsyncOperation.class);
            _entityTypeMap.Add("AsyncOperations", SFAsyncOperation.class);
            _entityTypeMap.Add("Capability", SFCapability.class);
            _entityTypeMap.Add("Capabilities", SFCapability.class);
            _entityTypeMap.Add("Device", SFDevice.class);
            _entityTypeMap.Add("Devices", SFDevice.class);
            _entityTypeMap.Add("DeviceUser", SFDeviceUser.class);
            _entityTypeMap.Add("DeviceUsers", SFDeviceUser.class);
            _entityTypeMap.Add("DeviceUserWipe", SFDeviceUserWipe.class);
            _entityTypeMap.Add("DeviceUserWipes", SFDeviceUserWipe.class);
            _entityTypeMap.Add("DeviceStatus", SFDeviceStatus.class);
            _entityTypeMap.Add("DeviceStatuss", SFDeviceStatus.class);
            _entityTypeMap.Add("DeviceWipeReport", SFDeviceWipeReport.class);
            _entityTypeMap.Add("DeviceWipeReports", SFDeviceWipeReport.class);
            _entityTypeMap.Add("DeviceLogEntry", SFDeviceLogEntry.class);
            _entityTypeMap.Add("DeviceLogEntrys", SFDeviceLogEntry.class);
            _entityTypeMap.Add("DownloadSpecification", SFDownloadSpecification.class);
            _entityTypeMap.Add("DownloadSpecifications", SFDownloadSpecification.class);
            _entityTypeMap.Add("EnsSubscriberConfiguration", SFEnsSubscriberConfiguration.class);
            _entityTypeMap.Add("EnsSubscriberConfigurations", SFEnsSubscriberConfiguration.class);
            _entityTypeMap.Add("EnsSubscriptionRequest", SFEnsSubscriptionRequest.class);
            _entityTypeMap.Add("EnsSubscriptionRequests", SFEnsSubscriptionRequest.class);
            _entityTypeMap.Add("EnsSubscriptionToken", SFEnsSubscriptionToken.class);
            _entityTypeMap.Add("EnsSubscriptionTokens", SFEnsSubscriptionToken.class);
            _entityTypeMap.Add("FindSubdomainParams", SFFindSubdomainParams.class);
            _entityTypeMap.Add("FindSubdomainResult", SFFindSubdomainResult.class);
            _entityTypeMap.Add("FindSubdomainResults", SFFindSubdomainResult.class);
            _entityTypeMap.Add("GenericConfig", SFGenericConfig.class);
            _entityTypeMap.Add("GenericConfigs", SFGenericConfig.class);
            _entityTypeMap.Add("Contact", SFContact.class);
            _entityTypeMap.Add("Contacts", SFContact.class);
            _entityTypeMap.Add("FavoriteFolder", SFFavoriteFolder.class);
            _entityTypeMap.Add("FavoriteFolders", SFFavoriteFolder.class);
            _entityTypeMap.Add("File", SFFile.class);
            _entityTypeMap.Add("Files", SFFile.class);
            _entityTypeMap.Add("Group", SFGroup.class);
            _entityTypeMap.Add("Groups", SFGroup.class);
            _entityTypeMap.Add("Industry", SFIndustry.class);
            _entityTypeMap.Add("Industrys", SFIndustry.class);
            _entityTypeMap.Add("ItemInfo", SFItemInfo.class);
            _entityTypeMap.Add("ItemInfos", SFItemInfo.class);
            _entityTypeMap.Add("ItemProtocolLink", SFItemProtocolLink.class);
            _entityTypeMap.Add("ItemProtocolLinks", SFItemProtocolLink.class);
            _entityTypeMap.Add("Link", SFLink.class);
            _entityTypeMap.Add("Links", SFLink.class);
            _entityTypeMap.Add("Metadata", SFMetadata.class);
            _entityTypeMap.Add("Metadatas", SFMetadata.class);
            _entityTypeMap.Add("MobileSecuritySettings", SFMobileSecuritySettings.class);
            _entityTypeMap.Add("Note", SFNote.class);
            _entityTypeMap.Add("Notes", SFNote.class);
            _entityTypeMap.Add("Notification", SFNotification.class);
            _entityTypeMap.Add("Notifications", SFNotification.class);
            _entityTypeMap.Add("OutlookInformation", SFOutlookInformation.class);
            _entityTypeMap.Add("OutlookInformations", SFOutlookInformation.class);
            _entityTypeMap.Add("OutlookInformationOptionBool", SFOutlookInformationOptionBool.class);
            _entityTypeMap.Add("OutlookInformationOptionBools", SFOutlookInformationOptionBool.class);
            _entityTypeMap.Add("OutlookInformationOptionString", SFOutlookInformationOptionString.class);
            _entityTypeMap.Add("OutlookInformationOptionStrings", SFOutlookInformationOptionString.class);
            _entityTypeMap.Add("OutlookInformationOptionInt", SFOutlookInformationOptionInt.class);
            _entityTypeMap.Add("OutlookInformationOptionInts", SFOutlookInformationOptionInt.class);
            _entityTypeMap.Add("ProductDefaults", SFProductDefaults.class);
            _entityTypeMap.Add("Redirection", SFRedirection.class);
            _entityTypeMap.Add("Redirections", SFRedirection.class);
            _entityTypeMap.Add("RequireSubdomainResult", SFRequireSubdomainResult.class);
            _entityTypeMap.Add("RequireSubdomainResults", SFRequireSubdomainResult.class);
            _entityTypeMap.Add("RequireWebPopResult", SFRequireWebPopResult.class);
            _entityTypeMap.Add("RequireWebPopResults", SFRequireWebPopResult.class);
            _entityTypeMap.Add("SearchQuery", SFSearchQuery.class);
            _entityTypeMap.Add("SearchQueries", SFSearchQuery.class);
            _entityTypeMap.Add("Query", SFQuery.class);
            _entityTypeMap.Add("Queries", SFQuery.class);
            _entityTypeMap.Add("QueryPaging", SFQueryPaging.class);
            _entityTypeMap.Add("QueryPagings", SFQueryPaging.class);
            _entityTypeMap.Add("QuerySorting", SFQuerySorting.class);
            _entityTypeMap.Add("QuerySortings", SFQuerySorting.class);
            _entityTypeMap.Add("SimpleSearchQuery", SFSimpleSearchQuery.class);
            _entityTypeMap.Add("SimpleSearchQueries", SFSimpleSearchQuery.class);
            _entityTypeMap.Add("SimpleQuery", SFSimpleQuery.class);
            _entityTypeMap.Add("SimpleQueries", SFSimpleQuery.class);
            _entityTypeMap.Add("SearchResults", SFSearchResults.class);
            _entityTypeMap.Add("AdvancedSearchResults", SFAdvancedSearchResults.class);
            _entityTypeMap.Add("SearchResult", SFSearchResult.class);
            _entityTypeMap.Add("Session", SFSession.class);
            _entityTypeMap.Add("Sessions", SFSession.class);
            _entityTypeMap.Add("Share", SFShare.class);
            _entityTypeMap.Add("Shares", SFShare.class);
            _entityTypeMap.Add("ShareAlias", SFShareAlias.class);
            _entityTypeMap.Add("ShareAliases", SFShareAlias.class);
            _entityTypeMap.Add("ShareRequestParams", SFShareRequestParams.class);
            _entityTypeMap.Add("ShareSendParams", SFShareSendParams.class);
            _entityTypeMap.Add("SSOAccountProvider", SFSSOAccountProvider.class);
            _entityTypeMap.Add("SSOAccountProviders", SFSSOAccountProvider.class);
            _entityTypeMap.Add("SSOInfoEntry", SFSSOInfoEntry.class);
            _entityTypeMap.Add("SSOInfoEntries", SFSSOInfoEntry.class);
            _entityTypeMap.Add("SSOInfo", SFSSOInfo.class);
            _entityTypeMap.Add("SSOInfos", SFSSOInfo.class);
            _entityTypeMap.Add("StorageCenter", SFStorageCenter.class);
            _entityTypeMap.Add("StorageCenters", SFStorageCenter.class);
            _entityTypeMap.Add("SymbolicLink", SFSymbolicLink.class);
            _entityTypeMap.Add("SymbolicLinks", SFSymbolicLink.class);
            _entityTypeMap.Add("UploadSpecification", SFUploadSpecification.class);
            _entityTypeMap.Add("UploadSpecifications", SFUploadSpecification.class);
            _entityTypeMap.Add("UserConfirmationSettings", SFUserConfirmationSettings.class);
            _entityTypeMap.Add("UserInfo", SFUserInfo.class);
            _entityTypeMap.Add("UserInfos", SFUserInfo.class);
            _entityTypeMap.Add("PlanFeatures", SFPlanFeatures.class);
            _entityTypeMap.Add("UserPreferences", SFUserPreferences.class);
            _entityTypeMap.Add("UserSecurity", SFUserSecurity.class);
            _entityTypeMap.Add("UserSecurities", SFUserSecurity.class);
            _entityTypeMap.Add("Zone", SFZone.class);
            _entityTypeMap.Add("Zones", SFZone.class);
            
            return _entityTypeMap;
        }
	}
        
    /**
     * Add additional models to the type map.
     */
    public static void addEntity(string key, Class value) {
        synchronized (mapLock) {
            _entityTypeMap.Add(key, value);
        }
    }
}