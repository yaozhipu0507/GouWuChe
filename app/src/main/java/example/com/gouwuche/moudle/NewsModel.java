package example.com.gouwuche.moudle;

import java.util.List;

import example.com.gouwuche.Bean.DatasBean;
import example.com.gouwuche.Bean.MessageBean;
import example.com.gouwuche.GouWuJieKou;
import example.com.gouwuche.RetrofitUtils;
import example.com.gouwuche.present.NewsPresenter;
import io.reactivex.Flowable;

/**
 * Created by lenovo on 2018/4/19.
 */

public class NewsModel implements GouWuJieKou.IModel{
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter) {
        this.presenter = (NewsPresenter) presenter;

    }

    @Override
    public void getData(String uid, String pid) {
        Flowable<MessageBean<List<DatasBean>>> flowable = RetrofitUtils.getInstance().getApiService().getDatas(uid);
        presenter.getNews(flowable);

    }
}
