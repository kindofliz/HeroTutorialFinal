public class Hero extends Person {

    //Attributes/Properties
    private int heroID;
    private String heroName;
    private String heroCity;
    private String universe;
    private double heroSalary;
    private int deedTime;


    //no-argument constructor
    public Hero() {
    }


    //argument constructor
    public Hero(String inputName, String inputSurname, int inputHeroId, String inputHeroName, String inputHeroCity, String inputUniverse, double inputHeroSalary, int inputDeedTime) {
        this.name = inputName;
        this.surname = inputSurname;
        this.heroID = inputHeroId;
        this.heroName = inputHeroName;
        this.heroCity = inputHeroCity;
        this.universe = inputUniverse;
        this.heroSalary = inputHeroSalary;
        this.deedTime = inputDeedTime;

    }

    //toString() is the method where information about the object values are returned as String value.
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", heroID=" + heroID +
                ", heroName='" + heroName + '\'' +
                ", heroCity='" + heroCity + '\'' +
                ", universe='" + universe + '\'' +
                ", heroSalary=" + heroSalary +
                ", deedTime=" + deedTime +
                '}';
    }

    //calculatedLevel() is the method where hero level is calculated:
    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if ((deedTime >= 20) && (deedTime < 40)) {
            return 2;
        } else if (deedTime >= 40){
            return 3;
        } else {
            return 0;
        }
    }



    //add get and set methods to the class
    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroCity() {
        return heroCity;
    }

    public void setHeroCity(String heroCity) {
        this.heroCity = heroCity;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public double getHeroSalary() {
        return heroSalary;
    }

    public void setHeroSalary(double heroSalary) {
        this.heroSalary = heroSalary;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }



}