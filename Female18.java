public class Female18 {
    
    void f18(Player player){
        
        Questions f18 = new Questions();
        f18.frustratedUnique(player);
        f18.flirty(player);
        f18.optimistic(player);
        f18.opinions(player);
        if (player.getFriendly() == 3) f18.grudges(player);
        
        if (player.getGrudges() == 1) {player.setName("The Fiesty Firecracker"); return;}                                         //Fiesty Firecracker
        else if ((player.getUnique() == 1) && ((player.getFrustratedUnique() == 3) || ((player.getFrustratedUnique() == 2) &&     //Free Spirit
                (player.getOptimistic() == 1)))) {player.setName("The Free Spirit"); return;}                                   
        else if ((player.getOpinions() != 3) && (player.getAthletic() != 3) && (player.getLeadership() == 1))                     //The Crusader
                {player.setName("The Crusader"); return;}
        else if ((player.getAthletic() == 1) || (player.getOutdoors() == 1))                                                      //Sporty Chick
                {player.setName("The Sporty Chick"); return;}                                                                     
        else if ((player.getBeauty() == 1) && (player.getCharming() == 1) && (player.getFlirty() == 3))                           //Beauty Queen
                {player.setName("The Beauty Queen"); return;}                                                                   
        else if ((player.getFlirty() == 1) && (player.getBeauty() != 3) && (player.getMarried() == false))                        //Femme Fatale
                {player.setName("The Femme Fatale"); return;}
        else if ((player.getSmart() == 1) && (player.getUnique() != 1) && (player.getInitiative() != 3))                          //Perfectionist
                {player.setName("The Perfectionist"); return;}                                                                                          
        else if ((player.getOptimistic() == 1) && (player.getFriendly() != 3))
        {   if  ((player.getFriendly() == 1) && (player.getInitiative() != 3)){player.setName("The Social Butterfly"); return;}   //Social Butterfly
            else {player.setName("The Ingenue"); return;}                                                                         //Ingenue
        }
        else {player.setName("The Quirky Oddball"); return;}                                                                      //Quirky Oddball
       
    }
}

/*else 

*The Quirky Oddball: Distinct from tribemates but doesn't own it, (settles for being alone or with misfits)

*The Crusader: Strong-willed, opinionated, (good in challenges), leadership role
*The Ingenue: Young naive sweetheart, optimistic, sometimes religious or family values
*The Social Butterfly: Energetic, extroverted, (makes friends easily), positive outlook
*The Fiesty Firecracker: Too hot to handle, intimidating socially, emotionally unpredictable
*The Perfectionist: (Logical, over-acheiver, keeps track of scenarios) gives 100%
*The Fiesty Firecracker: Too hot to handle, intimidating socially, emotionally unpredictable
*The Femme Fatale: Flirty, (beautiful), disarms competitors, single
*The Beauty Queen: (Beautiful, charming) not flirty, model/dancer/cheerleader, uses beauty in real life
*The Sporty Chick: (Tomboy, sports or outdoorsy, gives full effort in challenges)
*The Free Spirit: Different from rest of the group, owns it
*/