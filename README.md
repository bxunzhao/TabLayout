
[博客地址](http://www.richzjc.top)

# 简介

其实android sdk里面提供的tablayout,能供大多数场景里面使用。
但是我公司在之前开发的过程中，产品需要对选中的tab设置indicatorWith.
以及对选中的tab文字加粗的效果。于是我对系统提供的tablayout做了二次开发。
并且上传到了jcenter，效果图如下：

# 效果图

![](http://p8k4f5rra.bkt.clouddn.com/device-2018-06-17-105142.png)

# 使用

    <com.richzjc.library.TabLayout
            android:id="@+id/tab"
            android:layout_width="match_parent"
            android:layout_height="50dp"
            app:tabMode="scrollable"
            app:tabGravity="center"
            app:tabIndicatorColor="#1482f0"
            app:tabIndicatorHeight="3dp"
            app:tabSelectedTextColor="#000000"
            app:tabTextColor="#333333"
            app:tabIndicatorWidth="10dp"
            app:tabSelectedBold="true"
            app:tabNeedIndicatorAnim="false"
            />

# 属性介绍

    tabIndicatorWidth: 描述的是indicator的宽度
    tabSelectedBold: 描述的是tab选中时是否加粗，默认为true
    tabNeedIndicatorAnim: 描述tab在切换的时候indicator是否需要添加动画，默认为true是需要添加动画的

欢迎大家fork和star