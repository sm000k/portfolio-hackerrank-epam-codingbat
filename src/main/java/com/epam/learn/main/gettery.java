package com.epam.learn.main;

public class gettery {


    public class robot {
        private int field;

        public int getField() {
            return field;
        }

        public void setField(int field) {
            this.field = field;
        }

        public robot() {
        }
        public static void printString(String s){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        robot.printString("String");
    }
}
