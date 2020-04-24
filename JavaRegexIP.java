import java.util.regex.*;

public class JavaRegexIP {
	public static void main(String[] args) {
		String strIP = "127.0.0.255";
		String regexIP = "\\b(2[0-5][0-5]|1[0-9][0-9]|[0-9][0-9]?)\\."
				+ "(2[0-5][0-5]|1[0-9][0-9]|[0-9][0-9]?)\\."
				+ "(2[0-5][0-5]|1[0-9][0-9]|[0-9][0-9]?)\\."
				+ "(2[0-5][0-5]|1[0-9][0-9]|[0-9][0-9]?)\\b";
		System.out.println(strIP.matches(regexIP));
	}
}
