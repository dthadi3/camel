
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.sheets;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.sheets.v4.Sheets$Spreadsheets
 */
@ApiParams(apiName = "spreadsheets", apiMethods = "batchUpdate,create,developerMetadata,get,getByDataFilter,sheets,values")
@UriParams
@Configurer
public final class SheetsSpreadsheetsEndpointConfiguration extends GoogleSheetsConfiguration {
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest")
    private com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest batchUpdateSpreadsheetRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.Spreadsheet")
    private com.google.api.services.sheets.v4.model.Spreadsheet content;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest")
    private com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest getSpreadsheetByDataFilterRequest;
    @UriParam(description = "The spreadsheet to apply the updates to")
    private String spreadsheetId;

    public com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest getBatchUpdateSpreadsheetRequest() {
        return batchUpdateSpreadsheetRequest;
    }

    public void setBatchUpdateSpreadsheetRequest(com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest batchUpdateSpreadsheetRequest) {
        this.batchUpdateSpreadsheetRequest = batchUpdateSpreadsheetRequest;
    }

    public com.google.api.services.sheets.v4.model.Spreadsheet getContent() {
        return content;
    }

    public void setContent(com.google.api.services.sheets.v4.model.Spreadsheet content) {
        this.content = content;
    }

    public com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest getGetSpreadsheetByDataFilterRequest() {
        return getSpreadsheetByDataFilterRequest;
    }

    public void setGetSpreadsheetByDataFilterRequest(com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest getSpreadsheetByDataFilterRequest) {
        this.getSpreadsheetByDataFilterRequest = getSpreadsheetByDataFilterRequest;
    }

    public String getSpreadsheetId() {
        return spreadsheetId;
    }

    public void setSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }
}
