package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.second_layout);
        Button button1 = (Button) findViewById(R.id.Baidu);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "You clicked Button 1",
//                        Toast.LENGTH_SHORT).show();
//                Toast.makeText(SecondActivity.this, "孟福福牛福"
//                , Toast.LENGTH_SHORT).show();
//                String data = "Hello Second";
                Intent intent = getIntent();

                String data = intent.getStringExtra("data");
                Log.d("datad", data);
//                Intent intent  = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.doubao.com"));
//                startActivity(intent);
//                  Intent intent = new Intent(Intent.ACTION_DIAL);
//                  intent.setData(Uri.parse("tel:10086"));
//                  startActivity(intent);
            }

        });
    }
}