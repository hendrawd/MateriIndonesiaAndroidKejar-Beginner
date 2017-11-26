package company.helloworld;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

//MainActivity = kelas
//AppCompatActivity = parent dari MainActivity
public class MainActivity extends AppCompatActivity {

    //Salah satu activity lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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


}
