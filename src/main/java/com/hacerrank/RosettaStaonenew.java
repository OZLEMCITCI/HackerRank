package com.hacerrank;

import java.util.*;

public class RosettaStaonenew {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Hola Mundo
        // Mundo | World
        // Lundos | Monday
        // Hola | Hello
        translateRosetta();
    }
    private static void translateRosetta() {
        List<String> full = new ArrayList<>();
        String input = "";

        do {
            System.out.println("Press 'q' to end the program");
            input = scan.nextLine();
            if(input.equals("q")) break;
            else full.add(input);
        }while(true);

        Map<String, String> rosettas = new HashMap<>();
        String firstLine = full.get(0);
        for(int i = 1; i<full.size(); i++) { // to skip first line
            String firstEntry = full.get(i).split(" \\| ")[0];
            String secondEntry = full.get(i).split(" \\| ")[1];
            rosettas.put(firstEntry, secondEntry);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < firstLine.split(" ").length ; i++) { // "Hola" "Mundo"
            sb.append(rosettas.get(firstLine.split(" ")[i]) + " ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
        scan.close();
    }
}
