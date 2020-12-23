public class Reverse {

	public static void main(String[] args) {
		
		String a="Hello World";
		int c=a.length(),i;
		String rev="";  
	    for(i=c-1;i>=0;i--){  
	        rev+=a.charAt(i);  
	    }  
	      
		System.out.println(rev);

          System.out.println("This is the Revserse String is:");

	}

}
