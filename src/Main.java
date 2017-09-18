public class Main {

    public static void main(String[] args) {
	    // create instances of our two classes that extend Soldier
        Navy navy1 = new Navy();
        Marines marine1 = new Marines();

        // call some of the methods on those objects
        System.out.println(navy1.eat());
        System.out.println(navy1.sleep());
        System.out.println(navy1.walk());
        System.out.println(navy1.fight());
        System.out.println(marine1.speak());

        // this is my extended interface, where we get back the bomb object's string
        System.out.println(marine1.throwingStar());


        // call the default method that gets overriden in Marines
        System.out.println(marine1.read());
    }
}
