package kk.techbytecare.bottomnavigationview.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import kk.techbytecare.bottomnavigationview.R;

public class ShippingFragment extends Fragment {


    public ShippingFragment() {
        // Required empty public constructor
    }

    public static ShippingFragment getInstance()    {
        return new ShippingFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shipping, container, false);
    }

}
