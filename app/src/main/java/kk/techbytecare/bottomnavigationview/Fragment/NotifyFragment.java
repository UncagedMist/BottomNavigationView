package kk.techbytecare.bottomnavigationview.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import kk.techbytecare.bottomnavigationview.R;

public class NotifyFragment extends Fragment {


    public NotifyFragment() {
        // Required empty public constructor
    }

    public static NotifyFragment getInstance()  {
        return new NotifyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notify, container, false);
    }

}
