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

// assigning Techs
for(int j=0; j<techs.length; j++){
System.out.println(techs[j]);
////assigning Floors
//for(int i=0; i<floors.length; i++ ){
//   int randomNumber = r.nextInt(floors.length);
//   final Set<Integer> s = new HashSet<>();
//   while(true)
//   {
//        String[] pick = new String[floors.length];
//        pick = (floors[randomNumber] + 1);
////System.out.println(floors[randomNumber]);
//if(s.contains(s)== false){
//    s.add(i);
//    System.out.println(pick);
//    break;
    

 //randomNumber = r.System.out.println(pick[i]);nextInt(floors.length);
 ///pick[i] = (floors[randomNumber]);

final Set<Integer> s = new HashSet<>();
for(int i = 0; i < techs.length; i++){
    while(true){
    int pick = r.nextInt(techs.length) + 1;
    if (s.contains(pick) == false){
    s.add(pick);
    System.out.println(floors[pick-1]);
}break;
}
}
}
}
};