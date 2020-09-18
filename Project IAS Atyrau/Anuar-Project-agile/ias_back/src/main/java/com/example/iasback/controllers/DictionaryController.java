package com.example.iasback.controllers;

import com.example.iasback.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {


    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping("/update_dictionary")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String updateDictionary(@RequestBody String dictionary) {
        return dictionaryService.updateDictionaryService(dictionary);
    }


    @GetMapping("/words")
    public String getDictionary()  {
        return dictionaryService.getDictionary();
    }
}
