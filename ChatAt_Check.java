import java.util.*;

public class ChatAt_Check {
        public static void main (String []args){
            Scanner s = new Scanner(System.in);
            boolean a=true;
            String I = s. nextLine();
            for(int k=0;k<I.length()/2;k++){
                if(I.charAt(k)!= I.charAt(I.length()-1-k)){
                    a=false;
                    break;
                }
            }
            if(a){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
        }

}
