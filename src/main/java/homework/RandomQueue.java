package homework;

import java.util.Collection;
import java.util.Iterator;


//RandomQueue.java

//Implementation of RandomQueue class

public class RandomQueue < Type > implements QueueInterface< Type > {

    //Declare qObject as type of <T> and initialize queueObject

    private Type[] queueObject;

//Declare total as type of integer and initialize total with 0

    private int total;

//Declare SIZE as final integer

    private static final int SIZE = 80;


//Implementation of default constructor

    public RandomQueue() {
        total=0;
        queueObject=(Type[]) new Object[SIZE];
    }

//Implementation of add function


    @Override
    public void add(Type element) {

        //check total is equal to qObject.length

        if (total == queueObject.length) {

            //Declare temporary as type of T and initialize it

            Type temporay[] = (Type[]) new Object[total * 2];

            //call arraycopy function

            System.arraycopy(queueObject, 0, temporay, 0, total);

            //assign temporay to qObject

            queueObject = temporay;

        }

        //assign element to queueObject[total]

        queueObject[total] = element;

        //increment total by 1

        total = total + 1;

    }

//Implementation of remove function

    @Override
    public Type remove() {

        if (!(total==0)/*!isEmpty*/) {

            // Declare randomIndexValue as type of integer

            int randomIndexValue;

            //Initilaize randomIndexValue

            randomIndexValue= (int)(Math.random() * total);

            //Declare element as type of T

            Type element = queueObject[randomIndexValue];

            //assign qObject[total-1] to qObject[randomIndexValue]

            queueObject[randomIndexValue] = queueObject[total - 1];

            //Decrement total by 1

            total = total - 1;

            //return element

            return element;

        }

        //return null

        return null;

    }

//Implementation of isEmpty function
    @Override
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

            output = output + queueObject[k];

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
