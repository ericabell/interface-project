public class Marines extends Soldier implements Karate, KungFu {

    @Override
    public String speak() {
        return "oohrah";
    }

    @Override
    public String fight() {
        return "Fighting karate-style!";
    }

    @Override
    public Bomb throwingStar() {
        Bomb bomb1 = new Bomb();
        bomb1.bombString = "I am the bomb string!";
        return bomb1;
    }

    // here is where we are overriding the default method
    @Override
    public String read() {
        return "Now we are doing the Marine version of reading!";
    }
}
