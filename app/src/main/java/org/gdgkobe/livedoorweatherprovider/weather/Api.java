package org.gdgkobe.livedoorweatherprovider.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by katsuki-nakatani on 2017/05/15.
 */

public interface Api {
    String ENDPOINT = "http://weather.livedoor.com/forecast/webservice/";

    @Headers("Content-Type: application/json")
    @GET("json/v1")
    Call<Result> getCoupon(@Query("city") String city);


}
