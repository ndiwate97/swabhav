public class SubstringTest {

	public static void main(String[] args) {

		String url = "https://www.Google.com?developer=namarataDiwate";
		System.out.println("case1\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));
		
		url = "https://developer=namarataDiwate";
		System.out.println("case2\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));
		
		url = "https://www.Google.com?";
		System.out.println("case3\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));

	}

	public static String copmpanyInfo(String url) {
		if (url.indexOf('.') > 0 && url.lastIndexOf('.') > 0 )
			return (url.substring(url.indexOf('.') + 1, url.lastIndexOf('.')));
		else
			return (null);
	}

	public static String developerInfo(String url) {
		if (url.indexOf('=') > 0)
			return (url.substring(url.indexOf('=') + 1));
		else
			return (null);
	}
}
