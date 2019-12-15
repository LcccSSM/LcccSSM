package com.ssm.util;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.apache.commons.codec.binary.Base64.encodeBase64;

public class ImgFile {
    public static String getFile(String filePath){
        //API产品路径
        String host = "http://ai-market-ocr-person-id.icredit.link";
        String path = "/ai-market/ocr/personid";
        String method = "POST";
        //阿里云APPCODE
        String appcode = "dc478afb65494543818552bd2a55d2d5";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();

        //内容数据类型，如：0，则表示BASE64编码；1，则表示图像文件URL链接
        //启用BASE64编码方式进行识别
        //内容数据类型是BASE64编码
        String imgFile = filePath;
        String imgBase64 = "";
        try {
            File file = new File(imgFile);
            byte[] content = new byte[(int) file.length()];
            FileInputStream finputstream = new FileInputStream(file);
            finputstream.read(content);
            finputstream.close();
            imgBase64 = new String(encodeBase64(content));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bodys.put("AI_IDCARD_IMAGE", imgBase64);
        bodys.put("AI_IDCARD_IMAGE_TYPE", "0");

        //启用URL方式进行识别
//        //内容数据类型是图像文件URL链接
        bodys.put("AI_IDCARD_IMAGE", imgBase64);
        bodys.put("AI_IDCARD_IMAGE_TYPE", "0");

        //身份证正反面，如：FRONT，身份证含照片的一面；BACK，身份证带国徽的一面
        bodys.put("AI_IDCARD_SIDE", "FRONT");

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
//            System.out.println(response.toString());
            //获取response的body
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
//        System.out.println(getFile("D:\\repository\\git\\lcccSSM\\LcccSSM\\src\\main\\java\\com\\ssm\\image\\IMG_0570.JPG"));
    }
}
