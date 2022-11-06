import java.util.Scanner;

class New {
    int temp;
    float p, g;

    void meth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of p and g");
        g = scan.nextFloat();
        p = scan.nextFloat();
        System.out.println("before swap :");
        System.out.println("p = " + p + "\ng = " + g);
        temp = (int) p; // swap is done here
        p = g;
        g = temp;
        System.out.println("after swap :");
        System.out.println("p = " + p + "\ng = " + g);
        scan.close();
    }

    public static void main(String args[]) {
        New ob = new New();
        ob.meth();
    }
}
