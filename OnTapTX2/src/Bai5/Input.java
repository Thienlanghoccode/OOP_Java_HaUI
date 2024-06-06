
package Bai5;

import java.util.Scanner;

public class Input {
    public void nhap() throws OutOfRangeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap So N: ");
        int n = Integer.parseInt(sc.nextLine());
        if(n < 5000000 || n > 20000000){
            throw new OutOfRangeException();
        }
    }
}
