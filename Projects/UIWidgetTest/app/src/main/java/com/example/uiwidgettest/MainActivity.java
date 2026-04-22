//package com.example.uiwidgettest;
//
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.preference.DialogPreference;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.button);
//        EditText editText = (EditText) findViewById(R.id.edit_text);
//        ImageView imageView = (ImageView) findViewById(R.id.image_view);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String input = editText.getText().toString();
//                String ans = input.substring(0, 2);
//                if(ans.equals("孟浩")){
//                    Toast.makeText(MainActivity.this, "回答正确！", Toast.LENGTH_SHORT).show();
//                    imageView.setImageResource(R.drawable.img_1);
//                }
//                else{
//                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                    dialog.setTitle("警告！");
//                    dialog.setMessage("这么帅你认不出来吗？？？");
//                    dialog.setCancelable(false);
//                    dialog.setPositiveButton("我错了", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which){
//                        }
//                    });
//                    dialog.show();
//                    //Toast.makeText(MainActivity.this, "回答错误！", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}


package com.example.uiwidgettest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

    }
}