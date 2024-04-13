package com.airtableassistantcategorizer.airtable;

public class AirtableAssistantAndRecordID {

    private AirtableAssistant airtableAssistant;
    private String recordID;

    public AirtableAssistantAndRecordID() {

    }

    public AirtableAssistantAndRecordID(AirtableAssistant airtableAssistant, String recordID) {
        this.airtableAssistant = airtableAssistant;
        this.recordID = recordID;
    }

    public AirtableAssistant getAirtableAssistant() {
        return airtableAssistant;
    }

    public String getRecordID() {
        return recordID;
    }

}
