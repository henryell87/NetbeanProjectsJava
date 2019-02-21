/*
 * Copyright 2016 henryellbytes
 */

package binarysearchtree;

import java.util.Random;

/**
 * @author HENRYELL
 */



public class Testers {
    
 // random intgers
 public static int rndInt(int min, int max){
     Random rand = new Random();
     return rand.nextInt((max - min) + 1) + min;
     // 15-5 = 10 + 1 --> 0 to 10
     // + 5 to this random number
 }   
    
// random binary search tree    
 public static Tree rndTree(int count){
     if(count == 0){
         return new EmptyBST();
     }else{
         return rndTree(count - 1).add(rndInt(0, 50));
     }
 }   
    
// x + (x + 2) = x + x = 2    
public static void checkIsEmpty(Tree t) throws Exception{
    // If the tree t is an instsnce of EmptyBSt ----> t.isEmpty --> true
    // If the tree t is an instsnce of NonEmptyBSt ----> t.isEmpty --> false
    if(t instanceof EmptyBST){
       if(!t.isEmpty()){
          throw new Exception("All is not good, the tree is an EmptyBsT and it is non-empty");
       }
    }else if(t instanceof NonEmptyBST){
        if(t.isEmpty()){
          throw new Exception("All is not good, the tree is a NonEmptyBST and it is Empty");
        }
    }
}

public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
  int nT = (t.add(x)).cardinality();
  // Either something was added -> and the cardinality increased by one.
  if(nT == t.cardinality()+ 1){
      if(t.member(x)){
          throw new Exception("The cadinality increased by 1, but the thing"
          +" that was added was alredy a memer of the tree");
      }else{
          System.out.println("All is good, our cardinality increased and the thing wasn't in the tree");
      }
  }// 2. OR the thing that was added was already there and therefore not really added
  // so the cardinallity atayed the same.
  else  if(nT == t.cardinality()){
      if(!t.member(x)){
          throw new Exception("The cadinality didn't increase by 1, but"
          +" we added a new thing");
      }else{
          System.out.println("All is good, athe thing was in the taree already and our cardinality did not increase");
      }
 }else{
      throw new Exception("Somethng is wrong with our program");
  }
}

}
