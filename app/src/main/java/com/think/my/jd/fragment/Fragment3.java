package com.think.my.jd.fragment;

import android.view.View;
import android.widget.TextView;

import com.think.my.jd.base.BaseFragment;

/**
 * Created by think on 2017/11/27.
 */

public class Fragment3 extends BaseFragment{
    @Override
    protected View onCreateSuccessedView() {
        TextView view = new TextView(this.getActivity());
        view.setText("3333");
        return view;
    }
}
