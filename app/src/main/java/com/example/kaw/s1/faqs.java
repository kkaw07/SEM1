package com.example.kaw.s1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class faqs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
    }

    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();
    }
}
