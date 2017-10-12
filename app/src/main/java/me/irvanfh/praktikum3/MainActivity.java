package me.irvanfh.praktikum3;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnLyt(View view) {
        Intent i = new Intent(MainActivity.this, BuatdiCode.class);
        startActivity(i);
    }
    public void btnRlyt(View view) {
        Intent i = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(i);
    }
    public void btnfrmlt(View view) {
        Intent i = new Intent(MainActivity.this, FrmActivity.class);
        startActivity(i);
    }
    public void btnVlyt(View view) {
        Intent i = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(i);
    }
    public void btnLalyt(View view){
      Intent i = new Intent(MainActivity.this, ListArrayActivity.class);
        startActivity(i);
    }
    public void btnGrdv(View view){
        Intent i = new Intent(MainActivity.this, GridViewActivity.class);
        startActivity(i);
    }

    public void btnLnHr(View view){
        Intent i = new Intent(MainActivity.this, LinearHorizontalActivity.class);
        startActivity(i);
    }
    public void btnLnVt(View view){
        Intent i = new Intent(MainActivity.this, LinearVerticalActivity.class);
        startActivity(i);
    }

}
