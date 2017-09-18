public interface Karate {

    public String fight();

    // the default method example
    public default String read() {
        return "I'm doing the default method of reading.";
    }
}
