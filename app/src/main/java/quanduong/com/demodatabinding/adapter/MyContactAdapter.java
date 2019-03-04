package quanduong.com.demodatabinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import quanduong.com.demodatabinding.R;
import quanduong.com.demodatabinding.databinding.ItemContactBinding;
import quanduong.com.demodatabinding.model.MyContactModel;

public class MyContactAdapter extends BaseAdapter {
    private ObservableArrayList<MyContactModel> listData = new ObservableArrayList<>();
    private LayoutInflater layoutInflater;

    public MyContactAdapter(ObservableArrayList<MyContactModel> listData) {
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(layoutInflater == null){
            layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        ItemContactBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_contact, parent, false);
        binding.setMyContact(listData.get(position));
        return binding.getRoot();
    }
}
