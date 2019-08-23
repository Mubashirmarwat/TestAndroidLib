package com.example.alive5chatbot;
import android.content.Context;
import android.widget.Toast;


public class toasterMessage {

    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
