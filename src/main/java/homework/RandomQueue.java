package homework;

import java.util.Collection;
import java.util.Iterator;


//RandomQueue.java

//Implementation of RandomQueue class

public class RandomQueue < Typ > implements Queue < Typ > {

    //Declare qObject as type of <T>

    private Typ[] qObject;

//Declare total as type of integer

    private int total;

//Declare SIZE as final integer

    private static final int SIZE = 80;

//Implementation of default constructor

    public RandomQueue() {

        //initialize qObject

        qObject = (Typ[]) new Object[SIZE];

        //initialize total with 0

        total = 0;

    }

//Implementation of add function

    public void add(Typ element) {

        //check total is equal to qObject.length

        if (total == qObject.length) {

            //Declare temporary as type of T and initialize it

            Typ temporay[] = (Typ[]) new Object[total * 2];

            //call arraycopy function

            System.arraycopy(qObject, 0, temporay, 0, total);

            //assign temporay to qObject

            qObject = temporay;

        }

        //assign element to qObject[total]

        qObject[total] = element;

        //increment total by 1

        total = total + 1;

    }

//Implementation of remove function

    public Typ remove() {

        if (!isEmpty()) {

            // Declare randomIndexValue as type of integer

            int randomIndexValue;

            //Initilaize randomIndexValue

            randomIndexValue= (int)(Math.random() * total);

            //Declare element as type of T

            Typ element = qObject[randomIndexValue];

            //assign qObject[total-1] to qObject[randomIndexValue]

            qObject[randomIndexValue] = qObject[total - 1];

            //Decrement total by 1

            total = total - 1;

            //return element

            return element;

        }

        //return null

        return null;

    }

//Implementation of isEmpty function

    public boolean isEmpty() {

        //return

        return total == 0;

    }

//Implementation of toString function

    public String toString() {

        //Declare output as type of string

        //and assign "["

        String output = "[";

        //Declare k as type of integer and

        //assign 0

        int k = 0;

        //Iterate loop

        while(k<total)

        {

            //add output to queue[k]

            output = output + qObject[k];

            //check k is equal to total - 1

            if (k != total - 1) {

                //add "," to output

                output = output + ", ";

            }

            //increment k by 1

            k = k + 1;

        }

        //add "]" to output

        output = output + "]";

        //return output

        return output;

    }

}
