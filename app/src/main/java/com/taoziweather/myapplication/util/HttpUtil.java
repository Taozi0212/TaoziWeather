package com.taoziweather.myapplication.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    //和服务器进行交互，获取服务返回的数据
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        //创建一个OkHttpClient的实例
        OkHttpClient client = new OkHttpClient();
        //创建一个Request对象，发起一条Http请求，通过url（）方法来设置网络地址
        Request request = new Request.Builder().url(address).build();
        //调用OkHttpClient的newCall（）方法来创建call的对象
        //以及调用enqueue（）方法把call加入调度队列，然后等待任务执行完成
        client.newCall(request).enqueue(callback);
    }

}
