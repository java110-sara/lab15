//author: Sara Russert
//date: 26 February 2024
//file: FractionArray.java

import java.util.Random;
import java.util.ArrayList;

public class FractionArray {
   public static void main(String[] args) {
   
      // number of Fractions to instantiate
      final int NUM_FRACTIONS = 5;
      
      // max number to generate
      final int MAX_RANDOM = 21;
      
      // call getArrayList() to create the ArrayList of Fractions
      ArrayList<Fraction> fractionList = getArrayList(NUM_FRACTIONS, MAX_RANDOM);
      
      // display the entire ArrayList
      System.out.println("The fraction list contains:");
      System.out.println(fractionList);
   }
   
   
   // getRandomInts
   // Return-type: int[ ]
   // Parameters:
   // An object of class Random
   // An int that specifies how many numbers to generate
   // An int that specifies the maxPlusOne random value to generate
   public static int[] getRandomInts(Random randObj, int numInts, int maxPlusOne) {
      // declare an array of ints
      int[] randInts = new int[numInts];
      
      // use for loop to assign a random int in each elm
      for (int i = 0; i < numInts; i++) {
         randInts[i] = randObj.nextInt(maxPlusOne);
      }
      
      return randInts;
   }
   
   // getArrayList
   // Return-type: ArrayList<Fraction>
   // Parameters:
   // An int that specifies how many Fraction objects to generate
   // An int that specifies the maxPlusOne random value to generate
   
   public static ArrayList<Fraction> getArrayList(int numFractions, int maxPlusOne) {
   
      // instantiate an object of class Random
      Random randomObj = new Random();
      
      // Call the getRandomInts( ) method to create an array of numerator values
      int[] numVals = getRandomInts(randomObj, numFractions, maxPlusOne);
      
      // Call the getRandomInts( ) method to create an array of denominator values
      int[] denomVals = getRandomInts(randomObj, numFractions, maxPlusOne);
      
      // create an ArrayList object for the list of fractions
      ArrayList<Fraction> fractList = new ArrayList<Fraction>();
      
      // populate the fractList ArrayList
      for (int i = 0; i < numFractions; i++) {
         // instantiate a Fraction, use the current numVal and denomVal
         Fraction temp = new Fraction(numVals[i], denomVals[i]);
         
         // add to the array list
         fractList.add(temp);
         
         System.out.print("numVals[ " + i + " ]: " + numVals[i] + "; ");
         System.out.println("denomVals[ " + i + " ]: " + denomVals[i]);
         
         // display the fraction
         System.out.println("fractList( " + i + " ): " + fractList.get(i).toString() + "\n");
      }
      
      return fractList;
   }
}