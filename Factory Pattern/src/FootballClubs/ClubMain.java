package FootballClubs;

public class ClubMain {
    public static void main(String[] args) {



    ClubFactory CF = new ClubFactory();

    Clubs c1 = CF.createClub("FCBayern", 5);
    c1.printClubs();

    }
}
