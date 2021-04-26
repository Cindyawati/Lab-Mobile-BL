package week11.cindyaristawati.umn.ac.id;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        helper = week11.cindyaristawati.umn.ac.id.ApiClient.getClient().create(Helper.class);
        setup();
    }

    private void setup() {
        Call<ArrayList<PostModel>> callPost = helper.getPost();
        callPost.enqueue(new Callback<ArrayList<PostModel>>() {
            @Override
            public void onResponse(Call<ArrayList<PostModel>> call, Response<ArrayList<PostModel>> response) {
                ArrayList<PostModel> hasilPost = response.body();
                recyclerView.setAdapter(new week11.cindyaristawati.umn.ac.id.PostsAdapter(hasilPost));
            }

            @Override
            public void onFailure(Call<ArrayList<PostModel>> call, Throwable t) {
                Toast.makeText(week11.cindyaristawati.umn.ac.id.MainActivity.this, "Internet not Available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}