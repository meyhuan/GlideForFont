package com.meyhuan.soloadertest.glide;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;

/**
 * Author: meyu
 * Date:   4/11/21
 * Email:  627655140@qq.com
 */
public class FontTarget extends CustomViewTarget<TextView, Font> {

    /**
     * Constructor that defaults {@code waitForLayout} to {@code false}.
     *
     * @param view
     */
    public FontTarget(@NonNull TextView view) {
        super(view);
    }

    @Override
    protected void onResourceCleared(@Nullable Drawable placeholder) {

    }

    @Override
    public void onLoadFailed(@Nullable Drawable errorDrawable) {

    }

    @Override
    public void onResourceReady(@NonNull Font resource, @Nullable Transition<? super Font> transition) {
        Logger.log("FontTarget#onResourceReady, font: " + resource);
        Typeface typeface = Typeface.createFromFile(resource.getFontFile());
        view.setTypeface(typeface);
    }
}
