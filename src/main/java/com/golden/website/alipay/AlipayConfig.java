package com.golden.website.alipay;

import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

@Configuration
public class AlipayConfig {

    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
//    public static String app_id = "2018032902468114";//生产
    public static String app_id = "2016091000480888";//测试
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCuLG3EWci6IuWmMM5IVBmkyL01TYydZuvskYWx1W/0GO4JyVAy+YvHUpFTQBLBu+I8/qqOvNxwntFTwG30c3eBjZIX6YxobcQAzZ08lF6xBw81tul64maU1cCT5RLYgpSy6xYub4scH/bvOwKk9LqHTr5lAIE28Z0EU1rnXbBxa4kKLqMcGbn+4Z29hYOdLYHS0sHmc/n0lQlPukyZgYiBo2kWl1ZQY0EO81IdWiQV5nrdRPq2ZglRBlU4Z00sE1g1sFmAXL0Y1w1FfvAttLXRAT/K4nmBRk57LM5Df7ReskFmYSnw+K6Ep0KdTticvZAafxihLvTX7glQMGbn07LvAgMBAAECggEAHTkvIaa+2xxH096UfeY+dzuHI45jbXV7WDICcJgTNK2KIvI4FpVwMn1UDNfPTdosV3eTPmfJxMug66B50m4dOwt527E/8bWZEVlubF+ok6NPlf+epROfipFiwm3I/7LJKEvxaNEmUg267ODFzM+TDGjV4TR4ebOIWNVzhyZdGGpfUQx0/J0LCR+lQwcBa5KY+4jMIBU02xiT3xsnPBuYyt4ZkhoTWHlmQC5pRvQ0IEUmAakrc5rnh1E4yFEZgql8oe4w9wIUoA1NNleuX2D7sudJShwgXCENStrqnJoPjEk4Sy/Jw4JWvFTuYZxuREpASEphR+YM+lw9v2UEbJ9FoQKBgQDqZODVjPBF9pZoG+8eSzgzlD7ZGQ5dvmt0Vl1rha9kJXvDBt26Kk2kZ6ek+1wc71an2X3uaZwLCzEWr0m6FNdWOvpXU0TBti/X6oW82eGqdUt/k4S1Qb1HOwu+7wK6erMbBGu7+VjZKrfbVLwzMcljISVMB3UE4PvZHV5Ugz9yBQKBgQC+On69PMrYvjJ51FWSDZqurA0SmEjn6jt8ZYDdLvKHS1M4isBH/2uYhOrK5qMo2cwduoHsbuk10Ql8Jfyos4VoDsKbJvg8Jor2UXQzoPJbE2AqKOYjCxK6DV8L/R8aViZXiwZbLCTzFszKfsySlv1ht3MXsvqLqOENAX5DhkwfYwKBgFzK7Pt93U1FTswOav6qNqiswqi9s6NHFFEtM7SyavoRoMpXuIXP44b3hjXZUOEfm0W9443z/1Ob7aYWZPCm+YzoslzJ2Ul677vh22olM6KA5w+tffcn/F/rrz26b3EVzDwg5um20AbBU6IgDJWT2y9EWvibZyc0Tl/osYRxpTdlAoGBAK5pg3qOGo3PFQiOnkZjIse0B+hcp7u7Dv9nMVeai9NwRMU6skFQ9p3IgF24STBTQMqhDi5xInGtTzz8t0MWFeLqZZNLj53W2OIunJQZpRvMEAeXqCnJJUpgqByd376N7mmllhZRyy72YJ3o1DgzJ+5H/MZl20HhfTYngFT49SJxAoGAXiC4Qq5kIlxoJlRmW7c5fo2rSYCHeBHiI+1lwEMHpq5XkCNtsG4RONyqzgMVVKsUzyR9de3MfDNmqecnbCfXr/WNlPjsjUoQS6lgwAPXeTSwSeD3PERv5o+RROitfKRcSAScr+BrydRayk3MnkwKbG2kakF8ie32RpRsleDAjVQ=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuqw30RjXNnkaP/vLLIS5AUncGMnOxAlTnBvrurFR/Xbtt/T/JzU6pWvicclvTSsWUl2zUmo1MamhfVwGch1Eu2ShtgqTtj+jFqabyQm0PyY6/U+UeqBu6gfbfz+jEMi/gSWPzYOsOLQtsawtCu366wSOT2ZYpbOjRpmrKkq2kUak7jhR3j94283Kl5H4dz+vZRj4bBhJ/Rw4Ty/NujHcEgtyuJBNIAhObwyaMpAikD5TAY5Vi/r1MDiEMoBBE8KjqR1ahUhx3nOP8JW9saRKlFoJRKIzujkZ+5T7Dw3G9H4J15K+c2t4YgZATudCeAPcVkpqI+bHQ2L6FO0PSBnFFwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.golden-data.com.cn:9123/alipay_notify";//生产
//    public static String notify_url = "http://127.0.0.1:9123/alipay_notify";//测试
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://www.golden-data.com.cn:9123/alipay_return";//生产
//    public static String return_url = "https://127.0.0.1:9123/alipay_return";//测试
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
//    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";//生产
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//测试

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
