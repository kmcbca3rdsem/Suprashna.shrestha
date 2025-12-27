package com.kmc.oop.test.lab2.newlab;

    public class Distance {

        int feet;
        int inches;

        Distance() {
            feet = 0;
            inches = 0;
        }

        Distance(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
        }

        //add two distances
        Distance add(Distance d) {
            Distance temp = new Distance();
            temp.feet = this.feet + d.feet;
            temp.inches = this.inches + d.inches;
            if (temp.inches >= 12) {
                temp.feet += 1;
                temp.inches -= 12;
            }
            return temp;
        }

        //subtract two distances
        Distance subtract(Distance d) {
            Distance temp = new Distance();
            temp.feet = this.feet - d.feet;
            temp.inches = this.inches - d.inches;
            if (temp.inches < 0) {
                temp.feet -= 1;
                temp.inches += 12;
            }
            return temp;
        }

        //display distance
        void display() {
            System.out.println(feet + " feet " + inches + " inches");
        }

        //
        public static void main(String[] args) {
            Distance d1 = new Distance(8, 4);
            Distance d2 = new Distance(3, 6);

            Distance sum = d1.add(d2);
            Distance diff = d1.subtract(d2);

            System.out.print("First Distance: ");
            d1.display();
            System.out.print("Second Distance: ");
            d2.display();

            System.out.print("Addition: ");
            sum.display();
            System.out.print("Subtraction: ");
            diff.display();
        }
    }

