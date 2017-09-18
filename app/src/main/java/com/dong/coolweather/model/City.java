package com.dong.coolweather.model;

/**
 * Created by 振兴 on 2017.9.18.
 */

public class City {

	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;

	public int getId(){
		return id;
	}

	public String getCityName(){
		return cityName;
	}

	public String getCityCode(){
		return cityCode;
	}

	public int getProvinceId(){
		return provinceId;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	public void setProvinceId(int provinceId){
		this.provinceId = provinceId;
	}

}
