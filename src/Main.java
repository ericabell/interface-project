public class Main {

    public static void main(String[] args) {
	// write your code here
        Navy navy1 = new Navy();
        Marines marine1 = new Marines();

        System.out.println(navy1.eat());
        System.out.println(navy1.sleep());
        System.out.println(navy1.walk());
        System.out.println(navy1.fight());

        System.out.println(marine1.throwingStar());

    }
}
