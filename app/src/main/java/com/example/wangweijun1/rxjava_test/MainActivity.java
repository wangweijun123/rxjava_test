package com.example.wangweijun1.rxjava_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flowable.just("Hello world").subscribe(new Consumer<String>(){
            @Override
            public void accept(@NonNull String s) throws Exception {

            }
        });
    }
}
