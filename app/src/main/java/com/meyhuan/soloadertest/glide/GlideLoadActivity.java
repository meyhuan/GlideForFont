package com.meyhuan.soloadertest.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Debug;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.meyhuan.soloadertest.R;

import static com.bumptech.glide.request.RequestOptions.fitCenterTransform;

public class GlideLoadActivity extends AppCompatActivity {
    private static final String fontUrl = "https://quickfile.cn/download/07ab116d-3d1e-4b47-84c8-ecbbb671d39b";
    private static final String imgUrl = "https://pics0.baidu.com/feed/d1a20cf431adcbefda7d3b34a58460d5a3cc9f6e.png?token=0e7279c712bf14ed7933337a4fc87946";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_load);

//        Debug.waitForDebugger();

        ImageView imageView = findViewById(R.id.image_view);
        TextView textView = findViewById(R.id.text_view);
        FontTarget fontTarget = new FontTarget(textView);
        Glide.with(this).as(Font.class).decode(Font.class).load(fontUrl).into(fontTarget);

    }
}