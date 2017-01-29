package chatting;

import java.io.Serializable;

public class ChattingProtocol implements Serializable {

	private static final long serialVersionUID = 1;
	String message;
	String from;
	String target;
	int control;
	/*
	 * 0 : Normal Message / 1 : LogIn / 2 : Exit / 3 : Exception
	 */
	boolean isToAll;

	/*
	 * true : Message will send to all / false : Message will send to one
	 */

	public ChattingProtocol(String message, String from, String target, int control, boolean isToAll) {
		this.message = message;
		this.from = from;
		this.target = target;
		this.control = control;
		this.isToAll = isToAll;
	}
}
