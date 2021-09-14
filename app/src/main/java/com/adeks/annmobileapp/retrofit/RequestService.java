package com.adeks.annmobileapp.retrofit;

import com.adeks.annmobileapp.model.LogInRequest;

import com.adeks.annmobileapp.model.SecondRequest;
import com.adeks.annmobileapp.model.SecondResponseBody;

import okhttp3.RequestBody;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RequestService {

    @Headers({
            "Accept: application/json"
    })
    @POST("web/session/authenticate")
    Call<ResponseBody> authenticateUser(@Body LogInRequest loginDetails);

    @Headers({
            "Accept: application/json"
    })
    @POST("get_farmer_user")
    Call<SecondResponseBody> getUserDetails(@Header ("Cookie") String cookie, @Body SecondRequest params);
}
