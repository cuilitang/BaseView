package com.edwin.baseview.widget;

import java.util.ArrayList;

/**
 * @USER Wu Hao You
 * @DATE 16/5/27 23:54
 */
public class GroupDescriptor {
    public String title;
    public ArrayList<BaseRowDescriptor> descriptors;

    public GroupDescriptor(ArrayList<BaseRowDescriptor> descriptors) {
        this.descriptors = descriptors;
    }

    public GroupDescriptor(String title, ArrayList<BaseRowDescriptor> descriptors) {
        this.title = title;
        this.descriptors = descriptors;
    }
}
