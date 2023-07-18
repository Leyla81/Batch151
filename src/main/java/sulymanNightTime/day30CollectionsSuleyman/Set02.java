package sulymanNightTime.day30CollectionsSuleyman;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {


        //example :Ogrenci e mail adreslerinin  natural order da sıralanmıs olarak depolayınız

        //1.yol mail herkesin kendisine ait tekrarsız oldugundan "set" kullanılmalı

        //1,yol
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);

        long t2 =System.nanoTime();

        //2yol
        HashSet<String> emailsHs = new HashSet<>();//hızlı calıstıgı icin bunu Hashset ile yaparız
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);//sıralamada kullanmak icin hashSet i tree set e ceviririz
        System.out.println(emailsHsTs);
         long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t2-t3);

    }



}
