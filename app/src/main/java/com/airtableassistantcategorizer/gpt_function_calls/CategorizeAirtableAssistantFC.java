package com.airtableassistantcategorizer.gpt_function_calls;

import com.oaigptconnector.model.FCParameter;
import com.oaigptconnector.model.FunctionCall;

@FunctionCall(name = "Categorize_Assistant_Spec", functionDescription = "Categorizes an assistant into a one or two word study or education related category tag")
public class CategorizeAirtableAssistantFC {

    @FCParameter(name = "category", description = "The category tag")
    private String category;

    public CategorizeAirtableAssistantFC() {

    }

    public CategorizeAirtableAssistantFC(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

}
