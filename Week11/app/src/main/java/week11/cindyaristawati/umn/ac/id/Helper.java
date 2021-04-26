package week11.cindyaristawati.umn.ac.id;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Helper {

    @GET("posts")
    Call<ArrayList<week11.cindyaristawati.umn.ac.id.PostModel>> getPost();
}