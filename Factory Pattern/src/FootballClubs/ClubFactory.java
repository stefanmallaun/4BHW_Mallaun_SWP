package FootballClubs;

public class ClubFactory {

    public Clubs createClub(String Club, int Rating){
        if (Club == null){
            return null;
        }else if(Club.equalsIgnoreCase("FCBayern")){
            return new FCBayern(Rating);
        }
        return null;
    }

}
