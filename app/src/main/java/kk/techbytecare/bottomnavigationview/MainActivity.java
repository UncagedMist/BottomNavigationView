package kk.techbytecare.bottomnavigationview;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import kk.techbytecare.bottomnavigationview.Fragment.HomeFragment;
import kk.techbytecare.bottomnavigationview.Fragment.HospitalFragment;
import kk.techbytecare.bottomnavigationview.Fragment.NotifyFragment;
import kk.techbytecare.bottomnavigationview.Fragment.ShippingFragment;
import kk.techbytecare.bottomnavigationview.Helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;

                switch (item.getItemId())   {
                    case R.id.action_home:
                        selectedFragment = HomeFragment.getInstance();
                        break;

                    case R.id.action_hospital:
                        selectedFragment = HospitalFragment.getInstance();
                        break;

                    case R.id.action_shipping:
                        selectedFragment = ShippingFragment.getInstance();
                        break;

                    case R.id.action_notify:
                        selectedFragment = NotifyFragment.getInstance();
                        break;
                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame,selectedFragment);
                transaction.commit();
                return false;
            }
        });
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,HomeFragment.getInstance());
        transaction.commit();
    }
}
