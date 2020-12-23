package com.example.videoapiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;


import com.example.videoapiproject.Service.Instance;
import com.example.videoapiproject.Service.Pixelbaby;
import com.example.videoapiproject.Service.VideoApi;
import com.example.videoapiproject.VideoModel.Hits;
import com.example.videoapiproject.VideoModel.Root;
import com.example.videoapiproject.VideoModel.Videos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button button;
    WebView wb;
    List<Hits> hitsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.hitme);
        wb=findViewById(R.id.wb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final VideoApi videoApi= Instance.getVideoApi();

                final Call<Root> hitsCall=videoApi.getSearchResult("food");

                hitsCall.enqueue(new Callback<Root>() {
                    @Override
                    public void onResponse(Call<Root> call, Response<Root> response) {
                        if(response.isSuccessful())
                        {
                                Root root=response.body();
                                hitsList=root.getHits();
                                for(int i=0;i<1;i++)
                                {
                                    Videos videos=root.getHits().get(i).getVideos();

                                    String uri=videos.getLarge().getUrl();
                                    wb.loadUrl(uri);
                                }
                        }
                    }

                    @Override
                    public void onFailure(Call<Root> call, Throwable t) {

                    }
                });

            }
        });

           }
}