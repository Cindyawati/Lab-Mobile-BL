package week6.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import week6.cindyaristawati.umn.ac.id.tutorialDrawable.DrawableActivity;
import week6.cindyaristawati.umn.ac.id.tutorialFisika.FisikaActivity;
import week6.cindyaristawati.umn.ac.id.tutorialProperti.PropertyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToAnimasiProperti(View view) {
        Intent intent = new Intent(MainActivity.this, PropertyActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToAnimasiDrawable(View view) {
        Intent intent = new Intent(MainActivity.this, DrawableActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToAnimasiFisika(View view) {
        Intent intent = new Intent(MainActivity.this, FisikaActivity.class);
        MainActivity.this.startActivity(intent);
    }
}