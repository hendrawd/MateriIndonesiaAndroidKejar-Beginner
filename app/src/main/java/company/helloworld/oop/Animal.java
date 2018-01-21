// ini deklarasi package
package company.helloworld.oop;

import android.content.Context;
import android.widget.Toast;

/**
 * ini comment, disebut javadoc comment, diawali dengan /**
 *
 * @author hendrawd on 11/26/17
 */

// ini kelas
public class Animal {

    // property dari kelas
    String speakSound = "Shhhhhh...";

    // speak adalah method. Nilai yang dikembalikan(return value) adalah void
    // void kalau dijadikan bahasa Indonesia berarti kosong, yang artinya,
    // tidak ada yang direturn dari method ini
    public void speak(Context context) {
        Toast.makeText(context, getSpeakSound(), Toast.LENGTH_LONG).show();
    }

    // getSpeakSound adalah method. Nilai yang dikembalikan(return value) adalah String
    public String getSpeakSound() {
        return speakSound;
    }
}
