public class NationalForest {
   //new code 3: change public - private
    private String name;
    private String location;
    private int acres;
    //public String name;
    //public String location;
    //public int acres;

    //new code3: getters and setters
    public String getName() {

        return name;
    }
    public String getLocation() {

        return location;
    }
    public int getAcres() {

        return acres;
    }
    public void setAcres(int acres) {
        if (acres > 0) {
            this.acres = acres;
        }
    }

/*
    //new code1
    public NationalForest() {
        this("Unknown","Unknown", -1);
    }
    //new code1
    public NationalForest(String name) {
        this(name, "Unknown", -1);
    }
    //new code1
    public NationalForest(String name, int acres) {
        this(name, "Unknown", acres);
    }
 */
    //new code2
    public int getSquareKilometers() {
        return (int) (this.acres / 247.1);
    }
    //new code 2: convert this national forest to a string in line format
    public String toLine() {
        return String.format("name: %s, location: %s, acres: %s, km^2: %s",
                name, location, acres,
                    getSquareKilometers());
    }
    //New code: constructor
        public NationalForest(String name, String location, int acres) {
        this.name = name;
        this.location = location;
        this.acres = acres;

    }
}