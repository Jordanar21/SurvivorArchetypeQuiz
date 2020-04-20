public class Male {
 
    void male(Player player){
        
        Male18 m18 = new Male18();
        Male35 m35 = new Male35();
        Questions m = new Questions();
        GoodOldBoy gboy = new GoodOldBoy();
        Mafioso mafi = new Mafioso();
        
        m.accent(player);
        m.military(player);
        m.arrogant(player);
        m.intimidating(player);
	m.experience(player);
        m.opinions(player);
        if (player.getExperience() != 3) m.stories(player);      //to Stories if experience is 1 or 2
        if (player.getAge() == true) m.age50(player);
            
        if ((player.getAccent() == true) && (player.getFriendly() != 3) && (player.getWork() == 1)                  // Good Old Boy
                && (player.getArrogant() == 3) && (player.getStories() == 3)) //gboy.goodOldBoy(player);    
            {player.setName("The Good Old Boy"); return; }
        else if ((player.getDeceitful() == 1) && (player.getCharming() != 3) && (player.getInitiative() == 1)        // Mafioso
                && (player.getArrogant() == 1)) {player.setName("The Mafioso"); return; } //mafi.mafioso(player);                                                                                
                                                                                         
        else if (player.getAge() == true) m35.m35(player);                                                              // Older group
        else m18.m18(player);                                                                                           // Younger group
    }

}
