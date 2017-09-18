package com.dong.coolweather.model;

/**
 * Created by 振兴 on 2017.9.18.
 */

public class Province {

	private int id;
	private String provinceName;
	private String provinceCode;

	public int getId(){
		return id;
	}

	public String getProvinceName(){
		return provinceName;
	}

	public String getProvinceCode(){
		return provinceCode;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}

	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}

}
