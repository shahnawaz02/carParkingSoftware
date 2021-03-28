package com.practices;

import java.io.*;

public class carParkingSoftware {
	
	public void print(int amount) {
		System.out.println("Your Bill is $"+amount);
	}
	public void print(double amount) {
		System.out.println("Your Bill is $"+amount);
	}

	public static void main(String[] args) throws Exception, IOException {
		
		carParkingSoftware cps = new carParkingSoftware();
	    int bill;
		double a = 5;
		int b = 1;
		double c = 0.5;
	    int f = 24;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to car parking Software");
        System.out.println("Enter the time");
        int hr = Integer.parseInt(br.readLine());
                if(hr<= 5) {
        	bill = b*hr;
        	cps.print(bill);
        }else if(hr>5 && hr<24) {
        	double d = hr-a;
            double e = 5+(c*d);
        	cps.print(e);
        }else if(hr>=f) {
            int g = hr-f;
            double h = 15+(g*c);
        cps.print(h);
        }
        
   
	}

}
