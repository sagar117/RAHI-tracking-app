package com.rahi.mhc.inotrans.fragment.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 7/7/2016.
 */

public class directory1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.directory);
        super.onCreate(savedInstanceState);


        Button newPage = (Button) findViewById(R.id.button);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0542-2307222"));
                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
                    return;
                }
                startActivity(callIntent);

            }
        });
//
        Button newPage2 = (Button) findViewById(R.id.button1);
        newPage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2307255"));
                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
                    return;
                }
                startActivity(callIntent);

            }
        });
        //
        Button newPage3 = (Button) findViewById(R.id.sec2);
        newPage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0542-2307231"));
                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
                    return;
                }
                startActivity(callIntent);

            }
        });
        //
        Button newPage4 = (Button) findViewById(R.id.button30);
        newPage4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0542-2369242"));
                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
                    return;
                }
                startActivity(callIntent);

            }
        });
        //
        Button newPage5 = (Button) findViewById(R.id.button40);
        newPage5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0542-2307280"));
                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
                    return;
                }
                startActivity(callIntent);

            }
        });
//
//        Button newPage6 = (Button) findViewById(R.id.button50);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage7 = (Button) findViewById(R.id.button60);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage8 = (Button) findViewById(R.id.button70);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage9 = (Button) findViewById(R.id.button8);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
////
//        Button newPage10 = (Button) findViewById(R.id.button9);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage11 = (Button) findViewById(R.id.button10);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage12 = (Button) findViewById(R.id.button11);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage13 = (Button) findViewById(R.id.button12);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
////
//        Button newPage14 = (Button) findViewById(R.id.button13);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage15 = (Button) findViewById(R.id.button14);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
//        //
//        Button newPage16 = (Button) findViewById(R.id.button15);
//        newPage.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:100"));
//                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 0);
//                    return;
//                }
//                startActivity(callIntent);
//
//            }
//        });
        //
    }
}
