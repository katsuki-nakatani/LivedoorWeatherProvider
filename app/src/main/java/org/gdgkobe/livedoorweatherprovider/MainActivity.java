package org.gdgkobe.livedoorweatherprovider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent().hasExtra("text")) {
            ((TextView) findViewById(R.id.text1)).setText(getIntent().getStringExtra("text"));
        }
    }

    public static Intent createChooser(Context context, String text) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("text", text);
        return intent;
    }
}
