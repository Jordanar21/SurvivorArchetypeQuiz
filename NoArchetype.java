import java.util.Scanner;
public class NoArchetype {
    
    Scanner keyboard = new Scanner (System.in);
    
    void noArchetype(Player player){
        System.out.println("**IMPORTANT**: Make sure to ignore the question mark and the (Y/N) at the end of \nthis question. "
                + "Please enter the digit \"6\" to continue? (Y/N)");
        char c = keyboard.next().charAt(0);
        if (c == '6') {System.out.println("\nThe program was unable to get your archetype. Rest assured that this is in no way your fault. \n"
            + "Please take note of your answers and message Jordanar21 on Reddit, who will adjust the algorithm to get your"
            + " archetype. \nThank you!\n"); player.setName("unique"); return;} 
        else {System.out.println("Get lost, jerk. You wasted my time."); player.setName("a troll"); return;}
    }
}
