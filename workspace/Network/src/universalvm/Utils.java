package universalvm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
