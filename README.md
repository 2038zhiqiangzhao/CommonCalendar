# CommonCalendar
一款上下可以滑动列表的上下连选日历
在oncreat方法中



 SlideWayManager slideWayManager=new SlideWayManager(MainActivity.this,R.layout.activity_main);
        View view = slideWayManager.SlideMode(DPMode.VERTICAL);
        setContentView(view);
        slideWayManager.setCalendarClickListener(new SlideWayManager.OnCalendarClickListener() {
            @Override
            public void setOnCalendarClickListener(String startDate, String endDate) {
                Toast.makeText(MainActivity.this,"选择范围：startDate"+startDate+",endDate:"+endDate,Toast.LENGTH_SHORT).show();
            }
        });
        
        
        
        
        
即可        
        
