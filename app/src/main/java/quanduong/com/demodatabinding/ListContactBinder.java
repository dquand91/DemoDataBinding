package quanduong.com.demodatabinding;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

import quanduong.com.demodatabinding.adapter.MyContactAdapter;

public class ListContactBinder {

    // phải tạo cái class Binder này để có thể bind ListView với Adapter từ file layout
    // @BindingAdapter("app:fuckingItems") sẽ làm cho nó hiểu cách bind ListView với Data
    // Đối số trả về ở đây là ListView và ObservableArrayList
    // Trong đó: ListView là bắt buộc, vì mình dùng cái này ở ListView bên file layout.
    // ObservableArrayList là kiểu listData của ListView do mình quy định, nó có thể là 1 loại nào đó khác cũng đc.

    @BindingAdapter("app:fuckingItems")
    public static void bindListContact(ListView listView, ObservableArrayList listObserver){
        MyContactAdapter myContactAdapter = new MyContactAdapter(listObserver);
        listView.setAdapter(myContactAdapter);
    }
}
