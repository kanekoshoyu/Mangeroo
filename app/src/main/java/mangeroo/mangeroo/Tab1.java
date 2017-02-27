package mangeroo.mangeroo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by shoyu on 16/2/2017.
 */

public class Tab1 extends Fragment {
    Firebase mRef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        Switch mSwitchFree = (Switch) rootView.findViewById(R.id.switchFree);
        final TextView mTextViewList = (TextView) rootView.findViewById(R.id.textViewList);
        mRef = new Firebase("https://mangeroo-efcd3.firebaseio.com/friend");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mTextViewList.setText(text);
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

        mSwitchFree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    mRef.setValue("Shoyu is free now for dining");
                else
                    mRef.setValue("Shoyu is not free");
            }
        });

        return rootView;


    }
}
