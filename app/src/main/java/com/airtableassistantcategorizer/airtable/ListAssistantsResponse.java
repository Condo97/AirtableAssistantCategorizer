package com.airtableassistantcategorizer.airtable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAssistantsResponse {

    public static class Record {

        private String id;
        private String createdTime;
        private AirtableAssistant fields;

        public Record() {

        }

        public Record(String id, String createdTime, AirtableAssistant fields) {
            this.id = id;
            this.createdTime = createdTime;
            this.fields = fields;
        }

        public String getId() {
            return id;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public AirtableAssistant getFields() {
            return fields;
        }

    }

    private List<Record> records;
    private String offset;

    public ListAssistantsResponse() {

    }

    public ListAssistantsResponse(List<Record> records, String offset) {
        this.records = records;
        this.offset = offset;
    }

    public List<Record> getRecords() {
        return records;
    }

    public String getOffset() {
        return offset;
    }

}
