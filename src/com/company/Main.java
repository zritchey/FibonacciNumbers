package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean fibFind(int c){
        if (c==1)
            return true;
        return fibFind(1,1,c);
    }

    public static boolean fibFind(int first,int second, int check){
        if (check==second)
            return true;
        if (check<second)
            return false;
        first+=second;
        fibFind(second,first,check);




    }
}
