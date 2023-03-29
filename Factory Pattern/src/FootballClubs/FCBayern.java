package FootballClubs;

public class FCBayern implements Clubs{
    private int rating;

    FCBayern(int rating){
        this.rating = rating;
    }

    @Override
    public void printClubs() {
        System.out.println("FCBayern hat das Rating: "+ rating);
    }

}
