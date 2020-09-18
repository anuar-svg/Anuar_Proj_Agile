package com.example.iasback.controllers;


import com.example.iasback.models.MenuItem;
import com.example.iasback.services.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menu_item")
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @GetMapping("/menu_items")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<MenuItem> menuItems() {
        return menuItemService.getMenuItems() ;
    }

    @PostMapping("/add_menu_item")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public MenuItem createMenuItem( @RequestBody MenuItem menuItem) {
        return menuItemService.addMenuItem(menuItem);
    }

    @PostMapping("/edit_menu_item")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public MenuItem editMenuItem( @RequestBody MenuItem menuItem) {
        return menuItemService.editMenuItem(menuItem);
    }



}
