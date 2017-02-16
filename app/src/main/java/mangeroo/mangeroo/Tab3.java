package mangeroo.mangeroo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by shoyu on 16/2/2017.
 */

public class Tab3 extends Fragment{


    String[] android_version={
            "Eclair",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Kitkat",
            "Lollipop",
            "Marshmallow",
            "Nougat"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the View first to facilitate findViewById
        View rootView = inflater.inflate(R.layout.tab3, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //creates the adapter for the ListView, and show the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android_version);
        listView.setAdapter(adapter);
        return rootView;

    }
}
