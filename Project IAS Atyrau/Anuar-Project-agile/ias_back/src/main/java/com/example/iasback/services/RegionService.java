package com.example.iasback.services;

import com.example.iasback.models.Region;
import com.example.iasback.models.User;
import com.example.iasback.repository.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    RegionMapper regionMapper;


    public List<Region> regionList(){
        return regionMapper.getRegions();
    }

}
