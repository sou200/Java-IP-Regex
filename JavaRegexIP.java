import java.util.regex.*;

public class JavaRegexIP {

	public static void main(String[] args) {
		String strIP = "127.0.0.255";
		String regexIP = "\\b(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\b";
		checkRegex(regex, strIP);
	}
	public static void checkRegex(String regex, String str) {
		Pattern complRegex = Pattern.compile(regex);
		Matcher matcher = complRegex.matcher(str);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}