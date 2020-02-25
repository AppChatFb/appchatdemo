package com.example.appchatfb.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.appchatfb.Adapter.ViewPagerAdapter;
import com.example.appchatfb.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{
   private ViewPager vpChat;
   private TabLayout tlChat;
   private ViewPagerAdapter adapter;
   private Toolbar toolbar;
    private FragmentManager fragmentManager;
    private final int REQUEST_CODE_CAMERA = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menusetting);
        setSupportActionBar(toolbar);
        vpChat=findViewById(R.id.vp_Chat);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        vpChat.setAdapter(adapter);
        tlChat=findViewById(R.id.tb_Chat);
        tlChat.setupWithViewPager(vpChat);
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusetting,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.acc_setting:
                AccSettingFragment fragment = new AccSettingFragment();
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_up,R.anim.slide_in_down,R.anim.slide_out_down,R.anim.slide_out_up)
                        .replace(R.id.container,fragment).addToBackStack(null).commit();
                break;
            case R.id.all_user:
                break;
            case R.id.log_out:
                break;

        }
        return super.onOptionsItemSelected(item);
    }




}
