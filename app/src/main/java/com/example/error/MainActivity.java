package com.example.error;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.bttn1);
        Button button2=findViewById(R.id.bttn2);
        Button button3=findViewById(R.id.bttn3);
        Button button4=findViewById(R.id.bttn4);
        Button button5=findViewById(R.id.bttn5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             goToFacebookPage("https://www.facebook.com/errorteam55/");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"email subject");
                intent.putExtra(Intent.EXTRA_TEXT,"body of email");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                website("https://ao41866.wixsite.com/errorteam?fbclid=IwAR2YhbFrpuJdncRcg9l6FZ5r9__Cy86Bb7qj1WXIrXheOWBBOt3jedWCbIQ");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01119816157"));
                startActivity(intent);

            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo: 30.470106,31.196216"));
                startActivity(intent);
            }
        });


    }private void goToFacebookPage(String id){
try {
    Intent intent=new Intent(Intent.ACTION_VIEW , Uri.parse("fb://page/"+id));
    startActivity(intent);

}catch (ActivityNotFoundException e){
    Intent intent=new Intent(Intent.ACTION_VIEW , Uri.parse("https://.WWW.facebook.com/"+id));
    startActivity(intent);

}



 }
   public void website(String url){
     Intent intent=new Intent(Intent.ACTION_VIEW);
      intent.setData(Uri.parse(url));
      startActivity(intent);
       }



}
