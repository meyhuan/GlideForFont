package com.meyhuan.soloadertest.glide;

import java.io.File;

/**
 * Author: meyu
 * Date:   4/11/21
 * Email:  627655140@qq.com
 */
public class Font {
    private String fontName;

    private String fontPath;
    private File fontFile;

    public Font(File source) {
        this.fontFile = source;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontPath() {
        return fontPath;
    }

    public void setFontPath(String fontPath) {
        this.fontPath = fontPath;
    }

    public File getFontFile() {
        return fontFile;
    }
}
