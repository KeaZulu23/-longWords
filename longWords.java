import java.util.Scanner;

public class longWords {
	
	static int wordcount(String words)  {  
      
		int count=0;  
  
        char ch[]= new char[words.length()];     
        for(int i=0;i<words.length();i++)  
        {  
            ch[i]= words.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Please type a full sentence of more than four words, then press enter: ");

	    String words = sc.nextLine();
	    
	    int count = 0;
	    double sum = 0;
	    double average = 0;
	    
	   for (int i = 0; i < words.length(); i++ ) {
	    if (words.equals("quit")) { // if entered value is 'quit' than it comes out of loop
            break;
        } 
	    else {
		    sc = new Scanner(words);

		    while (sc.hasNext()) {

		        String userInput = sc.next();

		        double charNum = userInput.length();
		        sum = charNum + sum;
		        count++ ;

		        if (count > 0) {
		            average = sum / count;
		        }

	    }
	    
	    }
	  }
	   System.out.println(wordcount(words) + " words."); 
	   
	   System.out.println();
	   
	   System.out.println("Average word length = " + average);
    }
}


