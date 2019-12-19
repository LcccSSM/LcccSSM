package com.ssm.util;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class SFZ {
    public static String postForm(Map<String, String> params) throws IOException {
        String url = "https://eid.shumaidata.com/eid/check";
        String appCode = "54c60f24d73c45dd8c7555635d507084 ";
        OkHttpClient client = new OkHttpClient.Builder().build();
        FormBody.Builder formbuilder = new FormBody.Builder();
        Iterator<String> it = params.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            formbuilder.add(key, params.get(key));
        }
        FormBody body = formbuilder.build();
        Request request = new Request.Builder().url(url).addHeader("Authorization", "APPCODE " + appCode).post(body).build();
        Response response = client.newCall(request).execute();
        System.out.println("返回状态码" + response.code() + ",message:" + response.message());
        String result = response.body().string();
        return result;
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("idcard", "430523200002184375");
        params.put("name", "李康");
        String result = postForm( params);
        System.out.println(result);
    }
}
