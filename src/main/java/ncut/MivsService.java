package ncut;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface MivsService {
    @GET("users/{username}")
    Observable<User> getUser(@Path("username") String username);

    @GET("cameras")
    Observable<List<Camera>> getCameras();
}