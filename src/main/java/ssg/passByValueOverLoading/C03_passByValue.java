package ssg.passByValueOverLoading;

public class C03_passByValue {
    public static void main(String[] args) {
        int []b={1,2};
        sayiyiDegistir(b);
        System.out.println(b[0]);

    }

    private static void sayiyiDegistir(int[] a) {
        a[0]=5;
        System.out.println(a[0]);
    }
}

