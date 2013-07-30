package com.custom.web.controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.custom.util.PropertiesUtil;

/**
 * 
 * @author YQ
 *
 */

@Controller
public class TestController extends MultiActionController{
	
	@RequestMapping(value = "/test/gotoHtml", method = RequestMethod.GET)
	public Object gotoHtml(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		System.out.println("12123");
		mapDate.put("username", "yq");
		return mapDate;
	}
	
	@RequestMapping(value = "gotoAjax", method = RequestMethod.GET)
	@ResponseBody
	public Object accountList(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		System.out.println("12123");
		mapDate.put("username", "yq");
		return mapDate;
	}
	
	@RequestMapping(value = "ajaxFtl", method = RequestMethod.GET)
	public Object ajaxFtl(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		Map<String, Object> mapDate=new HashMap<String, Object>();
		System.out.println("12123");
		mapDate.put("username", "yq");
		return "ajax/dealerselect";
	}
	
	
	@RequestMapping(value = "findUserByName2")  
    public String findUserByName(ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response) {
		String userId = PropertiesUtil.getProperty("mall.site.userid");
		System.out.println(userId);
        return "ajax/showUser/asd";  
    }
	
	

}
