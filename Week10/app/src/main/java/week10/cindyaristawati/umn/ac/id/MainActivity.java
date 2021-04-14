package week10.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import week10.cindyaristawati.umn.ac.id.AsyncTask.AsyncTaskActivity;
import week10.cindyaristawati.umn.ac.id.AsyncTaskLoader.AsyncTaskLoaderActivity;
import week10.cindyaristawati.umn.ac.id.Services.ServicesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToAsyncTask(View view) {
        Intent intent = new Intent(MainActivity.this, AsyncTaskActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToAsyncTaskLoader(View view) {
        Intent intent = new Intent(MainActivity.this, AsyncTaskLoaderActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToServices(View view) {
        Intent intent = new Intent(MainActivity.this, ServicesActivity.class);
        MainActivity.this.startActivity(intent);
    }
}