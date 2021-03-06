package com.tarunsoft.offerdunia;

/**
 * Created by tsharma3 on 8/26/2015.
 */
import com.loopj.android.http.*;

public class HttpClient {
    private static final String BASE_URL = "http://10.0.2.2/Android";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
