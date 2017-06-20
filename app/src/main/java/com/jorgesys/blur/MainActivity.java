package com.jorgesys.blur;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.androide);
        Bitmap blurredBitmap = BlurBuilder.blur(this, bitmap);
        ((ImageView)findViewById(R.id.imageViewBlur)).setImageDrawable(new BitmapDrawable(getResources(), blurredBitmap));

    }
}
