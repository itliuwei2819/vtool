package cn.vtool.wxpay.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 微信支付-统一下单接口请求体
 */
public class UnifiedOrderRequest
{
    private String appId;
    private String mchId;
    private String nonceStr;
    private String attach;
    private String body;
    private String outTradeNo;
    private String feeType;
    private String totalFee;
    private String spbillCreateIp;
    private String notifyUrl;
    private String tradeType;
    private String sign;
}
