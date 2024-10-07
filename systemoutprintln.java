public class systemoutprintln {
    public static void main(String args[]) {
        int var1 = 1041;
        int var2 = 1051;
        int var3 = 10/3;
        int var4 = 10%3;
        double var5= 10.0/3.0;
        double var6 = 10.0%3.0;
        System.out.println("test " + var2);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF") ;
        System.out.println("\bG") ;

        String variable1="0";

        int conditionValue = 15;
        if (conditionValue < 10) {
            variable1 = "10";
        } else {
            variable1 = "20";
        }

        // Output the result
        System.out.println("The value of variable1 is: " + variable1);


    }
}
