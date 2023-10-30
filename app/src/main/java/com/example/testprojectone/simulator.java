package com.example.testprojectone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class simulator extends AppCompatActivity{
    protected void onClickDataShow(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }

    protected void onClickSelectorTwo(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }



    Integer documentValue;
    String documentDate;
    String documentExp;

   /* EditText editText = (EditText) findViewById(R.id.factValue);
    editText.setOnClickListener (new View.OnClickListener(){
        public void onClick(View v){
            openActivity2();
        }
    });

    public void openActivity(){
        Intent intent = new Intent(this, simresult.class);
        startActivity(intent);
    }*/

}
