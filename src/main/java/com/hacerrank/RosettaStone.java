package com.hacerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RosettaStone {



    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Hola Mundo");
        list1.add("Mundo|World");
        list1.add("Lunes|Monday");
        list1.add("Hola|Hello");

        List<String> list2 = new ArrayList<>();

        list2.add("mieux vaut prévenir que guérir");
        list2.add("merci|thank you");
        list2.add("que|than");
        list2.add("mieux|better");
        list2.add("guérir|to heal");
        list2.add("chien|dog");
        list2.add("prévenir|prevent");
        list2.add("vaut|to");
        list2.add("beurre|butter");
        list2.add("s'il vous plaît|please");


        translator(list1);
        System.out.println();
        translator(list2);
        System.out.println();
        //translatorForNumberDecoding(needs data in it); if you put the data for the 3rd senerio it will
        //perfectly works.

    }
       public static void translator(List<String>list1){
            String [] message= list1.get(0).split(" ");//store the message to translate to English.

            for(int i=1;i<list1.size();i++){

                String [] rosetta=list1.get(i).split("\\|");//store the Rosetta

                for(int j=0;j<message.length;j++){

                    if(message[j].equals(rosetta[0])){
                        message[j]=rosetta[1];//replace the matching rosetta with message
                    }
                }
            }
            Arrays.stream(message).forEach(x-> System.out.print(x+" "));//print the new message
        }


    public static void translatorForNumberDecoding(List<String>list1){
        String [] message= list1.get(0).split(" ");//store the message to translate to English.

        List<String>splitMessage=new ArrayList<>();

        for(String s:message){
        for (int i=0;i<message.length;i++) {

         splitMessage.add(s.substring(i,i+2)); //split again the message
          }

        }

        for(int i=1;i<splitMessage.size();i++){

            String [] rosetta=list1.get(i).split("\\|");//store the Rosetta needed to translate

            for(int j=0;j<splitMessage.size();j++){


                if(splitMessage.get(j).equals(rosetta[0])){

                    splitMessage.set(j,rosetta[1]);
                }
            }
        }
        splitMessage.forEach(x-> System.out.print(x+" "));
    }
}








