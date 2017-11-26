package company.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // dapetin data dari activity pemanggil
        String data = getIntent().getStringExtra("data");
        TextView textView = findViewById(R.id.textView);
        textView.setText(data);
    }
}
