package Project;

import java.io.IOException;

import okhttp3.HttpUrl;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Weather {
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String PERIOD = "5day";
    private static final String ST_PETERSBURG_KEY = "295212";
    private static final String API_KEY = "h4QaYpQaV5DJKnkQKBGRDSK5AcIXcR2Q";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(PERIOD)
                .addPathSegment(ST_PETERSBURG_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();
        System.out.println(url.toString());
        Request request = new Request.Builder()
                .addHeader("accept", "application json")
                .url(url)
                .build();
        String json = client.newCall(request).execute().body().string();
        System.out.println(json);


    }
}
