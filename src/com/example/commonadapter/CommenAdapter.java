package com.example.commonadapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CommenAdapter<T> extends BaseAdapter {
	protected Context context;
	protected List<T> lists;
	private int layoutId;
	private int viewTypeCount;

	public CommenAdapter(Context context, int layoutId) {
		this.context = context;
		lists = new ArrayList<T>();
		this.layoutId = layoutId;
	}
	public CommenAdapter(Context context, int layoutId,int viewTypeCount) {
		this.context = context;
		lists = new ArrayList<T>();
		this.layoutId = layoutId;
		this.viewTypeCount=viewTypeCount;
	}

	/**
	 * 用于刷新列表数据
	 * 
	 * @param list
	 * @param isclear 是否清除之前数据
	 */
	public void updateViewData(List<T> list, boolean isclear) {
		if (isclear) {
			lists.clear();
		}
		lists.addAll(list);
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return lists.size();
	}

	@Override
	public T getItem(int position) {
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		CommenViewHolder holder = CommenViewHolder.getCommenViewHolder(context,
				position, convertView, parent, layoutId);
		convert(holder, getItem(position));
		return holder.getConvertView();
	}
	/**
	 * 视图显示事件处理方法
	 * 
	 * @param holder
	 * @param t
	 */
	public abstract void convert(CommenViewHolder holder, T t);

}
