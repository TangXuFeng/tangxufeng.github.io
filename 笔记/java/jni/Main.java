import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Random;

public class Main {
	
	    static {
        URL systemResource = ClassLoader.getSystemResource("libMain.dll");
        String decode = null;
        try {
            decode = URLDecoder.decode(String.valueOf(systemResource.getPath()), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.load(decode);
    }
	
	
	public static void main(String[] args) throws InterruptedException {
		Random random=new Random();
		int a,b;
		a=random.nextInt(100);
		b=random.nextInt(100);
		System.out.println(a+"+"+b+"="+add(a,b));
		Thread.sleep(10000);
	}
	
	public static native int add(int a,int b);
}