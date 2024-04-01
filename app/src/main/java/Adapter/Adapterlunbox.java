
package com.nguyenducthang.test.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nguyenducthang.test.R;
import com.nguyenducthang.test.lunboxActivity;
import com.nguyenducthang.test.Model.Rice;
import java.util.List;

public class adapterlunchbox {


    public adapterlunchbox(lunboxActivity lunchboxActivity, int riceAdapter, List<Rice> riceList) {
    }

    public class AdapterLunchBox extends BaseAdapter {
        Context context;
        int layout;
        List<Rice> riceList;
        ViewHolder viewHolder;
        public AdapterLunchBox(Context context, int layout, List<Rice> riceList) {
            this.context = context;
            this.layout = layout;
            this.riceList = riceList;
        }

        @Override
        public int getCount() {
            return riceList.size();
        }

        @Override
        public Object getItem(int position) {
            return riceList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.rice_adapter, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.imvPhoto = view.findViewById(R.id.imvPhoto);
                viewHolder.dishName = view.findViewById(R.id.dishName_txt);
                viewHolder.placeName = view.findViewById(R.id.placeName_txt);
                viewHolder.ratingValue = view.findViewById(R.id.ratingValue_txt);
                viewHolder.ratingCount = view.findViewById(R.id.ratingCount_txt);

                view.setTag(viewHolder);

            }else {
                viewHolder = (ViewHolder) view.getTag();
            }

            Rice rice = riceList.get(position);
            viewHolder.imvPhoto.setImageResource(rice.getPhoto());
            viewHolder.placeName.setText(rice.getPlaceName());
            viewHolder.dishName.setText(rice.getDishName());
            viewHolder.ratingValue.setText((int) rice.getRatingValue());
            viewHolder.ratingCount.setText(rice.getRatingCount());

            return view;
        }

        public class ViewHolder{
            ImageView imvPhoto;
            TextView placeName, dishName, ratingValue, ratingCount;
        }
    }