package com.example.testprojectone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selector extends AppCompatActivity{

    protected void onClickDataEntry(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }
}
