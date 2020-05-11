package com.martiandeveloper.getresultfromactivitytofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.activity_second_mainBTN).setOnClickListener(v -> {
            closeActivity();
        });
    }

    private void closeActivity() {
        Intent intent = new Intent();
        intent.putExtra(MainFragment.EXTRA_KEY_TEST, "Testing passing data back to ActivityOne");
        setResult(MainFragment.RESULT_CODE, intent); // You can also send result without any data using setResult(int resultCode)
        finish();
    }
}
