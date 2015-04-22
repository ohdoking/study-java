package pre.rgbhomework;

public class RgbTest {

	public static void main(String[] args) {

		
		/**
		 *  Xor를 3번하면 int 값은 치환이 된다.
		 */
/*		int a = 10;
		int b = 27;
		
		a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a : "+ a + "/ b : " + b);
		*/
		
		int red = 0x1F;
		int green = 0x01;
		int blue = 0xE1;
		
		Color c = new Color(red, green, blue);
		
		c.setRed(0xAA);
		c.setGreen(0xAA);
		c.setBlue(0xAA);
		c.setRed(0xEE);
		
		
	}
}
