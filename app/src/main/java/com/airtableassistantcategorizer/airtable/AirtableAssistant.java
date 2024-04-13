package com.airtableassistantcategorizer.airtable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableAssistant {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Subtitle")
    private String subtitle;

    @JsonProperty("ShortDescription")
    private String shortDescription;

    @JsonProperty("MediumDescription")
    private String mediumDescription;

    @JsonProperty("WhoItsForTitle")
    private String whoItsForTitle;

    @JsonProperty("WhoItsForDescription")
    private String whoItsForDescription;

    @JsonProperty("WhoItsForExample1")
    private String whoItsForExample1;

    @JsonProperty("WhoItsForExample2")
    private String whoItsForExample2;

    @JsonProperty("WhoItsForExample3")
    private String whoItsForExample3;

    @JsonProperty("WhoItsForExample4")
    private String whoItsForExample4;

    @JsonProperty("HowToUseTitle")
    private String howToUseTitle;

    @JsonProperty("HowToUseDescription1")
    private String howToUseDescription1;

    @JsonProperty("HowToUseDescription2")
    private String howToUseDescription2;

    @JsonProperty("HowToUseDescription3")
    private String howToUseDescription3;

    @JsonProperty("HowToUseDescription4")
    private String howToUseDescription4;

    @JsonProperty("HowToUseDescription5")
    private String howToUseDescription5;

    @JsonProperty("FAQ1Title")
    private String FAQ1Title;

    @JsonProperty("FAQ1Description")
    private String FAQ1Description;

    @JsonProperty("FAQ2Title")
    private String FAQ2Title;

    @JsonProperty("FAQ2Description")
    private String FAQ2Description;

    @JsonProperty("FAQ3Title")
    private String FAQ3Title;

    @JsonProperty("FAQ3Description")
    private String FAQ3Description;

    @JsonProperty("FAQ4Title")
    private String FAQ4Title;

    @JsonProperty("FAQ4Description")
    private String FAQ4Description;

    @JsonProperty("SystemPrompt")
    private String systemPrompt;

    @JsonProperty("InitialMessage")
    private String initialMessage;

    @JsonProperty("Emoji")
    private String emoji;

    @JsonProperty("UsageMessages")
    private Integer usageMessages;

    @JsonProperty("UsageUsers")
    private Integer usageUsers;

    public AirtableAssistant() {

    }

    public AirtableAssistant(String name, String category, String subtitle, String shortDescription, String mediumDescription, String whoItsForTitle, String whoItsForDescription, String whoItsForExample1, String whoItsForExample2, String whoItsForExample3, String whoItsForExample4, String howToUseTitle, String howToUseDescription1, String howToUseDescription2, String howToUseDescription3, String howToUseDescription4, String howToUseDescription5, String FAQ1Title, String FAQ1Description, String FAQ2Title, String FAQ2Description, String FAQ3Title, String FAQ3Description, String FAQ4Title, String FAQ4Description, String systemPrompt, String initialMessage, String emoji, Integer usageMessages, Integer usageUsers) {
        this.name = name;
        this.category = category;
        this.subtitle = subtitle;
        this.shortDescription = shortDescription;
        this.mediumDescription = mediumDescription;
        this.whoItsForTitle = whoItsForTitle;
        this.whoItsForDescription = whoItsForDescription;
        this.whoItsForExample1 = whoItsForExample1;
        this.whoItsForExample2 = whoItsForExample2;
        this.whoItsForExample3 = whoItsForExample3;
        this.whoItsForExample4 = whoItsForExample4;
        this.howToUseTitle = howToUseTitle;
        this.howToUseDescription1 = howToUseDescription1;
        this.howToUseDescription2 = howToUseDescription2;
        this.howToUseDescription3 = howToUseDescription3;
        this.howToUseDescription4 = howToUseDescription4;
        this.howToUseDescription5 = howToUseDescription5;
        this.FAQ1Title = FAQ1Title;
        this.FAQ1Description = FAQ1Description;
        this.FAQ2Title = FAQ2Title;
        this.FAQ2Description = FAQ2Description;
        this.FAQ3Title = FAQ3Title;
        this.FAQ3Description = FAQ3Description;
        this.FAQ4Title = FAQ4Title;
        this.FAQ4Description = FAQ4Description;
        this.systemPrompt = systemPrompt;
        this.initialMessage = initialMessage;
        this.emoji = emoji;
        this.usageMessages = usageMessages;
        this.usageUsers = usageUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getMediumDescription() {
        return mediumDescription;
    }

    public void setMediumDescription(String mediumDescription) {
        this.mediumDescription = mediumDescription;
    }

    public String getWhoItsForTitle() {
        return whoItsForTitle;
    }

    public void setWhoItsForTitle(String whoItsForTitle) {
        this.whoItsForTitle = whoItsForTitle;
    }

    public String getWhoItsForDescription() {
        return whoItsForDescription;
    }

    public void setWhoItsForDescription(String whoItsForDescription) {
        this.whoItsForDescription = whoItsForDescription;
    }

    public String getWhoItsForExample1() {
        return whoItsForExample1;
    }

    public void setWhoItsForExample1(String whoItsForExample1) {
        this.whoItsForExample1 = whoItsForExample1;
    }

    public String getWhoItsForExample2() {
        return whoItsForExample2;
    }

    public void setWhoItsForExample2(String whoItsForExample2) {
        this.whoItsForExample2 = whoItsForExample2;
    }

    public String getWhoItsForExample3() {
        return whoItsForExample3;
    }

    public void setWhoItsForExample3(String whoItsForExample3) {
        this.whoItsForExample3 = whoItsForExample3;
    }

    public String getWhoItsForExample4() {
        return whoItsForExample4;
    }

    public void setWhoItsForExample4(String whoItsForExample4) {
        this.whoItsForExample4 = whoItsForExample4;
    }

    public String getHowToUseTitle() {
        return howToUseTitle;
    }

    public void setHowToUseTitle(String howToUseTitle) {
        this.howToUseTitle = howToUseTitle;
    }

    public String getHowToUseDescription1() {
        return howToUseDescription1;
    }

    public void setHowToUseDescription1(String howToUseDescription1) {
        this.howToUseDescription1 = howToUseDescription1;
    }

    public String getHowToUseDescription2() {
        return howToUseDescription2;
    }

    public void setHowToUseDescription2(String howToUseDescription2) {
        this.howToUseDescription2 = howToUseDescription2;
    }

    public String getHowToUseDescription3() {
        return howToUseDescription3;
    }

    public void setHowToUseDescription3(String howToUseDescription3) {
        this.howToUseDescription3 = howToUseDescription3;
    }

    public String getHowToUseDescription4() {
        return howToUseDescription4;
    }

    public void setHowToUseDescription4(String howToUseDescription4) {
        this.howToUseDescription4 = howToUseDescription4;
    }

    public String getHowToUseDescription5() {
        return howToUseDescription5;
    }

    public void setHowToUseDescription5(String howToUseDescription5) {
        this.howToUseDescription5 = howToUseDescription5;
    }

    public String getFAQ1Title() {
        return FAQ1Title;
    }

    public void setFAQ1Title(String FAQ1Title) {
        this.FAQ1Title = FAQ1Title;
    }

    public String getFAQ1Description() {
        return FAQ1Description;
    }

    public void setFAQ1Description(String FAQ1Description) {
        this.FAQ1Description = FAQ1Description;
    }

    public String getFAQ2Title() {
        return FAQ2Title;
    }

    public void setFAQ2Title(String FAQ2Title) {
        this.FAQ2Title = FAQ2Title;
    }

    public String getFAQ2Description() {
        return FAQ2Description;
    }

    public void setFAQ2Description(String FAQ2Description) {
        this.FAQ2Description = FAQ2Description;
    }

    public String getFAQ3Title() {
        return FAQ3Title;
    }

    public void setFAQ3Title(String FAQ3Title) {
        this.FAQ3Title = FAQ3Title;
    }

    public String getFAQ3Description() {
        return FAQ3Description;
    }

    public void setFAQ3Description(String FAQ3Description) {
        this.FAQ3Description = FAQ3Description;
    }

    public String getFAQ4Title() {
        return FAQ4Title;
    }

    public void setFAQ4Title(String FAQ4Title) {
        this.FAQ4Title = FAQ4Title;
    }

    public String getFAQ4Description() {
        return FAQ4Description;
    }

    public void setFAQ4Description(String FAQ4Description) {
        this.FAQ4Description = FAQ4Description;
    }

    public String getSystemPrompt() {
        return systemPrompt;
    }

    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public String getInitialMessage() {
        return initialMessage;
    }

    public void setInitialMessage(String initialMessage) {
        this.initialMessage = initialMessage;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public Integer getUsageMessages() {
        return usageMessages;
    }

    public void setUsageMessages(Integer usageMessages) {
        this.usageMessages = usageMessages;
    }

    public Integer getUsageUsers() {
        return usageUsers;
    }

    public void setUsageUsers(Integer usageUsers) {
        this.usageUsers = usageUsers;
    }

}
