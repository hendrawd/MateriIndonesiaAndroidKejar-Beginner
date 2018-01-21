package company.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import company.helloworld.oop.Animal;
import company.helloworld.oop.Cat;
import company.helloworld.oop.KucingAngora;
import company.helloworld.oop.Monkey;

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

    public void catSpeak(View view) {
        Cat kucing = new Cat();
        kucing.speak(this);
    }

    public void animalSpeak(View view) {
        Animal animal = new Animal();
        animal.speak(this);
    }

    public void kucingAnggoraSpeak(View view) {
        KucingAngora kucingAngora = new KucingAngora();
        kucingAngora.speak(this);
    }

    public void monkeySpeak(View view) {
        Monkey monyet = new Monkey();
        monyet.speak(this);
    }
}
