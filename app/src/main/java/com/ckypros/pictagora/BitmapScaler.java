package com.ckypros.pictagora;

import android.graphics.Bitmap;

public class BitmapScaler {
    // Scale and maintain aspect ratio given a desired width
    // BitmapScaler.scaleToFitWidth(bitmap, 100);
    public static Bitmap scaleToFitWidth(Bitmap b, int width)
    {
        float factor = width / (float) b.getWidth();
        int height = (int) (b.getHeight() * factor);
        return Bitmap.createScaledBitmap(b, width, height, true);
    }


    // Scale and maintain aspect ratio given a desired height
    // BitmapScaler.scaleToFitHeight(bitmap, 100);
    public static Bitmap scaleToFitHeight(Bitmap b, int height)
    {
        float factor = height / (float) b.getHeight();
        int width = (int) (b.getWidth() * factor);
        return Bitmap.createScaledBitmap(b, width, height, true);
    }
}
