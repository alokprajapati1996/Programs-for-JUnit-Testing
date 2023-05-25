package com.bridgelabz.junittesting;

public class JUnitTestingPrograms {

            public static void countNotes(int amount) {
            int notes[] = {1000, 500, 100, 50, 10, 5, 2, 1};
            int noteFreq[] = new int[notes.length];
            int totalNotes=0;
            for (int i = 0; i < notes.length; i++) {
                if (amount >= notes[i]) {
                    noteFreq[i] = amount / notes[i];
                    amount = amount - noteFreq[i] * notes[i];
                }
            }

            System.out.println();
            for (int i = 0; i < notes.length; i++) {
                if (noteFreq[i] != 0) {
                    System.out.println(notes[i] + "  :  " + noteFreq[i]);
                    totalNotes+=noteFreq[i];
                }
            }
            System.out.println("minimum number of notes is : "+totalNotes);
        }
          public static void temperaturConversionToFarhrenheit(){
                double celsius = 10.0, fahrenheit = 0.0;

           fahrenheit = (celsius * 9/5) + 32;
            System.out.println(" value of temperature in fahrenheit:" + fahrenheit);
      }
      public static void fahrenheitToCelsius(){
    float Fahrenheit=43, Celsius;
    Celsius  = ((Fahrenheit-32)*5/9);
          System.out.println("Temperature in celsius is: "+Celsius);
}

public static void main(String[] args) {
            int amount = 1072;
            countNotes(amount);
            temperaturConversionToFarhrenheit();
            fahrenheitToCelsius();

            }
        }