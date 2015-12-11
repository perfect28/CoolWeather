package com.example.kkpanda.coolweather.util;

/**
 * Created by kkpanda on 2015/12/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
