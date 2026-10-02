package Homework1;

public class IfSampie {
    public static void main(String[] args) {
        int x, y;
        x = 1;
        y = 5;
        if(x < y);{
            System.out.println("x < y");
            x =x * 5;
            if(x == y);{
                System.out.println("x == y");
                x = x * 5;
                if(x > y);{
                    System.out.println("x>y");

                }
            }
        }
    }
}
