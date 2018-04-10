package tk.koalazone.buzina;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton air, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        air = findViewById(R.id.imageButton);
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzina();
            }
        });


    }
    private void buzina(){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.buzina);
        mp.start();


    }
    }
