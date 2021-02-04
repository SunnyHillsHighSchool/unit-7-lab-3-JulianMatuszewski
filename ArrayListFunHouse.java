//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //create new ArrayList
  ArrayList<Integer> list = new ArrayList<Integer>();
  //for loop iterating through all ints starting at 2 ending before number
  for (int i = 2; i < number; i++)
    //check if number % loopvar is equal to zero
    if (number % i == 0)
      //if success store in arraylist
      list.add(i);
  //return ArrayList
  return list;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
  //for loop iterating through each index
  for (int i = 0; i < nums.size(); i++)
  //call getListOfFactors for each
    if (getListOfFactors(nums.get(i)).size() == 0)
      //if list is empty, remove from list
      nums.remove(i);
 }
}