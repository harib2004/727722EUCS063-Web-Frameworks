package com.example.haribaskarcw3.Haribaskar_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.haribaskarcw3.Haribaskar_model.Haribaskar_Language;
import com.example.haribaskarcw3.Haribaskar_repository.Haribaskar_LanguageRepo;

@Service
public class Haribaskar_LanguageService {
    private Haribaskar_LanguageRepo languageRepo;

    public Haribaskar_LanguageService(Haribaskar_LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }

    public boolean saveLanguage(Haribaskar_Language language) {
        try {
            languageRepo.save(language);

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Haribaskar_Language> getLanguages() {
        return languageRepo.findAll();
    }

    public boolean updateLanguage(int id, Haribaskar_Language language) {
        if (getLanguageById(id) == null) {
            return false;
        }
        try {
            languageRepo.save(language);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteLanguage(int id) {
        if (getLanguageById(id) == null) {
            return false;
        }
        languageRepo.deleteById(id);
        return true;

    }

    public Haribaskar_Language getLanguageById(int id) {
        return languageRepo.findById(id).orElse(null);
    }

}
