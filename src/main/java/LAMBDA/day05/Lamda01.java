package LAMBDA.day05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda01 {
    public static void main(String[] args) {
        //bu classda objelerle lambda kullanacagız.obje olusturmak icin class olusturmak gerekir

        Courses turkishDay=new Courses("Turkish Day time QA",213,"Spring",97);
        Courses turkishNight=new Courses("Turkish Night time QA",245,"Winter",98);
        Courses englishDay=new Courses("Turkish Day time QA",121,"Spring",91);
        Courses englishNight=new Courses("Turkish Day time QA",137,"Winter",95);

        List<Courses> courseList =new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishNight);
        courseList.add(englishDay);


        System.out.println(isaverageGreaterThanANumber(courseList, 90));//true
        System.out.println(isAnyNameContainsQA(courseList, "QA"));
        System.out.println(getCourseNmeWhoseAvgScreMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighestThird(courseList));
    }
//example 1: Tujm avarge score ların 90 dan buyuk olup olmadıgını kontroleden metbhodu yazınız
    public static boolean isaverageGreaterThanANumber(List<Courses>coursesList, int avg){
      return   coursesList.
              stream().
              allMatch(t->t.getAverageScore()>avg);
    }

//example 2: en az bir kurs isminin QA icerip icermedigini kontrol eden metbhodu yazınız


    public static boolean isAnyNameContainsQA (List<Courses>coursesList, String Word){
        return coursesList.stream().anyMatch(t->t.getCouseNName().contains(Word));

    }

    //example 3: en yuksek avarege score a sahip kurs ismini veren metbhodu yazınız
    public static String getCourseNmeWhoseAvgScreMax(List<Courses>coursesList){
     Courses course =coursesList.
             stream().
             sorted(Comparator.comparing(Courses::getAverageScore).
                     reversed()).
             findFirst().get();
     return course.getCouseNName();
    }

    //example 4:  avarege score"u en dusuk olan return eden  metbhodu yazınız
    public static List<Courses> getCourseBetterThanLastTwo (List<Courses>coursesList){
        return  coursesList.
                stream().
                sorted(Comparator.comparing(Courses::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
    }
    //example 5:  avarege score"u usten ucuncu olan kursu return eden  metbhodu yazınız
    public static Courses getHighestThird (List<Courses>coursesList){
        return  coursesList.stream().
                sorted(Comparator.comparing(Courses::getAverageScore).
                        reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).get(0);
    }















}
