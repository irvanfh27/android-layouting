package me.irvanfh.praktikum3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;

/**
 * Created by irvanfh on 10/6/17.
 */

public class GridViewActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_activity);
        GridView gv = (GridView) findViewById(R.id.gridview1);
        gv.setAdapter(new ImageAdapter(this));
    }
}
