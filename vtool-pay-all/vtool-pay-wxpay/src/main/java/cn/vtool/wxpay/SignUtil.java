package cn.vtool.wxpay;

import java.util.TreeMap;

import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

/**
 * 负责微信支付的签名与验证工作
 */
public class SignUtil
{
    private SignUtil()
    {
    }

    public static String sign(String mchKey, TreeMap<String, Object> parameters)
    {
        HttpResponse execute = HttpRequest.get("").execute();
        StringBuffer sb = new StringBuffer();
        parameters.forEach((k, v) ->
        {
            sb.append(k).append("=").append(v).append("&");
        });
        sb.append("key=").append(mchKey);
        return DigestUtil.md5Hex(sb.toString());
    }
}
