public class Female35 {
    String name;
    void f35(Player player){
        
        Questions f35 = new Questions();
        CrazyCatLady crazy = new CrazyCatLady();
        MrsFixIt mfi = new MrsFixIt();
        TeamMom tm = new TeamMom();
        GoldenGranny golden = new GoldenGranny();
        IronWoman iw = new IronWoman();
        
        f35.rough(player);
                         
        if (player.getUnique() == 1) {player.setName("The Crazy Cat Lady"); return;}                   //Crazy Cat Lady
        if ((player.getWork() == 1) && (player.getRough() != 3) && ((player.getOutdoors() != 3) || (
                player.getLeadership() == 1))) {player.setName("Mrs. Fix-It"); return;}                //Mrs. Fix-It
        
        f35.nurturing(player);
        f35.age55(player);  
        if (player.getNurturing() != 3){
            if (player.getAge55() == true) {player.setName("The Golden Granny"); return;}              //Golden Granny
            else {player.setName("The Team Mom"); return;}                                             //Team Mom
        }
        else if ((player.getAthletic() == 1) && (player.getLeadership() == 1) && (player.getRough() != 3))          //The Crusader
            {player.setName("The Crusader"); return;}
        else {name = "The Iron Woman"; player.setName(name); return;}                                               //Iron Woman
    }
}
