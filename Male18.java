public class Male18 {
    void m18(Player player){
        
        String name;
        Questions m18 = new Questions();  
        Male35 maleOlder = new Male35();
       
        m18.confidence(player);
        m18.chanceToWin(player);
        m18.temper(player);
        
        NervousNerd nerv = new NervousNerd();
        Trickster tric = new Trickster();
        Poseur po = new Poseur();
        KnowItAll know = new KnowItAll();
        SnarkySneak sna = new SnarkySneak();
        Mentalist men = new Mentalist();
        ConMan cm = new ConMan();
                        
        if ((player.getSmart() == 1) && (player.getInitiative() != 3) && (player.getTemper() != 3)){
            if (player.getConfidence() == 3) {player.setName("The Nervous Nerd"); return; }//nerv.nervousNerd(player);                                              //Nervous Nerd                                                      
            else if ((player.getChanceToWin() == 1) && (player.getArrogant() == 1))
                {player.setName("The Poseur"); return; }//po.poseur(player);              //Poseur
            else if ((player.getCharming() == 1) && (player.getDeceitful() == 1)) // cm.conMan(player);               //Con Man
                    {player.setName("The Con Man"); return; }
            else {  m18.strategy(player);
                    if (player.getAge() == false) m18.age30(player);
                    else if ((player.getAge30() == true) && (player.getStrategy() == 1)) //know.knowItAll(player);         //Know It All   
                        {player.setName("The Know-It-All"); return; }
                    else m18.gay(player);
                    if (player.getGay() == true) {player.setName("The Snarky Sneak"); return; }//sna.snarkySneak(player);                                           //Snarky Sneak
                    else m18.playDumb(player); 
                    if (player.getPlayDumb() != 1) {player.setName("The Mentalist"); return; }//men.mentalist(player);                                           //Mentalist 
                    else {name = "The Trickster"; player.setName(name); return; }//tric.trickster(player);                                                                    //Trickster
            }                                                                                                      
        } 
//Smart != 1 && Initiative 1 or 2          
        
        NoArchetype nom18 = new NoArchetype();
               
        WackyWildcard wwc = new WackyWildcard();
        MrNiceGuy nice = new MrNiceGuy();
        CaptainAmerica ca = new CaptainAmerica();
        Freelancer freel = new Freelancer();
        AmazingAce ace = new AmazingAce();
        
            if ((player.getInitiative() == 1) && (player.getExperience() != 3) && (player.getArrogant() != 3)      //Wacky Wildcard
                    && (player.getTemper() != 3)) {player.setName("The Wacky Wildcard"); return; }//wwc.wackyWildcard(player);
            m18.beauty(player);
            if (player.getBeauty() != 3){
                if (player.getAthletic() == 1){                                                                                     
                       if (player.getExperience() == 1) //ca.captainAmerica(player);                                 //Captain America
                       {player.setName("Captain America"); return; }
                       else //ace.amazingAce(player);                                                                //Amazing Ace
                       {player.setName("The Amazing Ace"); return; }
                    }
                else {player.setName("The Freelancer"); return; }//freel.freelancer(player);                                                                     //Freelancer
            }            
            else if (player.getFriendly() != 3) {player.setName("Mr. Nice Guy"); return; }//nice.mrNiceGuy(player);                                            //Mr.NiceGuy
            
            else if (player.getAge() == false) maleOlder.m35(player);
            
            else nom18.noArchetype(player);    
    }
}
