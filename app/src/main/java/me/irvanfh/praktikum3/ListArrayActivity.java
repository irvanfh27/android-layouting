package me.irvanfh.praktikum3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvanfh on 10/6/17.
 */

public class ListArrayActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listarray_layout);
        ListView lv = (ListView) findViewById(R.id.listview2);
        List<String> data = new ArrayList<>();
        data.add("satu");
        data.add("dua");
        data.add("tiga");
        data.add("empat");
        data.add("lima");
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);

    }
}
