package day_01;

import java.util.Calendar;
import java.util.Date;

public class goods {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        cl.set(2021, 2, 13);
        cl.add(Calendar.DATE, 48);
        cl.add(Calendar.WEEK_OF_MONTH, -1);
        cl.set(Calendar.DAY_OF_WEEK, 5);
        Date time = cl.getTime();
        System.out.println(time);
    }
}
/*
https://github.com/envy-823/home_work.git*/
