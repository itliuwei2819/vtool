package cn.vtool.wxpay;

public class WxPayClient {

    /**
     * 服务号的应用号
     */
    private String appId;
    /**
     * 商户号
     */
    private String mchId;
    /**
     * API密钥
     */
    private String mchKey;

    /**
     * 服务网关
     */
    private final static String SERVER_URL = "https://api.mch.weixin.qq.com/pay";
    /**
     * 请求下单路径
     */
    private final static String UNIFIED_ORDER_URL = "/unifiedorder";
    /**
     * 主动查询支付路径
     */
    private final static String ORDER_QUERY_URL = "/orderquery";

    public WxPayClient(String appId, String mchId, String mchKey)
    {
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getMchId()
    {
        return mchId;
    }

    public void setMchId(String mchId)
    {
        this.mchId = mchId;
    }

    public String getMchKey()
    {
        return mchKey;
    }

    public void setMchKey(String mchKey)
    {
        this.mchKey = mchKey;
    }

    /**
     * 微信统一下单接口
     */
    public void unifiedOrder()
    {

    }

}
