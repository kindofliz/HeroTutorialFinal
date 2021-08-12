import java.util.ArrayList;

public class Villain extends Person {

    //Attributes/Properties
    private int villainID;
    private String villainName;
    private String villainCity;
    private String universe;
    private double villainSalary;
    private int crimeTime;


    //NO ARGUMENT CONSTRUCTOR
    public Villain() {
    }


    //ARGUMENT CONSTRUCTOR
    public Villain(String name, String surname, int villainID, String villainName, String villainCity, String universe, double villainSalary, int crimeTime) {
        this.name = name;
        this.surname = surname;
        this.villainID = villainID;
        this.villainName = villainName;
        this.villainCity = villainCity;
        this.universe = universe;
        this.villainSalary = villainSalary;
        this.crimeTime = crimeTime;
    }

    //CUSTOM METHODS
    public int totalCrimes() {
        int avgOneCrimeTime = 23; //average crime takes 23 minutes to commit
        return Math.round(crimeTime/avgOneCrimeTime);
    }

    //toString method


    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", villainID=" + villainID +
                ", villainName='" + villainName + '\'' +
                ", villainCity='" + villainCity + '\'' +
                ", universe='" + universe + '\'' +
                ", villainSalary=" + villainSalary +
                ", crimeTime=" + crimeTime +
                '}';
    }

    //GETTERS AND SETTERS
    public int getVillainID() {
        return villainID;
    }

    public void setVillainID(int villainID) {
        this.villainID = villainID;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public String getVillainCity() {
        return villainCity;
    }

    public void setVillainCity(String villainCity) {
        this.villainCity = villainCity;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public double getVillainSalary() {
        return villainSalary;
    }

    public void setVillainSalary(double villainSalary) {
        this.villainSalary = villainSalary;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }
}
