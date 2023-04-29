package Aula13;

import java.text.DecimalFormat;
public class CasasDecimal {

	public static void main(String[] args) {
		double pi = 3.14159265;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("O valor de PI é"+df.format(pi));
	}

}
