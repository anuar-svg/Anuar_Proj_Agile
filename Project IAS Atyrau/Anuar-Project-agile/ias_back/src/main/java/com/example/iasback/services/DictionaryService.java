package com.example.iasback.services;


import com.example.iasback.models.Dictionary;
import com.example.iasback.repository.DictionaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService {

    @Autowired
    DictionaryMapper dictionaryMapper;

    public String getDictionary() {
        return dictionaryMapper.getDictionary();
    }

    public String updateDictionaryService(String dictionary) {
        return dictionaryMapper.updateDictionaryMapper(dictionary);
    }
}
