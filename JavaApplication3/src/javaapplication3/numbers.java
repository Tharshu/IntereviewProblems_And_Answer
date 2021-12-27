/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author thars
 */
class numbers {
     int add(Integer arr[], int n, int i)
  {
    if(i < n)
    {
        return arr[i] + add(arr, n, ++i);
    }
    else
    {
        return 0;
    }
  }
     
     static void alternateMerge(int arr1[], int arr2[],
                               int n1, int n2, int arr3[])
    {
        int i = 0, j = 0, k = 0;
     
        // Traverse both array
        while (i < n1 && j < n2)
        {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
     
        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];
     
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
}
