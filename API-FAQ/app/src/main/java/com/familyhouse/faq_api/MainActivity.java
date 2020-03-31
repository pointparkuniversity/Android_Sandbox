package com.familyhouse.faq_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import okhttp3.ResponseBody;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://familyhouse.it.pointpark.edu:3000/api/v1/faq")
                .build();

        Faq faq = retrofit.create(Faq.class);


        String postmsg = "{\n" +
                "\t\t\"faqid\": 1,\n" +
                "\t\t\"Question\": \"What is Family House?\"\n" +
                "\t\t\"Category\": \"general\"n" +
                "\t\t\"Answer\": \"Family House is a 501(c)(3) non-profit charitable organization governed by a community Board of Directors. We rely on donations to support the homes and services provided to all guests. \\n\" +\n" +
                "                \"Family House’s charitable care—which is the difference between what a room costs the organization to operate vs. what Family House charges—amounts to more than $1.2 million annually. These funds are provided each year through generous contributions from individuals, companies, foundations, and other organizations.\"n" +
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














    }
}