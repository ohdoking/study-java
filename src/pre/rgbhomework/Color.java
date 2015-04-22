package pre.rgbhomework;

public class Color {

	public int rgb;

	public int red;
	public int green;
	public int blue;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;

		setRgb(red, green, blue);
	}

	int getRgb() {
		return rgb;
	}

	void setRgb(int red, int green, int blue) {

		
		int temRed = red << 16;
		int temGreen = green << 8;
		int temBlue = blue;

		rgb = temRed | temGreen | temBlue;
	
		showResult(rgb);
	}

	String getRed() {
		return String.format("0x%X", red);
	}

	void setRed(int red) {
		
		this.red = red;
		int temRed = (red << 16) | 0x0000;
		
		int temRgb = rgb & 0x00FFFF;
		
		temRgb = temRgb | temRed;   
		rgb = temRgb;
		
		showResult(temRgb);
	}

	String getGreen() {
		return String.format("0x%X", green);
	}

	void setGreen(int green) {
		this.green = green;
		
		int temGreen = (0x00 << 16) | (green << 8) | 0x00;
		int temRgb = rgb & 0xFF00FF;

		temRgb = temRgb | temGreen;   
		rgb = temRgb;
		
		showResult(temRgb);
	}

	String getBlue() {
		return String.format("0x%X", blue);
	}

	void setBlue(int blue) {
		this.blue = blue;
		
		int temBlue = (0x00 << 16) | (0x00 << 8) | blue;
		int temRgb = rgb & 0xFFFF00;

		temRgb = temRgb | temBlue;   
		rgb = temRgb;

		showResult(temRgb);
	}
	
	void showResult(int result){
		String resultValue = String.format("0x%X", result);
		System.out.println(resultValue);

	}

}
