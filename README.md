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
    
2.主要内容：

（1）ButterKnife使用方法：

    1.绑定ButterKnife，因为实验基本上是在基类中做的初始化，所以在基类中绑定即可，后面继承基类的就不用绑定了。
    2.进行类似@BindView(R.id.button)的注释操作，和@click等点击操作
    
 BaseActivity绑定源码如下：
![Image text](https://github.com/jiugeishere/66ds/blob/master/a/1.png)

（2）Recyclewer的适配器：

    创建Adapter继承自RecycleView的adapter，并且泛型为创建Adapter的ViewHolder；
    创建数据源，并且创建含参构造方方法用于向Adapter内部传入数据；
    创建内部类AdapterViewHolder继承自RecycleView的ViewHolder，并且在内部初始化item数据；
    重写onCreateViewHolwer(ViewGroup parent,int viewType)方法进行加载布局；
    重写onBindViewHolder（WangZheAdaoter.ViewHolder holder, int position）方法进行数据的适配；
    重写getItemCount方法，返回数据源大小；
    
适配器编译如下
![Image text](https://github.com/jiugeishere/66ds/blob/master/a/2.png)
![Image text](https://github.com/jiugeishere/66ds/blob/master/a/3.png)

（3）RxAndroid+RxJava+Gson+retrofit+okhttp初步搭建android网络请求框架
     
     1.首先build.gradle文件中引用依赖库
     2.通过Builder模式创建Retrofit对象
     3.定义或者通过GsonFormat插件把Json字符串生成实体类(本例中的实体类MemberEntity)
     4.定义接口
     5.创建接口实例，调用接口并通过观察者模式获取数据
     
网络请求编译如下
![Image text](https://github.com/jiugeishere/66ds/blob/master/a/4.png)
![Image text](https://github.com/jiugeishere/66ds/blob/master/a/5.png)
3.其他注意：

     本实验相关项：
     maven { url 'http://maven.aliyun.com/nexus/content/groups/public/'} 包下载链接为阿里库
     classpath 'com.android.tools.build:gradle:3.0.0' Gradle版本
     compileSdkVersion 27 SDK版本
     
 4.结果显示：

<div style="float:left" >
<img src="https://github.com/jiugeishere/66ds/blob/master/a/6.jpg" alt="" width="240dp" height="400dp">
</div>
<div style="float:left">
<img src="https://github.com/jiugeishere/66ds/blob/master/a/8.jpg" alt="" width="240dp" height="400dp">
</div><br>
<div style="float:left">
<img src="https://github.com/jiugeishere/66ds/blob/master/a/9.jpg" alt="" width="240dp" height="400dp">
</div>
<div style="float:left">
<img src="https://github.com/jiugeishere/66ds/blob/master/a/7.jpg" alt="" width="240dp" height="400dp">
</div>
