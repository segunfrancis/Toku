package com.example.computer.toku.Fragments;

import com.example.computer.toku.Notifications.MyResponse;
import com.example.computer.toku.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAUzRXW_w:APA91bGEeV5pCQVsORsjfcP7U3XA2y5JPq3K5MniPDcZ20shp8yvnJX_4SbhSgsxJ_tEZf0C-a6gnAav6tGHtVmpAF5FQ3Rf9CHZprGHgMfGRpTkzlSUeeA_5NnNsVb2vWR4qfHa7cp8"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
