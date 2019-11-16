package com.example.jxxy.mobileshop_txf.activity;

import android.widget.TextView;

import com.example.jxxy.mobileshop_txf.R;
import com.example.jxxy.mobileshop_txf.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;
//我的订单活动操作页
public class MyOrderActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
@Override
public int getContentViewId(){
    return R.layout.activity_my_order;
}
    @Override
    protected void initView(){
    super.initView();
    tvTitle.setText("我的订单");
    }
    @OnClick(R.id.iv_back)
    void close(){
    finish();
    }
}
