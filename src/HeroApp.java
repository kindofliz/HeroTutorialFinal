import java.util.ArrayList;
import java.util.Scanner;

public class HeroApp {
    public static void main(String[] args) {

        //Adding Districts and Persons (heroes and villains)
        Hero dogoMom = new Hero("Liza", "Simanovica", 101, "DogoMom", 5327, 115);
        Hero superCat = new Hero("Aiva", "Ciekurs", 202, "SuperCat", 2335, 55);
        Hero peopleWhisperer = new Hero("Laura", "Vadone", 303, "PeopleWhisperer", 6000, 120);
        Hero toolMan = new Hero("Cooper", "Orion", 404, "ToolMan", 599, 25);
        Hero mrForest = new Hero("Leonard", "Pine", 505, "MrForest", 755.99, 36);
        Hero rain = new Hero("Ezra", "Terrier", 606, "RAIN", 785.36, 12);
        Hero thunderWoman = new Hero("Karina", "Baiga", 707, "ThunderWoman", 4002.15, 19);

        //ADDING AN ARRAYLIST TO STORE SUPERHERO NAMES (heroList)
        ArrayList<String> superHeroes = new ArrayList<>();
        superHeroes.add(dogoMom.getHeroName());
        superHeroes.add(superCat.getHeroName());
        superHeroes.add(peopleWhisperer.getHeroName());
        superHeroes.add(toolMan.getHeroName());
        superHeroes.add(mrForest.getHeroName());
        superHeroes.add(rain.getHeroName());
        superHeroes.add(thunderWoman.getHeroName());

        Villain drBad = new Villain("David", "Winters", 999, "DrBad", 3512.99, 39);
        Villain ladyWrath = new Villain("Karen", "Typical", 888, "LadyWrath", 4987, 90);
        Villain landShark = new Villain("Staffie", "English", 777, "LandShark", 233, 11);
        Villain drBat = new Villain("Bob", "Butters", 666, "DrBat", 575.39, 18);
        Villain mrMeow = new Villain("Smelly", "Cat", 555, "MrMeow", 1999, 41);


        District district12 = new District("District 12", "DellCity", 12);
        District district1 = new District("District 1", "Capitol", 1);
        District district16 = new District("District 16", "AshCity", 16);

        //Adding persons to districts
        district12.addNewPerson(dogoMom);
        district12.addNewPerson(superCat);
        district12.addNewPerson(drBad);
        district12.addNewPerson(drBat);

        district1.addNewPerson(peopleWhisperer);
        district1.addNewPerson(toolMan);
        district1.addNewPerson(ladyWrath);

        district16.addNewPerson(mrForest);
        district16.addNewPerson(rain);
        district16.addNewPerson(thunderWoman);
        district16.addNewPerson(landShark);
        district16.addNewPerson(mrMeow);

        //Creating an arraylist of all districts
        ArrayList<District> allDistricts = new ArrayList<>();
        allDistricts.add(district1);
        allDistricts.add(district12);
        allDistricts.add(district16);


        // MENU
        // -- I would like to see a MENU to select different parts of superhero information card
        // 1. A list of superheroes
        // 2. Add new superhero
        // 3. show specific superhero information
        // 4. Delete the superhero from the list
        // 0. Exit


        int menuEntry;
        Scanner scannerTwo = new Scanner(System.in);

        do {
            //EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do: ");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero!");
            System.out.println("0 - Exit");
            menuEntry = scannerTwo.nextInt();

            switch (menuEntry) {
                case 1:
                    System.out.println("================= SUPERHERO LIST ================");
                    //printing a list of all existing superheroes using methods
//                    for (int i = 0; i < allDistricts.size(); i++) {
//                        District district = allDistricts.get(i);
//                    for (String s : district.districtHeroList()) {
//                        System.out.println(s);
//                      }

                    //show hero names from arraylist above
                    for (int i = 0; i < superHeroes.size(); i++) {
                        String name = superHeroes.get(i);
                        System.out.println(i + "| " + name);
                    }
                    System.out.println("================= SUPERHERO LIST ================");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the hero's name you'd like to add: ");
                    String newHeroName = scannerTwo.next();
                    superHeroes.add(newHeroName);
                    break;
                case 3:
                    //Using if or switch functions show specific hero information
                    System.out.println("Which superhero info to print? Enter an index from the list! ");
                    int superHeroIndex = scannerTwo.nextInt();

                    switch (superHeroIndex) {
                        case 0:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(dogoMom);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(dogoMom)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + dogoMom.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 1:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(superCat);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(superCat)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + superCat.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(peopleWhisperer);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(peopleWhisperer)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + peopleWhisperer.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(toolMan);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(toolMan)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + toolMan.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(mrForest);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(mrForest)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + mrForest.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 5:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(rain);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(rain)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + rain.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        case 6:
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println(thunderWoman);
                            System.out.println("+++");
                            for (int i = 0; i < allDistricts.size(); i++) {
                                District district = allDistricts.get(i);
                                if (district.personInTheDistrict.contains(thunderWoman)) {
                                    System.out.println("THIS IS A LEVEL " + "|" + thunderWoman.calculatedLevel() + "|" + " HERO!");
                                    System.out.println("THIS HERO LIVES IN: " + district.getTitle());
                                    System.out.println("CITY: " + district.getCity());
                                    System.out.println("THE AVERAGE LEVEL OF " + district.getTitle() + " IS: " + district.calculateAvgLevelInDistrict());
                                    System.out.println(district.getTitle() + " IS HOME TO " + "|" + (district.personInTheDistrict.size() - 1) + "|" + " OTHER HEROES.");

                                }
                            }
                            System.out.println("+++");
                            System.out.println("=================================================================  SUPERHERO INFO ================================================================ ");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Something went wrong. Try again!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Please enter the name of hero you want to delete: ");

                    String heroToDelete = scannerTwo.next();
                    superHeroes.remove(heroToDelete);

                    for (String hero : superHeroes) {
                        System.out.println(hero);
                    }
                    System.out.println();
                    break;
            }

        } while (menuEntry != 0);


    }
}
