/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static java.lang.Integer.sum;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import static javaapplication3.numbers.alternateMerge;

/**
 *
 * @author thars
 */
public class JavaApplication3 {

    int sum = 0, j = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // problem 1
        System.out.println("for-loop");
        List<Integer> list = Arrays.asList(1, 22, 93, 4, 5);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
  
        System.out.println("sum-> " + sum);
        }
         System.out.println("while-loop");
         while (list.size() > count) {
             sum += list.get(count);
             count++;
             System.out.println("sum-> " + sum);
         }
         System.out.println("recursion");
         Integer[] a = list.toArray(new Integer[list.size()]);
         numbers elem = new numbers();
         
         int x = elem.add(a, a.length, 0);
         System.out.println("Sum of elements in List :" + x);
//*****************************************************************
         
          // problem 2
            int arr1[] = {1, 3, 5, 7, 9, 11};
            int n1 = arr1.length;
     
            int arr2[] = {2, 4, 6, 8};
            int n2 = arr2.length;
     
            int arr3[] = new int[n1+n2];
            alternateMerge(arr1, arr2, n1, n2, arr3);
     
            System.out.println("Array after merging ");
            for (int i = 0; i < n1 + n2; i++)
            System.out.print( arr3[i] + " ");
    //**************************************************************
          
         // problem 3
         
         System.out.println();
         System.out.println("100 Fibonacci numbers: ");
         int n = 100, firstTerm = 0, secondTerm = 1;
         for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
    }
         // problem 4
          System.out.println("formed number is ");
          formLargestNum(list); 
        
         

    }
     private static void formLargestNum(List<Integer> numList){
         System.out.println("formed number is ");
  Collections.sort(numList, new Comparator<Integer>() {

   @Override
   public int compare(Integer num1, Integer num2) {
    String a = num1.toString() + num2.toString();
    String b = num2.toString() + num1.toString();
    return b.compareTo(a);
   }
  });
  for(Integer i : numList){
   System.out.print(i);
  }
 }

    }

    

