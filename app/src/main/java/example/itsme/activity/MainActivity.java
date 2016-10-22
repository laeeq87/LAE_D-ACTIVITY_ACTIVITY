package example.itsme.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String DIGITAL_NAME = "Digital_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickEventHandler(View view) {
        Intent IntentDetail = new Intent(this,DetailActivity.class);

        digital name =new digital();

        IntentDetail.putExtra(DIGITAL_NAME, name.getDigital_name());
        startActivity(IntentDetail);
    }
}
