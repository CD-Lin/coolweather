package com.coolweather.app.util;

/**
 * Created by Administrator on 2016/2/15.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
