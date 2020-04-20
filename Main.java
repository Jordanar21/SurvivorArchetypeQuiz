import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       
        Player player = new Player();
        Questions q = new Questions();
        Male male = new Male();
        Female female = new Female();
        Scanner keyboard = new Scanner(System.in);
        
	System.out.println("This program will tell you which Survivor archetype you belong to.\n");
	q.gender(player);
	q.age(player);
	q.friendly(player);
	q.athletic(player);
	q.deceitful(player);
	q.smart(player);	
	q.work(player);	
	q.leadership(player);
        q.charming(player);
        q.outdoors(player);
	q.married(player);
	q.children(player);
        q.initiative(player);
        
	if (player.getGender() == true) male.male(player);
	else if (player.getGender() == false) female.female(player);

	System.out.println("You are " + player.getName() + "!\n"); 
    }
}
