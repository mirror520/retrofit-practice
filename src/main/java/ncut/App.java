package ncut;

import java.io.IOException;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class App {
    private static final String MIVS_BASE_URL = "https://api.linyc.idv.tw/v1/mivs/";

    private static List<Camera> cameras;

    public static void main(String[] args) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                                        .baseUrl(MIVS_BASE_URL)
                                        .addConverterFactory(JacksonConverterFactory.create())
                                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                                        .build();
        
        MivsService mivsService = retrofit.create(MivsService.class);

        mivsService.getCameras()
                   .subscribe(
                       (value) -> App.cameras = value,
                       (error) -> System.err.println(error),
                       () -> System.out.println("complete")
                   );
        
        System.out.println(App.cameras);
    }
}
