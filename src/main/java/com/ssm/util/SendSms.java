package com.ssm.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import java.util.Random;

public class SendSms {

    public String SJ(long phone){
        //随机数
        Random random = new Random();
        String yzm = "";//验证码
        for (int i = 0;i<=3;i++){
            int yz = random.nextInt(10);
            if(i==0 & yz ==0){
                yz++;
            }
            yzm += yz;
        }
        String phone2 = phone+"";

//        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FtQ7dstiiJ9BhCnUwDf", "FJC5bEXuc194qpcjrEoM9hncslz1vq");
//        IAcsClient client = new DefaultAcsClient(profile);
//        CommonRequest request = new CommonRequest();
//        request.setMethod(MethodType.POST);
//        request.setDomain("dysmsapi.aliyuncs.com");
//        request.setVersion("2017-05-25");
//        request.setAction("SendSms");
//        request.putQueryParameter("RegionId", "cn-hangzhou");
//        request.putQueryParameter("PhoneNumbers", phone2);
//        request.putQueryParameter("SignName", "查理");
//        request.putQueryParameter("TemplateCode", "SMS_180045642");
//        request.putQueryParameter("TemplateParam", "{'code':"+yzm+"}");
//        try {
//            CommonResponse response = client.getCommonResponse(request);
//            System.out.println(response.getData());
//        } catch (ServerException e) {
//            e.printStackTrace();
//        } catch (ClientException e) {
//            e.printStackTrace();
//        }
        yzm = "1234";
        return yzm;
    }

//    public static void main(String[] args) {
//        SendSms s = new SendSms();
//        String ss = s.SJ(18692970612L);
//        System.out.println("验证码："+ss);
//    }

}
