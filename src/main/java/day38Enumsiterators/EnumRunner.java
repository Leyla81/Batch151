package day38Enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {


        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStatesEnum state = UsStatesEnum.ALASKA;//enum"daki datayı "get()" metodu olmadan kullanırsak data type ı "Enum" olmalidır
        System.out.println(state); //yukarıdakiler get() metodu ile alınmıstı oyuzden String yaptık

        String stateName = UsStatesEnum.getStatesNameByUsingAbbreavation("AK");
        System.out.println(stateName);//abbreviation ı vererek state ı alma.

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);


    }
}