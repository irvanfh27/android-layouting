package me.irvanfh.praktikum3;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by irvanfh on 10/6/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[]  gambar = {
            R.drawable.a1,R.drawable.a2,R.drawable.a3,
            R.drawable.a4,R.drawable.a5,R.drawable.a6

    };

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return gambar.length;

    }

    @Override
    public Object getItem(int position) {
        return gambar[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(gambar[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(160, 160));
        return imageView;
    }
}
