package com.dogannn.ceng3545.week3;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    List<Post> posts;
    LayoutInflater inflater;
    public PostAdapter(Activity activity, List<Post> list){
        this.posts = list;
        inflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.row,null);
        EditText txtMessage = rowView.findViewById(R.id.txtMessage);
        TextView txtName = rowView.findViewById(R.id.txtName);
        ImageView img = rowView.findViewById(R.id.img);

        Post post = posts.get(position);
        txtMessage.setText((post.getMessage()));
        img.setImageBitmap(post.getImage());

        return rowView;

    }
}
