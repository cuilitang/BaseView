package com.edwin.baseview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @USER Wu Hao You
 * @DATE 16/5/28 21:24
 */
public abstract class BaseRowView extends LinearLayout {
    public BaseRowView(Context context) {
        super(context);

    }

    public BaseRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract void initializeData(BaseRowDescriptor descriptors, OnRowClickListener listener);

    public abstract void notifyDataChangeed();
}
