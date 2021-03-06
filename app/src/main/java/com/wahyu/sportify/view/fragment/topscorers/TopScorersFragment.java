package com.wahyu.sportify.view.fragment.topscorers;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseFragment;
import com.wahyu.sportify.databinding.FragmentTopscorersBinding;
import com.wahyu.sportify.viewmodel.topscorers.TopScorersView;
import com.wahyu.sportify.viewmodel.topscorers.TopScorersViewModel;

/**
 * Created with love by Ujang Wahyu on 2020-01-27.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class TopScorersFragment extends BaseFragment<FragmentTopscorersBinding, TopScorersViewModel> implements TopScorersView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm.setNavigator(this);
        vm.loadData();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_topscorers;
    }

    @Override
    public int getBindingVariable() {
        initView();
        return com.wahyu.sportify.BR.vmTopScorer;
    }

    private void initView(){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle("Top Scorers");
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void showMessage(String msg) {

    }
}
