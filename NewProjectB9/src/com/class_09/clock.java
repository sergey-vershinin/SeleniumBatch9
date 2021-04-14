package com.class_09;

public class clock {

	public static void main(String[] args) {
		
		
	
		for (int e =0; e<24; e++) { 
			for (int f=0; f<60; f++){ 
				if(e<10 && f<10 ) {
					System.out.println("0"+e+":"+"0"+f);
				}else if(e<10 && f>=10 ) {
					System.out.println("0"+e+":"+""+f);
				}else if(e>=10 && f<10) {
					System.out.println(""+e+":"+"0"+f);
				}else {
					System.out.println(""+e+":"+""+f);
				}
	}

}
	}
}
