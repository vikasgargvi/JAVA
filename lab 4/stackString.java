import java.util.*;
  
public class stackString{
    public static void main(String[] args){
        GStack<String> s = new GStack<String>();
          Scanner inp = new Scanner(System.in);
          String str;
  
          System.out.println("Enter a string..\n");
          str = inp.nextLine();
  
          StringTokenizer t = new StringTokenizer(str);
  
          while(t.hasMoreTokens()){
              s.push(t.nextToken());
          }
  
	  System.out.println("\nReverse String...\n" + s);
          /*do{
              str = s.pop();
              System.out.println(str);
          }while(str != null);*/    
    }                                        
}                  
