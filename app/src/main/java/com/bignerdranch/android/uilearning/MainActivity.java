package com.bignerdranch.android.uilearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageFolk;
    private ImageButton mImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageFolk = (ImageView)findViewById(R.id.imageView1);
        mImageButton = (ImageButton) findViewById(R.id.imageButton1);

        mImageFolk.setImageResource(R.drawable.image1);
        mImageFolk.setScaleType(ImageView.ScaleType.CENTER_CROP);

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Imagebutton clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
