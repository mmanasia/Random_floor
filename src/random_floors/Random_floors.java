/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_floors;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random; 
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
/**
 *
 * @author mmanasia
 */
public class Random_floors {

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
final Set<Integer> t = new HashSet<>();
for(int i = 0; i < techs.length; i++){
                while(true){
                int tec = r.nextInt(techs.length) + 1;
                do{
                if (t.contains(tec) == false){
                    t.add(tec);
                    System.out.println(techs[tec - 1]);
                }
                else{
                    tec = r.nextInt(techs.length) + 1;
                }
                }while(t.contains(tec) == false);
//                int pick = r.nextInt(techs.length) + 1;
                
//                if (s.contains(pick) == false){
//                    s.add(pick);
//                    System.out.println(floors[pick - 1]);
                break;
                }
}
}//hello
};