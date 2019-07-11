/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_floors;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author asmomin6
 */
public class randomfloor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner in = new Scanner(System.in);
       
 
String[] floors ={"1st floor", "2nd floor","3rd floor", "BH Buddy! Not your lucky day!"};
Random r = new Random();

int length;
System.out.println("How many Techs are working today?");
length = in.nextInt();
String[] techs = new String[length];

for(int k = 0 ; k < length; k++)
{
    System.out.println ("Enter the name of Tech" + (k+1));
    techs[k] = in.next();
}
in.close();
System.out.println("--------------------------------------------------------");

final Set<Integer> s = new HashSet<>();

for(int i = 0; i < techs.length; i++){
                while(true) {
                int pick = r.nextInt(techs.length);
                if (s.contains(pick) == false){
                    s.add(pick);
                    System.out.println(techs[i] + " " + floors[pick]);
                    break;


}
             
}
 
}
}



};
    
    

