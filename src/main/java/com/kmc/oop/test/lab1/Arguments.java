package com.kmc.oop.test.lab1;

class Arguments {
     static void main(String[] args) {

        int count = args.length;
        System.out.println("Arguments = " + count);

        for (int i = 0; i < count; i++) {
            System.out.println("args" + (i + 1) + ": " + args[i]);
        }
    }
}


