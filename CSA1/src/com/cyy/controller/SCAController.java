package com.cyy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyy.pojo.TAreas;
import com.cyy.pojo.TCities;
import com.cyy.pojo.TProvinces;
import com.cyy.service.CSAService;

@Controller
@RequestMapping("")
public class SCAController {

	@Autowired
	CSAService csaService;
	 
	
	@RequestMapping("/")
	public String getProvinces(Model model) {//String代表返回的是视图 
		List<TProvinces> provinces = csaService.getProvinces(); 
		model.addAttribute("provinces",provinces);
		return "index";
	}
	
	@RequestMapping("/city")
	@ResponseBody	 
	public Map<String, Object> getCities(String pid) {
		List<TCities> cityies = csaService.geTCitiesByPid(pid);
		System.out.println(cityies);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cities", cityies);
		return map;
	}

	@RequestMapping("/area")
	@ResponseBody
	public List<TAreas> getAreas(String cId) {
		List<TAreas> areas = csaService.geTAreasByCid(cId); 
		return areas;
	}
}
