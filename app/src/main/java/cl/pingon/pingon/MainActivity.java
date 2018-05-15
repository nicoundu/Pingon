package cl.pingon.pingon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView pingonicon = findViewById(R.id.pingonIc);

        pingonicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pingoniconIntent = new Intent(MainActivity.this, IndexActivity.class);
                startActivity(pingoniconIntent);
            }
        }, 1800);


    }


}
