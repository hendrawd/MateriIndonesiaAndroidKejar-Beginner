package company.helloworld;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//MainActivity = kelas
//AppCompatActivity = parent dari MainActivity
public class MainActivity extends AppCompatActivity {

    //Salah satu activity lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ini namanya method
    // View view merupakan parameter
    public void onButtonToastClick(View view) {
        // memanggil method lain
        showToast();
    }

    // method untuk menampilkan toast
    private void showToast() {
        Toast.makeText(this, "Halo", Toast.LENGTH_LONG).show();
    }

    // method untuk menampilkan Snackbar
    public void onButtonSnackbarClick(View view) {
        Snackbar.make(findViewById(R.id.ll_profile), "Halo", Snackbar.LENGTH_LONG).show();
    }

    // method untuk menampilkan AlertDialog
    public void onButtonDialogClick(View view) {
        // method chaining
        new AlertDialog.Builder(this)
                .setMessage("Halo")
                .show();
    }

    public void pindahActivity(View view) {
        Intent keDetailActivity = new Intent(this, DetailActivity.class);
        startActivity(keDetailActivity);
        // sama aja dengan yang atas
        // startActivity(new Intent(this, DetailActivity.class));
    }

    public void pindahActivityDenganData(View view) {
        EditText editTextAngka = findViewById(R.id.et_angka);
        String angka = editTextAngka.getText().toString();
        Intent keDetailActivity = new Intent(this, DetailActivity.class);
        //set data untuk activity lain
        keDetailActivity.putExtra("data", angka);
        startActivity(keDetailActivity);
    }

    public void openVerticalLinearLayoutExample(View view) {
        startActivity(new Intent(this, VerticalLinearLayoutExampleActivity.class));
    }

    public void openHorizontalLinearLayoutExample(View view) {
        startActivity(new Intent(this, HorizontalLinearLayoutExampleActivity.class));
    }

    public void openFrameLayoutExample(View view) {
        startActivity(new Intent(this, FrameLayoutExampleActivity.class));
    }

    public void openRelativeLayoutExample(View view) {
        startActivity(new Intent(this, RelativeLayoutExampleActivity.class));
    }
}
