package com.example.iasback.services;

import com.example.iasback.models.MenuItem;
import com.example.iasback.repository.MenuItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {


    @Autowired
    MenuItemMapper menuItemMapper;


    public List<MenuItem> getMenuItems(){
        return menuItemMapper.getMenuItems();
    }

    public MenuItem addMenuItem(MenuItem menuItem){
        return menuItemMapper.createMenuItem(menuItem);
    }

    public MenuItem editMenuItem(MenuItem menuItem){
        return menuItemMapper.editMenuItem(menuItem);
    }
}
