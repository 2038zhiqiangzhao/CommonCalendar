package common.com.commoncalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import common.com.commoncalendar.Bean.calendars.SlideWayManager;
import common.com.commoncalendar.Utils.DPMode;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SlideWayManager slideWayManager=new SlideWayManager(MainActivity.this,R.layout.activity_main);
        View view = slideWayManager.SlideMode(DPMode.VERTICAL);
        setContentView(view);
        slideWayManager.setCalendarClickListener(new SlideWayManager.OnCalendarClickListener() {
            @Override
            public void setOnCalendarClickListener(String startDate, String endDate) {
                Toast.makeText(MainActivity.this,"选择范围：startDate"+startDate+",endDate:"+endDate,Toast.LENGTH_SHORT).show();
            }
        });
    }




}