package week12.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import week12.cindyaristawati.umn.ac.id.DeteksiSensor.DeteksiSensorActivity;
import week12.cindyaristawati.umn.ac.id.PembacaanDataSensor.PembacaanDataSensorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToDeteksiSensor(View view) {
        Intent intent = new Intent(MainActivity.this, DeteksiSensorActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToPembacaanDataSensor(View view) {
        Intent intent = new Intent(MainActivity.this, PembacaanDataSensorActivity.class);
        MainActivity.this.startActivity(intent);
    }
}