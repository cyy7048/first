package com.cyy.pojo;

import java.io.Serializable;

/**
 * t_provinces
 * @author 
 */
public class TProvinces implements Serializable {
    /**
     * 省编号
     */
    private String provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    private static final long serialVersionUID = 1L;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}