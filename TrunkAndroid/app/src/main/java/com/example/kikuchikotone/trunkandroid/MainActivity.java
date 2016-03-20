package com.example.kikuchikotone.trunkandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Trunk", "onCreate");
        takePicture();
        sharePicture();
        showGallary();
        showInfo();

    }

    public void takePicture(){
        Button buttonCamera = (Button) findViewById(R.id.button_camera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "camera clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showGallary(){
        Button buttonGallary = (Button) findViewById(R.id.button_garally);
        buttonGallary.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "gallary clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showInfo(){
        Button buttonInfo = (Button) findViewById(R.id.button_info);
        buttonInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Info clicked", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void sharePicture(){
        Button buttonShare = (Button) findViewById(R.id.button_share);
        buttonShare.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "share clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
