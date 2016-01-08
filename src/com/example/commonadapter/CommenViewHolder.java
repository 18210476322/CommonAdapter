package com.example.commonadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shishaocong on 15/11/16.
 */
public class CommenViewHolder {
	private SparseArray<View> mViews;
	private int mPosition;
	private View convertView;

	public CommenViewHolder(Context context, int position, ViewGroup parent,
			int layoutId) {
		mPosition = position;
		mViews = new SparseArray<View>();
		convertView = LayoutInflater.from(context).inflate(layoutId, parent,
				false);
		convertView.setTag(this);
	}
	/**
	 * 得到ViewHolder
	 * @param context
	 * @param position
	 * @param convertView
	 * @param parent
	 * @param layoutId 布局id
	 * @return
	 */
	public static CommenViewHolder getCommenViewHolder(Context context,
			int position, View convertView, ViewGroup parent, int layoutId) {
		if (convertView == null) {
			return new CommenViewHolder(context, position, parent, layoutId);
		} else {
			CommenViewHolder commenViewHolder = (CommenViewHolder) convertView
					.getTag();
			commenViewHolder.mPosition = position;
			return commenViewHolder;
		}
	}

	/**
	 * 得到当前索引
	 * 
	 * @return
	 */
	public int getPosition() {
		return mPosition;
	}

	/**
	 * 根据id得到当前视图
	 * 
	 * @param viewId
	 * @return
	 */
	public <T extends View> T getView(int viewId) {
		View view = mViews.get(viewId);
		if (view == null) {
			view = convertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}
	/**
	 * 得到当前项视图
	 * @return
	 */
	public View getConvertView() {
		return convertView;
	}

	// /////////////////////////////////////////////////////////////为视图赋值的辅助方法
	/**
	 * 为TextView视图赋值
	 * 
	 * @param viewId
	 * @param text
	 * @return
	 */
	public CommenViewHolder setText(int viewId, String text) {
		TextView tv = getView(viewId);
		tv.setText(text);
		return this;
	}
}
