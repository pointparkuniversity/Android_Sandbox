package com.familyhouse.faq_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
//import java.net.*;
//import java.io.*;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import okhttp3.ResponseBody;
import android.util.Log;
import android.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://familyhouse.it.pointpark.edu:3000/api/v1/faq/")
                .build();

        Faq faq = retrofit.create(Faq.class);


        String postmsg = "{\n" +
                "\t\t\"id\": 1,\n" +
                "\t\t\"section_Id\": 1,\n" +
                "\t\t\"Question\": \"What is Family House?\"n" +
                "\t\t\"answer\": \"Family House is a 501(c)(3) nonprofit charitable organization whose mission is to provide a convenient and affordable “home away from home” for patients and their caregivers who must travel to Pittsburgh for medical treatment. \n"  +
                "\t\t\"Order\": 1,\n" +
                "}";

        /*
        JSON Code that we want to use
          {
            "id": 900,
            "name": "Bob Phillips"
          }
          */
        //Request the body
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), postmsg);
        faq.postUser(requestBody).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("PostExample", response.body().string());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });

        faq.getPosts(requestBody).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("postGet", response.body().string());
                }   catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}