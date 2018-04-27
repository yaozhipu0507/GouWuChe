package example.com.gouwuche;

import java.util.List;

import example.com.gouwuche.Bean.DatasBean;
import example.com.gouwuche.Bean.MessageBean;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2018/4/19.
 */

public interface ApiService {
    @GET("product/getCarts")
    Flowable<MessageBean<List<DatasBean>>> getDatas(@Query("uid") String uid);
    @GET("product/deleteCart")
    Flowable<MessageBean> deleteData(@Query("uid") String uid, @Query("pid") String pid);
}
