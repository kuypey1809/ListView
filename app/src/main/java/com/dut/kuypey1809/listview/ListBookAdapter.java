package com.dut.kuypey1809.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListBookAdapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<ListBook> bookList;

    public ListBookAdapter(Context context, int layout, List<ListBook> bookList) {
        this.context = context;
        this.layout = layout;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgImage;
        TextView txtName,txtDescription;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            // ánh xạ view
            holder.txtName = (TextView) view.findViewById(R.id.twName);
            holder.txtDescription = (TextView) view.findViewById(R.id.twDescription);
            holder.imgImage = (ImageView) view.findViewById(R.id.imgvImamge);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        // gán giá trị
        ListBook listbook = bookList.get(i);

        holder.txtName.setText(listbook.getName());
        holder.txtDescription.setText(listbook.getDescription());
        holder.imgImage.setImageResource(listbook.getImage());

        return view;
    }
}
