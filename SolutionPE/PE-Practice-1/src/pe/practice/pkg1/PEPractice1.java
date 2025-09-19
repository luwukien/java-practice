package pe.practice.pkg1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PEPractice1 {

    public static void main(String[] args) {

        try {
            String str = "10 dit me may 0";
            Scanner sc = new Scanner(str);
            System.out.println("Moi ban nhap");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x + "/" + y + "=" + ((float)x/(float)y));
            System.out.println("Successfull!");
        } catch (InputMismatchException e) {
            System.out.println("Loi du lieu nhap vao kh hop le");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Co loi xay ra");
            System.out.println(e);
        }
        
        System.out.println("Lenh sau try..catch");
    }

}
