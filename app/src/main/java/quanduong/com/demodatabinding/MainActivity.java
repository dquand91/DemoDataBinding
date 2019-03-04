package quanduong.com.demodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import quanduong.com.demodatabinding.databinding.ActivityMainBinding;
import quanduong.com.demodatabinding.model.MyContactListModel;
import quanduong.com.demodatabinding.model.MyHeaderModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        mainBinding.setHeaderModel(new MyHeaderModel("Title Header!!!"));

        MyContactListModel myContactListModel = new MyContactListModel();
        mainBinding.setFuckingList(myContactListModel);


    }
}
