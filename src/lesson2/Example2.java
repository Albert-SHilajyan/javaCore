package lesson2;

public class Example2 {

    public static void main(String[] args) {

        int a, a2;

        a = 5;

        a2 = a;

        System.out.println("a=" + a);

        a = a * 2;

        System.out.println("a=" + a);


        if (a >= a2) {
            System.out.println("a մեծ է կամ հավասար է a2-ից ");
        } else {
            System.out.println("a-ն փոքր է a2-ից");
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("kuku" + i);

        }
    }
}
