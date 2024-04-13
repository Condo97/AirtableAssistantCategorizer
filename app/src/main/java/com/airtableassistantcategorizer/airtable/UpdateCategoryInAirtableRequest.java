package com.airtableassistantcategorizer.airtable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UpdateCategoryInAirtableRequest {

    public static class AssistantIDCategory {

        @JsonProperty("Category")
        private String category;

        public AssistantIDCategory() {

        }

        public AssistantIDCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

    }

    private AssistantIDCategory fields;

    public UpdateCategoryInAirtableRequest() {

    }

    public UpdateCategoryInAirtableRequest(AssistantIDCategory fields) {
        this.fields = fields;
    }

    public AssistantIDCategory getFields() {
        return fields;
    }


}
