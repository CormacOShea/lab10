package labsheet6.exercise4;

//TestAnimal.java
/*A driver (test) class that contains the main() method for
testing the functionality of the Animal class*/




public class TestAnimal {
    public static void main( String args[]) {

        Animal allAnimals[] = new Animal[10];

        System.out.println("testing the no-argument constructor....");
        Animal animal1 = new Animal(); //tests no-arg constructor
        System.out.println(animal1); //tests toString() and the accessor methods
        String lionContinents[] = {"Africa","Asia"}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\n\n\ntesting the 4-argument constructor....");
        Animal animal2 = new Animal("Lion",lionContinents,200,40);
        //System.out.println(animal1);

        System.out.println("\nCalling the 4-argument constructor to create a rat object.....");
        Animal animal3 = new Animal("Rat", new String[]{"Europe","America","Africa","Asia"},0.2,5);

        System.out.println("\nCalling the 4-argument constructor to create a polar bear object....");
        Animal animal4 = new Animal("Polar Bear",new String[]{"Antartica"},450,15);

        System.out.println("\nCalling the 4-argument constructor to create an Anaconda object....");
        Animal animal5 = new Animal("Anaconda", new String[]{"Asia","America"},100,8);


        allAnimals[0] = animal1;
        allAnimals[1] = animal2;
        allAnimals[2] = animal3;
        allAnimals[3] = animal4;
        allAnimals[4] = animal5;

        allAnimals[0].setType("Gorilla");
        allAnimals[0].setWeight(250);

        System.out.println("\n\nThe details of all animals in the Animal array are:\n\n");

        for(int i=0;i < allAnimals.length;i++)
            if(allAnimals[i]!=null)
            System.out.println(allAnimals[i] + "\n\n");

       // lionContinents[0] = "Europe";
        //System.out.println("\n" + animal1);


    }
}

