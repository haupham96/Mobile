package com.example.testactivity.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

import com.example.testactivity.R;

import java.util.Objects;

public class GridAdapter extends BaseAdapter {

    private Context mContext;

    public static final Integer[] IMAGES = new Integer[]{
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1,
            R.drawable.logo_1, R.drawable.logo_1, R.drawable.logo_1
    };

    public GridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return IMAGES.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (Objects.isNull(view)) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }
        // convert resource id to Bitmap.
        Drawable drawable = ContextCompat.getDrawable(mContext, R.drawable.logo_1);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

        // reduce the size of bitmap, because it cause crash app for canvas render too big bytes image
        Bitmap scaledBitmap =  Bitmap.createScaledBitmap(bitmap, 1024, 1024, true);
        imageView.setImageBitmap(scaledBitmap);
        return imageView;
    }
}
