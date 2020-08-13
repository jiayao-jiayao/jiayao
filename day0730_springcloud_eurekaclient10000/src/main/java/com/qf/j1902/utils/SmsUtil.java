package com.qf.j1902.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * Created by 18209 on 2019/7/22.
 */
public class SmsUtil {
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "";
    static final String accessKeySecret = "";
    // 方法名可以自行定义
    // 参数可以自己定义随意更改，更改为你自己需要的参数即可
    // 返回值类型可以自行定义
    public static SendSmsResponse sendSms(String phone, String code) throws ClientException{
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("家肴美食");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_171114723");

        request.setTemplateParam("{\"code\":\"" + code + "\"}");

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        //request.setOutId("yourOutId");
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        return sendSmsResponse;
    }

    //以下为测试代码，随机生成验证码
    private static int newcode;
    public static int getNewcode() {
        return newcode;
    }
    public static Integer setNewcode(){
        newcode = (int)(Math.random()*9999)+100;  //每次调用生成一位四位数的随机数
        return newcode;
    }

   /*public static void main(String[] args) throws Exception {
       //验证码可以用随机生成
        setNewcode();
       String code = Integer.toString(getNewcode());
       System.out.println("发送的验证码为："+code);
       SendSmsResponse sendSms = sendSms("18032046216",code);
       System.out.println("短信接口返回的数据----------------");
       System.out.println("Code=" + sendSms.getCode());
       System.out.println("RequestId=" + sendSms.getRequestId());
    System.out.println("BizId=" + sendSms.getBizId());

  }*/

}
