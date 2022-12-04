import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class AwtProgram1 {  

public static void level(Label c, String level, int timeout)  
{  
    Frame f = new Frame();  
    Button btn=new Button("Hello World");

    c.setBounds(80, 80, 300, 50);  
    f.add(c);          
    f.setSize(400, 250);
    f.setTitle(level);  
    f.setLayout(null);  
    f.setVisible(true);
    try {
        TimeUnit.SECONDS.sleep(timeout);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    f.setVisible(false); 
} 

public static int[] takeInput() {
	int n= 10;
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter 10 numbers: ");  
    
    int[] array = new int[10];  
      
    for(int i=0; i<n; i++)  
    {  
    array[i]=sc.nextInt();  
    }
    
    return array;
}

public static int compareArray(int[] random, int arraySize, int[] array) {
	int b=0;
    for(int i=0;i<arraySize;i++)
    {
    if(random[i] != array[i])
        b++;
    }
    return b;
}
public static void main(String[] args){
        
        
          	int arraySize=10;
            int random1[]={1,4,7,5,4,7,4,8,6,9};
            Label l1 = new Label("1 4 7 5 4 7 4 8 6 9 ");
            level(l1,"Level 1",5);
            int[] input = takeInput();
            int result = compareArray(random1,arraySize,input);
     
            if(result>0){
                System.out.println("You have enetered incorrectly....");
                System.out.println("The number is 1 4 7 5 4 7 4 8 6 9");
            }
            else {
            	System.out.println("Entering level 2");
            	int random2[]={11, 24, 56, 67, 88, 77, 19, 84, 59, 61};
                Label l2 = new Label("11 24 56 67 88 77 19 84 59 61");
                level(l2,"Level 2",10);
                int[] input2 = takeInput();
                result = compareArray(random2,arraySize,input2);
                if(result>0) {
                	 System.out.println("You have enetered incorrectly....");
                     System.out.println("The number is 11 24 56 67 88 77 19 84 59 61");
                }else {
                	System.out.println("Entering level 3");
                	int random3[]={121, 894, 127, 995, 267, 617, 705, 134, 116, 509};
                    Label l3 = new Label("121 894 127 995 267 617 705 134 116 509");
                    level(l3,"Level 3",20);
                    int[] input3 = takeInput();
                    result = compareArray(random3,arraySize,input3);
                    if(result>0) {
                    	System.out.println("You have enetered incorrectly....");
                        System.out.println("The number is 121 894 127 995 267 617 705 134 116 509");
                    }else {
                    	System.out.println("Congratulations! You have completed 3 levels");
                    }
                }
            }
     
}  
}