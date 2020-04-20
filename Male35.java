public class Male35 {

    void m35(Player player) {
         
        NoArchetype nom35 = new NoArchetype();
        Male18 m18 = new Male18();
        Hulk hul = new Hulk();
        Curmudgeon curm = new Curmudgeon();
        DonQuijote donq = new DonQuijote();
        FamilyMan famy = new FamilyMan();
        Puppeteer pupp = new Puppeteer();
        SeasonedVeteran svet = new SeasonedVeteran();
        WiseGuy wguy = new WiseGuy();
        
        Questions m35 = new Questions();
        
                
        
        if ((player.getIntimidating() == 1) && (player.getAthletic() != 3) && (player.getFriendly() != 1))          // Hulk
            {player.setName("The Hulk"); return; }                                                                  //hul.hulk(player);
        else if ((player.getOpinions() == 1) && (player.getArrogant() == 1)) //curm.curmudgeon(player);             // Curmudgeon
            {player.setName("The Curmudgeon"); return; }
        else if ((player.getArrogant() != 3) && (player.getFriendly() != 1) && (player.getStories() == 1) &&        // Don Quijote
                (player.getSmart() != 1)) {player.setName("Don Quijote"); return; }//donq.donQuijote(player);
        else if ((player.getFriendly() != 3) && (player.getChildren() == true) && (player.getAthletic() != 3)       // Family Man
                && (player.getLeadership() == 1) && (player.getMarried() == true)) {player.setName("The Family Man"); return; }
            //famy.familyMan(player);
        else if ((player.getDeceitful() == 1) && (player.getSmart() != 3) && (player.getStories() != 3) &&          // Puppeteer
                (player.getInitiative() != 3)) {player.setName("The Puppeteer"); return; }//pupp.puppeteer(player);
        else if  ((player.getMilitary() == true) && (player.getWork() == 1) && (player.getAge50() == true) &&        // Seasoned Veteran
                (player.getOutdoors() != 3))   {player.setName("The Seasoned Veteran"); return; }//svet.seasonedVeteran(player); 
        else if ((player.getSmart() != 3) && (player.getExperience() != 3) && (player.getFriendly() != 3))          // Wise Guy
                {player.setName("The Wise Guy"); return; }//wguy.wiseGuy(player);                                    
        
        else if (player.getAge() == true) m18.m18(player); 
        
        else nom35.noArchetype(player);
        
    }
}
