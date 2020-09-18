package com.example.iasback.services;

import com.example.iasback.models.Category;
import com.example.iasback.models.Region;
import com.example.iasback.models.User;
import com.example.iasback.repository.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;


    public List<Category> categoryList(){
        return categoryMapper.getCategories();
    }

}
