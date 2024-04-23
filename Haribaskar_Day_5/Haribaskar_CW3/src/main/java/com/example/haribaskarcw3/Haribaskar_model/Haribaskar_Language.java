package com.example.haribaskarcw3.Haribaskar_model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Haribaskar_Language {
    @Id
    private int languageId;
    private String languageName;
    private String languageComplexity;
    public Haribaskar_Language() {
    }
    public Haribaskar_Language(int languageId, String languageName, String languageComplexity) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.languageComplexity = languageComplexity;
    }
    public int getLanguageId() {
        return languageId;
    }
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public String getLanguageComplexity() {
        return languageComplexity;
    }
    public void setLanguageComplexity(String languageComplexity) {
        this.languageComplexity = languageComplexity;
    }
    
}
