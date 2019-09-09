package kk.techbytecare.bottomnavigationview.Helper;

import android.annotation.SuppressLint;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Field;

public class BottomNavigationViewHelper {

    @SuppressLint("RestrictedApi")
    public static void disableShiftMode(BottomNavigationView view)  {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView)view.getChildAt(0);

        try {
            Field shiftMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftMode.setAccessible(true);
            shiftMode.setBoolean(menuView,false);
            shiftMode.setAccessible(false);

            if (menuView.getChildCount() < 5)   {
                for (int i = 0; i < menuView.getChildCount(); i++)  {
                    BottomNavigationItemView item = (BottomNavigationItemView)menuView.getChildAt(i);

                    item.setShifting(false);
                    item.setChecked(item.getItemData().isChecked());
                }
            }


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
