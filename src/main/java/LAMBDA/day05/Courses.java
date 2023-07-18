package LAMBDA.day05;

public class Courses {

   private String couseNName;
   private  int numOfSyudents;
   private String seasons;
   private double averageScore;


    public Courses(String couseNName, int numOfSyudents, String seasons, double averageScore) {
        this.couseNName = couseNName;
        this.numOfSyudents = numOfSyudents;
        this.seasons = seasons;
        this.averageScore = averageScore;
    }

    public Courses() {

    }

    public String getCouseNName() {
        return couseNName;
    }

    public int getNumOfSyudents() {
        return numOfSyudents;
    }

    public String getSeasons() {
        return seasons;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCouseNName(String couseNName) {
        this.couseNName = couseNName;
    }

    public void setNumOfSyudents(int numOfSyudents) {
        this.numOfSyudents = numOfSyudents;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {//toString()    bulunan bilgillerin butun ozelliklerini gosterir
        return "Courses{" +
                "couseNName='" + couseNName + '\'' +
                ", numOfSyudents=" + numOfSyudents +
                ", seasons='" + seasons + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }


/*icinde
 1.  private variable
  2. parametreli parametresiz constuctorlar
  3.  getter
  4. setter
  5. toString()
  barındıran classlara POJO class dednir
  POJO: Plain Old Java Object*/







}
