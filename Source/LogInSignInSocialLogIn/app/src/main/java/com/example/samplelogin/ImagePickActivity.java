package com.example.samplelogin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.internal.e;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ImagePickActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private Bitmap bitmap;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick);
//        imageView = (ImageView) findViewById(R.id.result);
//    }
//
//    public void onClick(View View) {
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        intent.addCategory(Intent.CATEGORY_OPENABLE);
//        startActivityForResult(intent, REQUEST_CODE);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        InputStream stream = null;
//        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK)
//            try {
//                // recyle unused bitmaps
//                if (bitmap != null) {
//                    bitmap.recycle();
//                }
//                stream = getContentResolver().openInputStream(data.getData());
//                bitmap = BitmapFactory.decodeStream(stream);
//
//                imageView.setImageBitmap(bitmap);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } finally ch(IOException e){
//            e {
//                if (stream != null)
//                    try {
//                        stream.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//            }
//        }
//
//    }
    }
}