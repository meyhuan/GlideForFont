package com.meyhuan.soloadertest.glide;


import android.os.Environment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.file.FileDecoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: meyu
 * Date:   4/11/21
 * Email:  627655140@qq.com
 */
public class FontDecode implements ResourceDecoder<InputStream, Font> {

    @Override
    public boolean handles(@NonNull InputStream source, @NonNull Options options) throws IOException {
        Logger.log("FontDecode#handlers: file source = " + source + ", options: " + options.toString());
        return true;
    }

    @Nullable
    @Override
    public Resource<Font> decode(@NonNull InputStream source, int width, int height, @NonNull Options options) throws IOException {
        Logger.log("FontDecode#decode: file source = " + source + ", options: " + options.toString());
        File file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "test.ttf");
        copyInputStreamToFile(source, file);
        return new FontResource(new Font(file));
    }

    private static void copyInputStreamToFile(InputStream inputStream, File file)
            throws IOException {

        try (FileOutputStream outputStream = new FileOutputStream(file)) {

            int read;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }

            // commons-io
            //IOUtils.copy(inputStream, outputStream);

        }

    }

}
