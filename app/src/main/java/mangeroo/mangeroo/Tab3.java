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
    ListView listView;
    ArrayAdapter<String> adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab3, container, false);

        String[] android_version={
                "Cupcake",
                "Donut",
                "Eclair",
                "Froyo",
                "Gingerbread",
                "Honeycomb",
                "Kitkat",
                "Lollipop",
                "Marshmallow",
                "Nougat"};
        listView= (ListView) rootView.findViewById(R.id.list_view);


        return rootView;

    }
}
