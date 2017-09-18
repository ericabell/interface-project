public class ExtraExtendSoldier implements ExtraNewInterface1, ExtraNewInterface2 {
    @Override
    public void identicalMethod() {
        System.out.println("Identical method implementation");
    }

    @Override
    public String returnsAStringMethod() {
        return "ExtraNewSoldier returns a String method";
    }

    @Override
    public Integer returnsAnInteger() {
        return 42;
    }
}
