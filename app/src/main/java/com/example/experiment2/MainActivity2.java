package com.example.experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Intent intent = getIntent();
       String data = intent.getStringExtra("extra_data");
        Toast.makeText(MainActivity2.this, data, Toast.LENGTH_LONG).show();
        Log.d("MainActivity2",data);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.putExtra("data_return","你好，第一个活动");
                setResult(RESULT_CANCELED,intent1);
                finish();
            }
        });

    }
    @Override
    public  void onBackPressed(){
        Intent intent2 = new Intent();
        intent2.putExtra("data_return","你好，第一个活动");
        setResult(RESULT_CANCELED,intent2);
//RESULT_CANCELED==0  RESULT_FIRST_USER==1 RESULT_OK==-1
       finish();
    }
}
