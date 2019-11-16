# MobileShop_txf
Git仓库中MobileShop文件为商场APP实验源文件
内容解析：

1.依赖包：
    
    implementation 'com.nostra13.universalimageloader:universal-image-loader:1.9.5'
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:27.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    //数据解析
    implementation 'com.google.code.gson:gson:2.7'
    //Re+Rx网络框架，OKhttp框架
    implementation 'com.squareup.retrofit2:retrofit:2.0.2'
    implementation 'com.squareup.retrofit2:converter-gson:2.0.2'
    implementation 'com.squareup.retrofit2:adapter-rxjava:2.0.2'
    implementation 'com.squareup.okhttp3:logging-interceptor:3.2.0'
    implementation 'io.reactivex:rxandroid:1.2.1'
    implementation 'io.reactivex:rxjava:1.1.6'
    //黄油刀注释框架
    implementation 'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
    //recyclerview列表
    implementation 'com.android.support:recyclerview-v7:27.1.1'
    
2.语言使用注意：

（1）ButterKnife使用方法：
          
            1.绑定ButterKnife，因为实验基本上是在基类中做的初始化，所以在基类中绑定即可，后面继承基类的就不用绑定了。
            ![Image text](https://raw.githubusercontent.com/hongmaju/light7Local/master/img/productShow/20170518152848.png)
