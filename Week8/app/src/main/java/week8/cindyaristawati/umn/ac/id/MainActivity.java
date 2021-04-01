package week8.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import week8.cindyaristawati.umn.ac.id.SavedInstance.SavedInstanceActivity;
import week8.cindyaristawati.umn.ac.id.TextEditor.TextEditorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToTextEditor(View view) {
        Intent intent = new Intent(MainActivity.this, TextEditorActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToSavedInstance(View view) {
        Intent intent = new Intent(MainActivity.this, SavedInstanceActivity.class);
        MainActivity.this.startActivity(intent);
    }
}