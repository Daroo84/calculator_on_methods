public class mainClass {

    public static void main(String[] args) {
        calculator c1 = new calculator();
        calculator c2 = new calculator();

        c1.name = "Awesome ";
        c2.name = "Calculator 2 ";

        System.out.println(c1.name + "calculated " + c1.add(3,5));
        System.out.println(c2.name + "calculated " + c2.modulus(10,5));
    }

}
