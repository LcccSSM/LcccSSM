package com.ssm.util;


import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class Email {
    public String sendMail(String QQ) {
        int verificationCode = (int) ((Math.random() * 9 + 1) * 100000);

        String auth = verificationCode+"";

        //用户QQ
        String receivers = QQ;

        String firm = "2454171623@qq.com";
//            String receivers = "3123927298@qq.com";
        List<File> fileList = new ArrayList<>();
        if (receivers != null && receivers.length() > 0) {
            try {
                Properties properties = new Properties();
//                //企业邮箱使用：smtp.exmail.qq.com
                properties.put("mail.smtp.host", "smtp.qq.com");
                properties.put("mail.smtp.port", "25");
                properties.put("mail.smtp.auth", "true");
                Session session = Session.getInstance(properties);
                MimeMessage message = new MimeMessage(session);

                // 发件人
                message.setFrom(new InternetAddress(firm));
                // 收件人(多个)
//                InternetAddress[] sendTo = new InternetAddress[receivers.length()];
//                for (int i = 0; i < receivers.length(); i++) {
//                    sendTo[i] = new InternetAddress(receivers);
//                }
                //收件人（一个）
                message.setRecipients(MimeMessage.RecipientType.TO, receivers);

                // 邮件主题
                // message.setSubject("邮件主题")
                message.setSubject("绑定邮箱验证码！", "UTF-8");
                // 添加邮件的各个部分内容，包括文本内容和附件
                Multipart multipart = new MimeMultipart();

                // 添加邮件正文
                BodyPart contentPart = new MimeBodyPart();
                contentPart.setContent("验证码为：" + auth+"  请勿泄露！", "text/html;charset=UTF-8");
                multipart.addBodyPart(contentPart);

                //                // 遍历添加文件附件
                //                if (fileList != null && fileList.size() > 0) {
                //                    for (File file : fileList) {
                //                        BodyPart attachmentBodyPart = new MimeBodyPart();
                //                        DataSource source = new FileDataSource(file);
                //                        attachmentBodyPart.setDataHandler(new DataHandler(source));
                //                        attachmentBodyPart.setFileName(MimeUtility.encodeText(file.getName(), "UTF-8", "B"));
                //                        multipart.addBodyPart(attachmentBodyPart);
                //                    }
                //                }
                message.setContent(multipart);
                message.setSentDate(new Date());
                message.saveChanges();

                Transport transport = session.getTransport();
                //或者为企业邮箱和密码
                transport.connect(firm, "uravixaduepteajh");
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return auth;
    }

//    public static void main(String[] args) {
//        //qq邮箱验证码测试
//        Email verify = new Email();
//        String a = verify.sendMail("2417608303@qq.com");
//        System.out.println(a);
//
//    }
}
