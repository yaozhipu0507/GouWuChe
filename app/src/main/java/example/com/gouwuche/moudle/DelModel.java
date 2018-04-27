package example.com.gouwuche.moudle;

import example.com.gouwuche.Bean.MessageBean;
import example.com.gouwuche.GouWuJieKou;
import example.com.gouwuche.RetrofitUtils;
import example.com.gouwuche.present.DelPresenter;
import io.reactivex.Flowable;

/**
 * Created by lenovo on 2018/4/19.
 */

public class DelModel implements GouWuJieKou.IModel{
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}
