package com.meyhuan.soloadertest.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

import java.io.File;

/**
 * Author: meyu
 * Date:   4/11/21
 * Email:  627655140@qq.com
 */
public class FontTranscoder implements ResourceTranscoder<Font, Font> {
    @Nullable
    @Override
    public Resource<Font> transcode(@NonNull Resource<Font> toTranscode, @NonNull Options options) {
        return new FontResource(toTranscode.get());
    }
}
