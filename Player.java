import java.util.Scanner;
public class Player {
    private boolean gender, age, accent, married, children, superfan, answer, military, age50, gay, age30, age55;
    private int friendly, athletic, deceitful, beauty, smart, confidence, intimidating, work, leadership, experience, stories,
            arrogant, initiative, charming, opinions, outdoors, playDumb, chanceToWin, strategy, goodShape, temper,
            unique, count, frustratedUnique, flirty, rough, nurturing, optimistic, grudges;
    private String nameOfPlayer;
    
    public Player(){
            gender = true; age = true; accent = true; married = true; children = true; superfan = true; answer = true; military = true;
                age50 = true; gay = false; age30 = false; age55 = true;
            friendly = 2; athletic = 2; deceitful = 2; beauty = 2; smart = 2; confidence = 2; work = 2; intimidating = 2;
                leadership = 2; experience = 2; stories = 2; arrogant = 2; initiative = 2; charming = 2; opinions = 2; outdoors = 2;
                playDumb = 2; chanceToWin= 2; strategy = 2; goodShape = 2; temper = 2; unique = 2; count = 0; frustratedUnique = 2;
                flirty = 2; rough = 2; nurturing = 2; optimistic = 2; grudges = 2;
            nameOfPlayer = " ";
	}
    Scanner keyboard = new Scanner(System.in);
    
    //general
	void setGender(char b) {
            if ((b == 'M') || (b == 'm')) gender = true;
            else if ((b == 'F') || (b == 'f')) gender = false;
            else {System.out.println("Invalid answer. Enter M or F.\n" +
                "Note: This program will not work if you do not identify as either gender, \n"
                    + "since the archetypes are gender-specific.");
                char a = keyboard.next().charAt(0); setGender(a);}}
	boolean getGender() { return gender; }

	void setAge(char b) { age = yesNo(b); }
	boolean getAge() { return age; }

	void setFriendly(int x) { friendly = x; }
	int getFriendly() { return friendly; }

	void setAthletic(int x) { athletic = x; }
	int getAthletic() { return athletic; }

	void setDeceitful(int x) { deceitful = x; }
	int getDeceitful() { return deceitful; }

	void setBeauty(int x) { beauty = x; }
	int getBeauty() { return beauty; }

	void setSmart(int x) { smart = x; }
	int getSmart() { return smart; }

	void setConfidence(int x) { confidence = x; }
	int getConfidence() { return confidence; }

	void setWork(int x) { work = x; }
	int getWork() { return work; }

	void setIntimidating(int x) { intimidating = x; }
	int getIntimidating() { return intimidating; }

	void setLeadership(int x) { leadership = x; }
	int getLeadership() { return leadership; }
        
        void setOutdoors(int x) {outdoors = x;}
        int getOutdoors() {return outdoors;}

	void setMarried(char b) { married = yesNo(b); }
	boolean getMarried() { return married; }

	void setChildren(char b) { children = yesNo(b); }
	boolean getChildren() { return children; }
        
        void setStories(int x) { stories = x; }
	int getStories() { return stories; }
        
        void setCharming(int x) { charming = x; }
        int getCharming() {return charming;}
        
        void setInitiative(int x) {initiative = x;}
        int getInitiative() { return initiative; }
        
        void setAge50(char b) { age50 = yesNo(b); }
        boolean getAge50() {return age50;} 
        
       
	void setAccent(char b) { accent = yesNo(b); }
	boolean getAccent() { return accent; }

	void setExperience(int x) { experience = x; }
	int getExperience() { return experience; }
        
        void setMilitary(char b) {military = yesNo(b);}
        boolean getMilitary(){return military;}
        
        void setArrogant(int x) {arrogant = x;}
        int getArrogant() {return arrogant;}
        
        void setOpinions(int x) {opinions = x; }
        int getOpinions() { return opinions;}
        
        void setAge30(char b) {age30 = yesNo(b);}
        boolean getAge30() {return age30;}
        
        void setPlayDumb(int x) {playDumb = x;}
        int getPlayDumb() {return playDumb;}
        
        void setChanceToWin(int x) {chanceToWin = x;}
        int getChanceToWin() {return chanceToWin;}
        
        void setStrategy(int x) { strategy = x;}
        int getStrategy() {return strategy;}
        
        void setGay(char b) {gay = yesNo(b);}
        boolean getGay()  {return gay;}
        
        void setGoodShape(int x) { goodShape = x;}
        int getGoodShape() {return goodShape;}
        
        void setTemper(int x) {temper = x;}
        int getTemper() {return temper;}
        
        void setNurturing (int x) { nurturing = x;}
        int getNurturing () {return nurturing;}
        
        void setRough(int x) {rough = x;}
        int getRough() {return rough;}
        
        void setAge55(char b) {age55 = yesNo(b);}
        boolean getAge55() {return age55;}
        
//Female        
        void setUnique(int x) {unique = x;}
        int getUnique() {return unique;}
        
        void setFrustratedUnique(int x) { frustratedUnique = x;}
        int getFrustratedUnique() { return frustratedUnique;}
        
        void setFlirty(int x) { flirty = x;}
        int getFlirty() {return flirty;}    
        
        void setOptimistic(int x) {optimistic = x; }
        int getOptimistic() {return optimistic;}
        
        void setGrudges(int x) {grudges = x; }
        int getGrudges() {return grudges;}
    
    //Name of player
	void setName(String name) { nameOfPlayer = name; }
        String getName() { return nameOfPlayer; }
        
        
        
        boolean yesNo(char b) {
                boolean answer = true;
		if ((b == 'Y') || (b == 'y')) answer = true;
		else if ((b == 'N') || (b == 'n')) answer = false;
                else if (count >= 3) System.out.println("It's not that hard... it's a yes or no question!! ");
                else {System.out.println("Invalid answer. Enter Y or N. ");
                       char a = keyboard.next().charAt(0); count++; yesNo(a);}
                return answer;
	}
    
    
}
