package com.example.commonadapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shishaocong on 15/11/16.
 */
public class MyCommenAdapter extends CommenAdapter<Grade> {

	public MyCommenAdapter(Context context) {
		super(context, R.layout.simple_lv_item2);
	}

	@Override
	public void convert(CommenViewHolder holder, Grade grade) {
		holder.setText(R.id.tv, grade.getId()).setText(R.id.tv1,grade.getName());

	}
}
