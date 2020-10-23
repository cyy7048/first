package com.cyy.pojo;

import java.io.Serializable;

/**
 * t_cities
 * @author 
 */
public class TCities implements Serializable {
    private String cityId;

    private String cityName;

    private String provinceId;

    private static final long serialVersionUID = 1L;

    @Override
	public String toString() {
		return "TCities [cityId=" + cityId + ", cityName=" + cityName + ", provinceId=" + provinceId + "]";
	}

	public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}