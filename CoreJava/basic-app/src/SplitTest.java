
public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.Amazon.com?developer=namarataDiwate";
		System.out.println("case1\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));
		
		url = "https://developer=namarataDiwate";
		System.out.println("case2\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));
		
		url = "https://www.Amazon.com?";
		System.out.println("case3\n"+"Company name is:-" + copmpanyInfo(url));
		System.out.println("Developer name is:-" + developerInfo(url));
		
	}

	private static String copmpanyInfo(String url) {
		if (url.indexOf('.') > 0 && url.lastIndexOf('.') > 0 ) {
			String[] a = url.split("\\.");
			return (a[1]);
		}
		else
			return (null);
		
	}

	private static String developerInfo(String url) {
		if (url.indexOf('=') > 0){
			String[] a = url.split("=");
			return (a[1]);
		}
		else
			return (null);
		
	}

}
