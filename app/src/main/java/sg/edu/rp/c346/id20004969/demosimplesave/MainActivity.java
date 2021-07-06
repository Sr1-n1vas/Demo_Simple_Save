package sg.edu.rp.c346.id20004969.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String msg1 = "Activity is closed";
        Toast toast = Toast.makeText(MainActivity.this,msg1,Toast.LENGTH_LONG);

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefEdit = prefs.edit();
        prefEdit.putString("greetings", "Hello");
        prefEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();


        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        String msg = prefs.getString("greeting", "no greetings name");
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
    }
}