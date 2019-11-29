package com.example.jxxy.mobileshop_txf.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jxxy.mobileshop_txf.R;
import com.example.jxxy.mobileshop_txf.common.BaseActivity;
import com.example.jxxy.mobileshop_txf.common.MobileShopApp;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

//广告页
public class AdActivity extends BaseActivity {
    private TextView tv_skip;

    @Override
    public int getContentViewId(){
        return R.layout.activity_ad;
    }
    @Override
    protected void initView(){
        super.initView();
        tv_skip=(TextView)findViewById(R.id.tv_skip);
        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skip();
            }
        });
        ImageView imageView=(ImageView)findViewById(R.id.iv_image);
        String url="http://abc.2008php.com/09_Website_appreciate/10-08-09/12813557013.jpg";//图片链接，为Imageloader方式加载，其他还可通过HttpURLConnection、HttpClients、Volley、XUtils、OkHttp等方式进行加载网络图片。

        ImageLoader.getInstance().displayImage(url, imageView, new ImageLoadingListener() {     //将jumpThread传到handler中进行执行
            @Override
            public void onLoadingStarted(String imageUri, View view) {
            }

            @Override
            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {

                MobileShopApp.handler.post(jumpThread);
            }

            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {

                MobileShopApp.handler.post(jumpThread);
            }

            @Override
            public void onLoadingCancelled(String imageUri, View view) {

                MobileShopApp.handler.post(jumpThread);
            }
        });
    }

    //点击跳过操作
    private void skip(){
        Intent intent=new Intent(AdActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
        c_count=COUNT;
        MobileShopApp.handler.removeCallbacks(jumpThread); //removeCallbacks为自动移除jumpThread，以此实现跳过
    }

    private static final String SKIP_TEXT="点击跳过 %d";
    private final static int COUNT=5;
    private final static int DELAYED=1000;
    private int c_count=COUNT;

    private Runnable jumpThread=new Runnable() {
        @Override
        public void run() {
            if(c_count<=0){
                skip();
            }else {
                tv_skip.setText(String.format(SKIP_TEXT,c_count));
                c_count--;
                MobileShopApp.handler.postDelayed(jumpThread,DELAYED); //线程延迟一秒
            }
        }
    };
}
