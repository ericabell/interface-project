public class Navy extends Soldier implements HandToHandCombat {

    @Override
    public String speak() {
        return "Hooyah";
    }

    @Override
    public String fight() {
        return "Fighting hand-to-hand";
    }
}
