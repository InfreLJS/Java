package chatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	final static String LOG_IN_SUCCESS = "loginsuccess";
	final static String LOG_IN_FAILURE_ID = "loginfailureid";
	final static String LOG_IN_FAILURE_PW = "loginfailurepw";

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
