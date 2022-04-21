package com.hacerrank;
public class HappyLadyBug {
    public static String happyLadybugs(String b) {
        //return "YES" if string is empty. There is no unhappy ladybug.
        if (b.length() == 0 || b.length() == 1) {
           return "YES";
        }
        // if string has 3 ladybug .
        if (b.length() == 3 && count(b, '_') == 0) {
            if (b.charAt(0) == b.charAt(1) && b.charAt(1) == b.charAt(2)) {
                //return "YES" if all ladybugs are the same color
                return "YES";
            } else {
                //return 'NO" if one of them is different
                return "NO";
            }
        }
       // There is no unhappy ladybug so return "YES"
        if (count(b, '_') == b.length()) {
            return "YES";
        }
        //checks if there is no empty space.
        if (count(b, '_') == 0) {
            //checks if all the ladybugs are the same color.
            if (count(b, b.charAt(0)) == b.length()) {
               return "YES";
            }
            int i;
            //loop all ladybugs
            for (i = 1; i < b.length() - 1; i++) {
                //if left and right does not have same color ladybug, it returns "NO"
                if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1)) {
                  return "NO";
                }
            }
            //checks if first two and last two ladybug has the same color
            if (b.charAt(0) == b.charAt(1) && b.charAt(b.length() - 2) == b.charAt(b.length() - 1)) {
                return "YES";
            } else {
                return "NO";
            }
        }
        //checks if it has more than one space
        if (count(b, '_') > 0) {
            //removes all spaces
            b = b.replaceAll("_", "");
            //if only one ladybug then return "NO"
            if (b.length() == 1) {
                System.out.println("NO");
                return "NO";
            }
            if (b.length() == 3) {
                //checks if three ladybugs are the same color
                if (b.charAt(0) == b.charAt(1) && b.charAt(1) == b.charAt(2)) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
            //checks if all lady bugs are the same color
            if (count(b, b.charAt(0)) == b.length()) {
                return "YES";
            }
            //loop all String
            while (b.length() != 0) {
                //checks number of each color and if its more than one removes tham
                if (count(b, b.charAt(0)) > 1) {
                    String str = "" + b.charAt(0);
                    b = b.replaceAll(str, "");
                } else break;
            }
            //if string is empty that means all colors removed and there is no unhappy ladybug
            if (b.length() == 0) {
                return "YES";
            } else
            return "NO";
        }
        //if none of the condition does not meet the final is "NO"
        return "NO";
    }
    //counts number of the char on the given string
    public static int count(String s, char ch) {
        //convert given char to String s2
        String s2 = "" + ch;
        //replace all the given chars with "" in String s then subtract new length of the String s with the original s
        return s.length() - s.replaceAll(s2, "").length();
    }


}
