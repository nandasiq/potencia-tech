public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int n1 = 5;
        int n2 = 2;
        double f1 = 1.5;
        double f2 = 8.5;
      
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));
        System.out.println("b2 || b3: " + (b1 || b2));
        System.out.println("b2 || b4: " + (b2 || b4));
        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b1 ^ b4: " + (b4 ^ b1));
        System.out.println("!b1: " + (!b1));
        System.out.println("!b2: " + (!b2));
        System.out.println("n2 > n2 || f2 < f1 " + ((n1 > n2) || (f1 < f2)));
        System.out.println("n1 + n2 < f1 - f2 && true " + ( (n1 + n2) < (f1 - f2) && true));
    
    }    
}
