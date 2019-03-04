package quanduong.com.demodatabinding;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

import quanduong.com.demodatabinding.adapter.MyContactAdapter;

public class ListContactBinder {

    @BindingAdapter("app:fuckingItems")
    public static void bindListContact(ListView listView, ObservableArrayList listObserver){
        MyContactAdapter myContactAdapter = new MyContactAdapter(listObserver);
        listView.setAdapter(myContactAdapter);
    }
}
