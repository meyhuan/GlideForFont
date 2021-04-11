package com.meyhuan.soloadertest.glide;

import androidx.annotation.NonNull;

import com.bumptech.glide.load.engine.Resource;

/**
 * Author: meyu
 * Date:   4/11/21
 * Email:  627655140@qq.com
 */
public class FontResource implements Resource<Font> {

    private Font font;

    public FontResource(Font font) {
        this.font = font;
    }

    @NonNull
    @Override
    public Class<Font> getResourceClass() {
        return Font.class;
    }

    @NonNull
    @Override
    public Font get() {
        return this.font;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void recycle() {

    }
}
