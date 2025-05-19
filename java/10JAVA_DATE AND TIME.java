//printing days of week
public static String findDay(int month, int day, int year) {
        
 String []days_of_week={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
 Calendar cal=Calendar.getInstance();
 cal.set(year,month-1,day);
 int p=cal.get(Calendar.DAY_OF_WEEK);
 return days_of_week[p-1];
    }

}
