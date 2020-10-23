package com.cyy.service;

import java.util.List;

import com.cyy.pojo.TAreas;
import com.cyy.pojo.TCities;
import com.cyy.pojo.TProvinces;

public interface CSAService {
	public List<TProvinces> getProvinces();
	public List<TCities> geTCitiesByPid(String provinceId);
	public List<TAreas>	geTAreasByCid(String cityId);
}
