public abstract class Soldier {
    String name;
    String rank;
    Integer serialNumber;

    public String sleep() {
        return( "Snore" );
    }

    public String eat() {
        return( "Chew" );
    }

    public String walk() {
        return( "Trudge" );
    }

    public abstract String speak();
}
