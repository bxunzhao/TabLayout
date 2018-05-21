package com.richzjc.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View{

    final CharSequence mText;
    final Drawable mIcon;
    final int mCustomLayout;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);

        final TypedArray a = context.obtainStyledAttributes(attrs, android.support.design.R.styleable.TabItem);
        mText = a.getText(android.support.design.R.styleable.TabItem_android_text);
        mIcon = a.getDrawable(android.support.design.R.styleable.TabItem_android_icon);
        mCustomLayout = a.getResourceId(android.support.design.R.styleable.TabItem_android_layout, 0);
        a.recycle();
    }
}
