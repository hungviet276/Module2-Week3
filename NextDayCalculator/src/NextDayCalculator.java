import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String getNextDay( String date) throws ParseException {
        String myDate = date;
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( dateFormat.parse(myDate));
        calendar.add( Calendar.DATE, 1 );
        String nextDay=dateFormat.format(calendar.getTime());
            return nextDay;
    }
}
