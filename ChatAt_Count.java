import java.util.*;

public class ChatAt_Count {
        public static void main (String []args){
            Scanner s = new Scanner(System.in);
            int [] myArray = new int[256];
            String a;
            a=s.nextLine();
            for(int i=0;i<a.length();i++){
                myArray[a.charAt(i)]++;
            }
            for(int i=0;i<256;i++){
                if(myArray[i]!=0){
                    System.out.println((char)i+"="+myArray[i]);
                }
            }
    }
}
