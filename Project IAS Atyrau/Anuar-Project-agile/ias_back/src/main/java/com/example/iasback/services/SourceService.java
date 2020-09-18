package com.example.iasback.services;

import com.example.iasback.models.Source;
import com.example.iasback.repository.SourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceService {

    @Autowired
    SourceMapper sourceMapper;


    public List<Source> sourceList(){
        return sourceMapper.getSources();
    }

}
