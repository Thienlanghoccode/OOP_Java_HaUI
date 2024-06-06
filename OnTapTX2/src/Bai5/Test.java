package Bai5;


public class Test {

    public static void main(String[] args) {
        Input in = new Input();
        do {
            try {
                in.nhap();
                break;
            } catch (OutOfRangeException ex) {
                System.out.println(ex.getMessage());
            }
        } while(true);
    }
}
