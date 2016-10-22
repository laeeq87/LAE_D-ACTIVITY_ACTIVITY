package example.itsme.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String name=getIntent().getStringExtra(MainActivity.DIGITAL_NAME);
        TextView tv= (TextView) findViewById(R.id.textView);

        tv.setText(name);
    }
}
