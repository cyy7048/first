package com.cyy.pojo;

import java.io.Serializable;

/**
 * t_areas
 * @author 
 */
public class TAreas implements Serializable {
    /**
     * 区/县id
     */
    private String areaId;

    /**
     * 区/县名称
     */
    private String areaName;

    /**
     * 市id
     */
    private String cityId;

    private static final long serialVersionUID = 1L;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}