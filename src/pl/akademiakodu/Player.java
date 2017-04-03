package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 29.03.2017.
 */
public class Player {

    public int score;
    public String name;
    private String lastname;

    public Player(int score, String name, String lastname) {
        this.score = score;
        this.name = name;
        this.lastname = lastname;
    }

    public String getName(){
        return name;
    }

    private int getScore(){
        return score;
    }

    public void printScore() {
        System.out.println("Punkty to: " + score);
    }


}
