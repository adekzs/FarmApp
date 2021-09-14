package com.adeks.annmobileapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.adeks.annmobileapp.model.LogInParam;
import com.adeks.annmobileapp.model.LogInRequest;

import com.adeks.annmobileapp.model.SecondRequest;
import com.adeks.annmobileapp.model.SecondResponseBody;
import com.adeks.annmobileapp.retrofit.RequestService;
import com.adeks.annmobileapp.retrofit.RetrofitClientClass;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String sessionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.requestButton);
        performSendRequest();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performWorkerRequest();
            }
        });
    }


    private void performSendRequest() {
        Retrofit retrofit = RetrofitClientClass.getRetrofitInstance();
        RequestService requestService = retrofit.create(RequestService.class);

        LogInParam param = new LogInParam("demo", "admin", "admin");
        LogInRequest logInRequest = new LogInRequest("2", param);
        Call<ResponseBody> responseBodyCall = requestService.authenticateUser(logInRequest);

        responseBodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    if (response.code() == 200){
                        try {
                            String responseBody = response.body().string();
                            JSONObject object = new JSONObject(responseBody);
                            JSONObject result = object.getJSONObject("result");
                            sessionId = "session_id=" + result.get("session_id").toString();
                            Log.d(TAG, "onResponse: The sessionId is "+ sessionId);
                        } catch (JSONException | IOException e) {
                            e.printStackTrace();
                        }
                        Log.i(TAG, "onResponse: The response is ========="+response.body());
                    }
                } else {
                    Log.i(TAG, "onResponse: The response is ========"+response.body());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure: FAILED" + t.toString());
            }
        });
    }

    private void performWorkerRequest() {
        Retrofit retrofit = RetrofitClientClass.getRetrofitInstance();
        RequestService requestService = retrofit.create(RequestService.class);
        SecondRequest request = new SecondRequest("2.0", new SecondRequest.Param("6"));
        Call<SecondResponseBody> responseBodyCall = requestService.getUserDetails(sessionId, request);
        responseBodyCall.enqueue(new Callback<SecondResponseBody>() {
            @Override
            public void onResponse(Call<SecondResponseBody> call, Response<SecondResponseBody> response) {
                if (response.isSuccessful()){
                    if(response.code() == 200){
                        SecondResponseBody resp = response.body();
                        Integer id = resp.getResult().getResponse().get(0).getId();
                        String name = resp.getResult().getResponse().get(0).getName();
                        String email = resp.getResult().getResponse().get(0).getEmail();

                        Log.i(TAG, "onResponse: The response is ========="+response.body());
                    }
                }
            }

            @Override
            public void onFailure(Call<SecondResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure: FAILED" + t.toString());
            }
        });
    }
}