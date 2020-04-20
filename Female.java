public class Female {
    void female(Player player){
        Questions f = new Questions();
        Female18 f18 = new Female18();
        Female35 f35 = new Female35();
        
        f.unique(player);
        
        if (player.getAge() == true) f35.f35(player);
        else f18.f18(player);        
    }
}

/*
*void f35();
*Mrs. Fix-It: (Strong work ethic) street smarts, outdoorsy, rough around the edges, mentally tough
*The Crazy Cat Lady: Unique, quirky, crazy, eccentric
*The Golden Granny: Grandmother figure, much older than rest of the tribe
*The Iron Woman: Professionalism, pro-fenimism, not nurturing
*The Team Mom: Motherly role
*/

