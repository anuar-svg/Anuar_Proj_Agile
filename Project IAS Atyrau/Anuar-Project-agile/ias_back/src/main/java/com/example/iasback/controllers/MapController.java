package com.example.iasback.controllers;

import com.example.iasback.models.*;
import com.example.iasback.services.CategoryService;
import com.example.iasback.services.RegionService;
import com.example.iasback.services.SocialObjectService;
import com.example.iasback.services.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/map")
public class MapController {


    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private SocialObjectService socialObjectService;

    @Autowired
    private SourceService sourceService;

    @GetMapping("/social_objects")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<FullSocialObjects> socialObjectsList() {
        return socialObjectService.getSocialObjects();
    }



    @GetMapping("/categories")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Category> categories() {
        return categoryService.categoryList();
    }

    @GetMapping("/regions")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Region> regions() {
        return regionService.regionList();
    }

    @GetMapping("/sources")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Source> sources() {
        return sourceService.sourceList();
    }

}
