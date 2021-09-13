package homework;

//Implementation of Driver class

public class Driver {

    //Implementation of main function

    public static void main(String[] args) {

        //Create an object classranQueObject for RandomQueue class

        RandomQueue<Integer> ranQueObject = new RandomQueue<Integer>();

        //call add function

        ranQueObject.add(745);

        //call add function

        ranQueObject.add(578);

        //call add function

        ranQueObject.add(236);

        //Display statement

        System.out.println("Elements in the Queue after add ");

        System.out.println(ranQueObject);

        //Iterate loop

        while (!ranQueObject.isEmpty()) {

            //Display statement

            System.out.println(ranQueObject.remove() + " is removed");

        }

        //Display statement

        System.out.println("Elements in the Queue after remove ");

        //Display statement

        System.out.println(ranQueObject);

        System.out.println();

        //Create an object classranQueObject for RandomQueue class

        RandomQueue<Double> ranQuefloatObject = new RandomQueue<Double>();

        //call add function

        ranQuefloatObject.add(74.32);

        //call add function

        ranQuefloatObject.add(58.34);

        //call add function

        ranQuefloatObject.add(32.43);

        //Display statement

        System.out.println("Elements in the Queue after add ");

        //Display statement

        System.out.println(ranQuefloatObject);



        //Iterate loop

        while (!ranQuefloatObject.isEmpty()) {

            //Display statement

            System.out.println(ranQuefloatObject.remove() + " is removed");

        }

        //Display statement

        System.out.println("Elements in the Queue after remove ");

        //Display statement

        System.out.println(ranQuefloatObject);

    }

}