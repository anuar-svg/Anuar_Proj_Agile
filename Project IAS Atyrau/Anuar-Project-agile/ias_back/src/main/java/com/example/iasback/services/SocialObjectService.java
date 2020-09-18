package com.example.iasback.services;

import com.example.iasback.models.FullSocialObjects;
import com.example.iasback.repository.SocialObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SocialObjectService {


    @Autowired
    SocialObjectMapper socialObjectMapper;


    public List<FullSocialObjects> getSocialObjects(){
        return socialObjectMapper.fullSocObj();
    }
}


