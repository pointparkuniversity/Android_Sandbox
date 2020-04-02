package com.familyhouse.faq_api;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;

        import okhttp3.ResponseBody;
        import retrofit2.Retrofit;
        import retrofit2.http.GET;
        import retrofit2.Call;
        import retrofit2.Callback;
        import retrofit2.Response;
        import android.util.Log;
        import android.app.ActionBar;

        import java.io.IOException;

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
        faq.getFaq().enqueue(new Callback<ResponseBody>() {

//        Api api = retrofit.create(Api.class);
//        api.getIp().enqueue(new Callback<ResponseBody>() {

            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("RetroStart", response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }


//    interface Api {
//        @GET("/")
//        Call<ResponseBody> getIp();
//    }

    interface Faq {
        @GET("/")
        Call<Readable> getFaq();
    }
}