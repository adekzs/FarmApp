package com.adeks.annmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.adeks.annmobileapp.model.LogInParam;
import com.adeks.annmobileapp.model.LogInRequest;
import com.adeks.annmobileapp.model.ResponseBody;
import com.adeks.annmobileapp.retrofit.RequestService;
import com.adeks.annmobileapp.retrofit.RetrofitClientClass;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RatingActivity extends AppCompatActivity {

    private static final String TAG = "RatingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }


}