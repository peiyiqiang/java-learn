package utils;

import okhttp3.*;
import org.apache.commons.collections4.MapUtils;

import java.io.IOException;
import java.util.Map;

/**
 * Created by peiyiqiang on 2020/6/29.
 * Description: 基于okhttp3的网络请求工具
 */
public class OKHttpUtils {

    /**
     * 发送get请求
     */
    public static String doGet(String url, Map<String, String> headerMap) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request
                .Builder()
                .url(url);
        if (MapUtils.isNotEmpty(headerMap)) {
            headerMap.keySet().stream().forEach(header -> {
                builder.header(header, headerMap.get(header));
            });
        }
        Request request = builder.build();
        Call call = client.newCall(request);
        Response response = call.execute();
        if (response.isSuccessful()) {
            return response.body().string();
        }
        return "";
    }

    /**
     * 发送post请求
     */
    public static String doPost(String url, String params, Map<String, String> headerMap) throws IOException {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), params);

        Request.Builder builder = new Request
                .Builder()
                .url(url)
                .post(body);
        if (MapUtils.isNotEmpty(headerMap)) {
            headerMap.keySet().stream().forEach(header -> {
                builder.header(header, headerMap.get(header));
            });
        }
        Request request = builder.build();
        Call call = client.newCall(request);
        Response response = call.execute();
        if (response.isSuccessful()) {
            return response.body().string();
        }
        return "";
    }

}
