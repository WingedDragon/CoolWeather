package com.dong.coolweather.util;

import android.text.TextUtils;

import com.dong.coolweather.db.CoolWeatherDB;
import com.dong.coolweather.model.City;
import com.dong.coolweather.model.Country;
import com.dong.coolweather.model.Province;

/**
 * Created by 振兴 on 2017.9.18.
 */

public class Utility {
	public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolWeatherDB,String response){
		if(!TextUtils.isEmpty(response)){
			String[] allProvinces = response.split(",");
			if(allProvinces != null && allProvinces.length > 0){
				for(String p : allProvinces){
					String[] array = p.split("\\|");
					Province province = new Province();
					province.setProvinceCode(array[0]);
					province.setProvinceName(array[1]);
					coolWeatherDB.saveProvince(province);
				}
				return true;
			}
		}
		return false;
	}

	public static boolean handleCitiesResponse(CoolWeatherDB coolWeatherDB,String response,int proviceId){
		if(!TextUtils.isEmpty(response)){
			String[] allCities = response.split(",");
			if(allCities != null && allCities.length > 0){
				for (String c : allCities){
					String[] array = c.split("\\|");
					City city = new City();
					city.setCityCode(array[0]);
					city.setCityName(array[1]);
					city.setProvinceId(proviceId);
					coolWeatherDB.saveCity(city);
				}
				return true;
			}
		}
		return false;
	}

	public static boolean handleCountriesResponse(CoolWeatherDB coolWeatherDB, String response, int cityId) {
		if (!TextUtils.isEmpty(response)) {
			String[] allCountries = response.split(",");
			if (allCountries != null && allCountries.length > 0) {
				for (String c : allCountries) {
					String[] array = c.split("\\|");
					Country country = new Country();
					country.setCountryCode(array[0]);
					country.setCountryName(array[1]);
					country.setCityId(cityId);
					coolWeatherDB.saveCountry(country);
				}
				return true;
			}
		}
		return false;
	}


}
