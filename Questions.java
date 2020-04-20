import java.util.Scanner;
public class Questions {

    Scanner keyboard = new Scanner(System.in);
    void gender(Player player) {
	System.out.println("Do you identify as male or female (M/F)? ");
        char g = keyboard.next().charAt(0);  player.setGender(g);
        }
    void age(Player player) {
	System.out.println("\nAre you 35 years old or older? (Y/N) ");
	char a = keyboard.next().charAt(0); player.setAge(a);
    }
    void friendly(Player player) {
	System.out.println("\nPeople who know me would say that I am a friendly person.");
	int f = agree();  player.setFriendly(f);
    }
    void athletic(Player player) {
        System.out.println("\nI consider myself to be an athletic person.");;
	int a = agree(); player.setAthletic(a);
    }
    void deceitful(Player player) {
	System.out.println("\nI am good at being deceitful.");
	int d = agree(); player.setDeceitful(d);
        }
    void beauty(Player player) {
        System.out.println("\nPeople have often told me that I am attractive or good-looking.");
	int b = agree(); player.setBeauty(b);
    }
    void smart(Player player) {
	System.out.println("\nI consider myself to be smarter than most people.");
	int s = agree(); player.setSmart(s);
    }
    void confidence(Player player) {
        System.out.println("\nI consider myself to be a confident person.");
	int c = agree(); player.setConfidence(c);
    }
    void work(Player player) {
	System.out.println("\nI consider myself to have a strong work ethic.");
	int w = agree(); player.setWork(w);
    }
    void intimidating(Player player) {
	System.out.println("\nOthers are often intimidated by my physical size.");
	int i = agree(); player.setIntimidating(i);
    }
    void leadership(Player player) {
	System.out.println("\nI often like to be in a leadership role.");
	int p = agree(); player.setLeadership(p);
    }
    void married(Player player) {
        System.out.println("\nHave you ever been married or are currently engaged? (Y/N) ");
	char m = keyboard.next().charAt(0); player.setMarried(m);
    }
    void children(Player player) {
        System.out.println("\nDo you have at least one child? (Y/N)");;
	char c = keyboard.next().charAt(0); player.setChildren(c);
    }
    void charming(Player player){
        System.out.println("I am good at being charming or romantic when I want to be.");
        int c = agree(); player.setCharming(c);
    }
    void initiative(Player player){
        System.out.println("When I'm hoping for something I like to make it happen instead of waiting for it to happen.");
        int i = agree(); player.setInitiative(i);
    }
    void outdoors(Player player){
        System.out.println("I like to go camping in the outdoors, or I have experience working in the outdoors.");
        int o = agree(); player.setOutdoors(o);
    }
    void unique(Player player){
        System.out.println("There are many qualities about me that make me unique or eccentric.");
        int u = agree(); player.setUnique(u);
    }

//male	
    void accent(Player player) {
        System.out.println("\nDo you have a southern accent? (Y/N) ");
	char a = keyboard.next().charAt(0); player.setAccent(a);
    }
    void experience(Player player) {
        System.out.println("\nI feel like I have a lot of life experience.");
	int e = agree(); player.setExperience(e);
    }
    void stories(Player player){
        System.out.println("\nI like to share with other people the experiences in my life.");
        int s = agree(); player.setStories(s);
    }
    void military(Player player){
        System.out.println("Have you served in the military? (Y/N)");
        char m = keyboard.next().charAt(0); player.setMilitary(m);
    }
    void arrogant(Player player){
        System.out.println("I often feel that I am the \"smartest person in the room\"");
        int a = agree(); player.setArrogant(a); 
    }
    void opinions(Player player){
        System.out.println("I often express my opinions to other people.");
        int o = agree(); player.setOpinions(o);
    }
    void age50(Player player){
        System.out.println("Are you age 50 or older? (Y/N)");
        char a = keyboard.next().charAt(0); player.setAge50(a);
    }
    void age30(Player player){
        System.out.println("Are you under the age of 30? (Y/N)");
        char a = keyboard.next().charAt(0); player.yesNo(a);
    }
    void playDumb(Player player){
        System.out.println("When I try to \"play dumb\" to hide the fact that I know something, it almost always works.");
        int p = agree(); player.setPlayDumb(p);
    }
    void chanceToWin(Player player){
        System.out.println("If I were on Survivor, I feel like I would have a very good chance to win.");
        int c = agree(); player.setChanceToWin(c);
    }
    void gay(Player player){
        System.out.println("Are you openly gay? (Y/N) Apologies if you are offended by this question.");
        char g = keyboard.next().charAt(0); player.yesNo(g);
    }
    void strategy(Player player){
        System.out.println("I would go into Survivor with a strategy already laid out.");
        int s = agree(); player.setStrategy(s);
    }
    void goodShape(Player player){
        System.out.println("I like to keep myself in good physical shape.");
        int g = agree(); player.setGoodShape(g);
}
    void temper(Player player){
        System.out.println("I tend to lose my temper more often than most people.");
        int t = agree(); player.setTemper(t);
    }
    
//Female
    void frustratedUnique(Player player){
            System.out.println("I have trouble accepting my unique traits.");
            int f = agree(); player.setFrustratedUnique(f);
    }
    void nurturing(Player player){
        System.out.println("I like to play a nurturing role when I'm around adults younger than me.");
        int n = agree(); player.setNurturing(n);
    }
    void rough(Player player){
        System.out.println("People who know me well would describe me as being \"rough around the edges\".");
        int r = agree(); player.setRough(r);
    }
    void age55(Player player){
        System.out.println("Are you age 55 or older?");
        char a = keyboard.next().charAt(0); player.setAge55(a);
    }
    void flirty(Player player){
        System.out.println("I like to flirt with people to get what I want.");
        int f = agree(); player.setFlirty(f);
    }
    void optimistic(Player player){
        System.out.println("I generally have an optimistic view of the world.");
        int o = agree(); player.setOptimistic(o);
    }
    void grudges(Player player){
        System.out.println("I tend to hold grudges against people who have wronged me.");
        int g = agree(); player.setGrudges(g);
    }
    
    
//Get Answer
    int agreeCount = 0;
    int agree() {
        int answer;
        System.out.println("1 - Strongly Agree\n2 - Somewhat Agree\n3 - Disagree\nAnswer: ");
	answer = keyboard.nextInt(); 
        
        if ((answer < 1) || (answer > 3)){
            if (agreeCount > 3) { System.out.println("\nPLEASE pay attention!!"); agreeCount++; }
            if (agreeCount == 5) { System.out.println(" If you keep entering invalid answers the program will crash."); agreeCount++;}
            System.out.println("\nInvalid answer. Enter 1, 2 or 3.");
            agreeCount++; agree();}
        
        return answer;
    }
}
