package mydate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
获取前天的日期(注意：y【年】是4个大写，M【月】:两个大写，H[小时],24h制，h[小时]，12小时，EEEE表示星期)
 */
public class TestGetDate {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-2);
        Date d=cal.getTime();
        SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss EEEE" ,Locale.CHINA);
        String qiantian = sp.format(d);//获取昨天日期
        System.out.println("昨天的日期是："+qiantian);
    }
}
