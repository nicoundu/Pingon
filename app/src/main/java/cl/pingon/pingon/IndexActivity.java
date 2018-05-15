package cl.pingon.pingon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        final TextView callus = findViewById(R.id.callusTv);
        final TextView facebook = findViewById(R.id.facebookTv);
        final TextView linkedin = findViewById(R.id.linkedinTv);
        final TextView webpage = findViewById(R.id.webpageTv);
        final TextView apply = findViewById(R.id.applyTv);
        final TextView machines = findViewById(R.id.machinesTv);

        callus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + "+56226222828"));
                startActivity(callIntent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/PingonChile"));
                startActivity(facebookIntent);

            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/company/servicios-pingon-chile/"));
                startActivity(linkedinIntent);

            }
        });

        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webpageIntent = new Intent(Intent.ACTION_VIEW);
                webpageIntent.setData(Uri.parse("http://www.pingon.cl"));
                startActivity(webpageIntent);

            }
        });

        machines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent machinesIntent = new Intent(IndexActivity.this, MachinesActivity.class);
                //startActivity(machinesIntent);

            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent applyIntent = new Intent(IndexActivity.this, ApplyActivity.class);
                //startActivity(applyIntent);

            }
        });





    }
}
