package quanduong.com.demodatabinding.model;

import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.view.View;

import java.util.Random;

public class MyContactListModel{

    public ObservableArrayList<MyContactModel> listContact = new ObservableArrayList<>();

    public ObservableArrayList<MyContactModel> getListContact() {
        return listContact;
    }

    public void setListContact(ObservableArrayList<MyContactModel> listContact) {
        this.listContact = listContact;
    }

    private int totalContact = 500;
    Random random = new Random();

    public MyContactListModel() {

        for (int i = 0; i < totalContact; i++) {
            MyContactModel contactModel = new MyContactModel();
            String nameTemp = "Name " + i;
            String phoneTemp = "091";
            for (int j = 0; j <7 ; j++) {
                phoneTemp = phoneTemp + random.nextInt(10);
            }
            contactModel.setName(nameTemp);
            contactModel.setPhone(phoneTemp);
            listContact.add(contactModel);

        }
    }

    public void addNewContactFromView(View view){
        String nameNew = "Ten " + (++totalContact);
        String phoneNew = "091";
        for (int i = 0; i <7 ; i++) {
            phoneNew = phoneNew + random.nextInt(10);
        }
        MyContactModel contactModel = new MyContactModel(phoneNew, nameNew);
        listContact.add(contactModel);
    }

    public void removeContactFromview(View view){
        // Ở đây chỉ demo nên mình sẽ xóa cái phần tử đầu tiên thử
        if(!listContact.isEmpty()){
            listContact.remove(0);
        }
    }
}
