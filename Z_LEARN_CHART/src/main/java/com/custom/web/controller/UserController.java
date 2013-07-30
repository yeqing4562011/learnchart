package com.custom.web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

	@RequestMapping(value = "findUserByName")  
    public String findUserByName(String name,ModelMap model) {  
        return "showUser";  
    }  
      
    @RequestMapping(value = "findAllUsers")  
    public String findAllUsers(ModelMap model) {  
        return "listUser";  
    }  
}
