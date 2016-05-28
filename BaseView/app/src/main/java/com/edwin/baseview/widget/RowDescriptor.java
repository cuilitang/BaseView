package com.edwin.baseview.widget;

/**
 * @USER Wu Hao You
 * @DATE 16/5/27 22:46
 */
public class RowDescriptor extends BaseRowDescriptor{
    public int iconResId;
    public String label;

    public RowDescriptor(int iconResId, String label, RowActionEnum action) {
        this.iconResId = iconResId;
        this.label = label;
        this.action = action;
    }
}
