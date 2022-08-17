package Rahul;

public class Swap {
    public static void main(String[] args) {
      swap();// method declaration for swap the value

    }
    static int swap()
    {

        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        return 0;
    }
}
