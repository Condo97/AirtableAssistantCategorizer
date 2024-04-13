package com.airtableassistantcategorizer.airtable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAssistantsRequest {

    private String offset;

    public ListAssistantsRequest() {

    }

    public ListAssistantsRequest(String offset) {
        this.offset = offset;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

}
