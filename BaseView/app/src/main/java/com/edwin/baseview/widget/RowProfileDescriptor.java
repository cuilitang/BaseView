package com.edwin.baseview.widget;

/**
 * @USER Wu Hao You
 * @DATE 16/5/28 21:12
 */
public class RowProfileDescriptor extends BaseRowDescriptor {
    public String imgUrl;
    public String label;
    public String detailLabel;

    public RowProfileDescriptor(String imgUrl, String detailLabel, String label, RowActionEnum action) {
        this.detailLabel = detailLabel;
        this.imgUrl = imgUrl;
        this.label = label;
        this.action = action;
    }
}
