public class Musician {

    private String name;
    private final int rating;


    public void setName(String name) {
        this.name = name;
    }


    /**
     * @param name   The name of the musician.
     * @param rating A number representing how much a musician is loved relative to other musicians.
     */
    public Musician(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {

        return name;
    }
    public int getRating() {
        return rating;}



}

