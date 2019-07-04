/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_floors;
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
//String s1 ="first floor";
//String s2 = "second floor";
//String s3 = "third floor";
//String bh= "not your lucky day!";
char next = 'n';
char done = 'd';
Random r = new Random();

int length;
System.out.println("How many Techs are working today?");
length = in.nextInt();
String[] techs = new String[length];

for(int k = 0 ; k < length; k++)
{
    System.out.println ("Enter the name of Techs" + (k+1));
    techs[k] = in.next();
}
in.close();
System.out.println("----------------------------------------------------------");
for(int j=0; j<techs.length; j++){
int randomPeople = r.nextInt(techs.length);
System.out.println(techs[j]);

for(int i=0; i<floors.length; i++ ){
int randomNumber = r.nextInt(floors.length);
System.out.println(floors[randomNumber]);
System.out.println("----------------------------------------------------------");
break;

        
};
};


}
}

