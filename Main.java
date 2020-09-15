package Abstract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Abstract.Book new_novel=new Abstract.Book(); This line prHMain.java:25: error: Abstract.Book is abstract; cannot be instantiated
        System.out.println("Escreva um título");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("O título é: " + new_novel.getTitle());
        sc.close();

    }
}
