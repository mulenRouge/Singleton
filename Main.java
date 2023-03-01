public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton var1 = Singleton.Inst("five fingers on the hand");
        Singleton var2 = Singleton.Inst("there can't be ten fingers on a hand");

        System.out.println(var1.value);
        System.out.println(var2.value);

        System.out.printf("That is why var1 == var 2 is %b", var1.equals(var2));
    }
}