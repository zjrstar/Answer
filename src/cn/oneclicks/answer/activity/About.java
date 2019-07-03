package cn.oneclicks.answer.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import cn.oneclicks.answer.R;


public class About extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        init();


    }


    void init() {

    }


    public void officialSite(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/billzyx/Answer"));
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}
