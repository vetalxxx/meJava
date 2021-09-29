import okhttp3.*;

import java.io.IOException;

public class Weather {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("forecasts/v1/daily/5day/290396") // код Самары взял
                .addQueryParameter("apikey", "QHjCQA8jrt7PJW0i4rpRDl18VMw8EErm")
                .addQueryParameter("language", "ru")
                .addQueryParameter("details", "false")
                .addQueryParameter("metric", "false")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();


        String responseBody = response.body().string();
        System.out.println(responseBody);
    }
}
