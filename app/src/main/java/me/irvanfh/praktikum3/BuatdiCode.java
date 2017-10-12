package me.irvanfh.praktikum3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by irvanfh on 10/6/17.
 */

public class BuatdiCode extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout rl = new RelativeLayout(this);
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams tvParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        tvParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setText("Assalamualaikum");
        rl.addView(tv, tvParams);
        setContentView(rl);

    }
}
