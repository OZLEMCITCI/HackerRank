package com.hacerrank;

public class UtopianTree {


    public static void main(String[] args) {
        utopianTree(1);
    }

    public static int utopianTree(int n) {
        //initial height of the tree
        int height=1;

        //no need loop if n is 0
        if(n==0) return height;

        //loop each season to determine the height of the tree.
        for(int i=1;i<=n;i++){
            height*=2;

            //stop the loop if it is the last season
            if(i==n)
                return height;

            //continue the loop
            i++;
            height+=1;
        }
        return height;

    }
}
