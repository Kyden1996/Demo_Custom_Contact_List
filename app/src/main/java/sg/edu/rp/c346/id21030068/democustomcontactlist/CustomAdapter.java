package sg.edu.rp.c346.id21030068.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;


    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.contactList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);

        Contact currentItem = contactList.get(position);
        tvName.setText(currentItem.getName());
        char gender = currentItem.getGender();
        if(gender == 'F' || gender == 'f') {
            ivGender.setImageResource(R.drawable.female);

        } else {
            ivGender.setImageResource(R.drawable.male);

        }
        tvCode.setText("+" + currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNumber() + "");

        return rowView;
    }
}
