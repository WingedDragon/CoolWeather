package com.dong.coolweather.util;

/**
 * Created by 振兴 on 2017.9.18.
 */

public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
