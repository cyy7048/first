package com.cyy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyy.mapper.TAreasMapper;
import com.cyy.mapper.TCitiesMapper;
import com.cyy.mapper.TProvincesMapper;
import com.cyy.pojo.TAreas;
import com.cyy.pojo.TAreasExample;
import com.cyy.pojo.TCities;
import com.cyy.pojo.TCitiesExample;
import com.cyy.pojo.TCitiesExample.Criteria;
import com.cyy.pojo.TProvinces;

@Service
public class CSAServiceImpl implements CSAService{

	@Autowired
	TProvincesMapper tPMapper;
	
	@Autowired
	TCitiesMapper tCMapper;
	
	@Autowired
	TAreasMapper tAMapper;
	
	@Override
	public List<TProvinces> getProvinces() { 
		return tPMapper.selectByExample(null);
	} 

	@Override
	public List<TCities> geTCitiesByPid(String provinceId) {
		TCitiesExample example = new TCitiesExample();
		Criteria criteria = example.createCriteria();
		criteria.andProvinceIdEqualTo(provinceId);
		
		return tCMapper.selectByExample(example);
	}

	@Override
	public List<TAreas> geTAreasByCid(String cityId) {
		TAreasExample example = new TAreasExample();
		com.cyy.pojo.TAreasExample.Criteria criteria = example.createCriteria();
		criteria.andCityIdEqualTo(cityId); 
		return tAMapper.selectByExample(example);
	}

}
