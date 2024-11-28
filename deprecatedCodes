```
  package com.xpertrade.android.activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xpertrade.android.R;
import com.xpertrade.android.fragment.BusinessFragment;
import com.xpertrade.android.fragment.HomeFragment;
import com.xpertrade.android.fragment.ProfileFragment;
import com.xpertrade.android.fragment.WalletFragment;

public class DashboardActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set a listener to handle item selection
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment selectedFragment = null;

                // Switch between fragments based on the selected item
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.navigation_search:
                        selectedFragment = new WalletFragment();
                        break;
                    case R.id.navigation_profile:
                        selectedFragment = new BusinessFragment();
                        break;
                    case R.id.navigation_profile:
                        selectedFragment = new ProfileFragment();
                        break;
                }

                // Replace the current fragment with the selected fragment
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fl_home, selectedFragment) // Replace the fragment inside FrameLayout
                            .commit();
                }

                return true;
            }
        });

        // Set the default fragment when the activity is created
        if (savedInstanceState == null) {
            // Add the default fragment (HomeFragment)
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_home, new HomeFragment()) // Replace with the default fragment
                    .commit();
        }
    }
}
```
