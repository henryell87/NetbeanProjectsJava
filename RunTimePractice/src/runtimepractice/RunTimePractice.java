/*
 * Copyright 2016 henryellbytes
 */
package runtimepractice;

import java.util.HashMap;

/**
 *
 * @author HENRYELL
 */
public class RunTimePractice {

    public static int findNumsOfRepetitions(String s, char c) {
                // Linear time; 0(n) time
                int sum = 0;// 1
                for(int i = 0; i < s.length(); i++){// 1, n+1, n
                    if (s.charAt(i) == c){// n
                        sum++;// n
                    }
                }
                return sum;// 1
            }  
    
    public static int[] findNumsOfRepetitionsv1(String s, char[] c){
        //Quad time: 0(n * m) time
        int[]sums = new int[c.length];// 1
        for(int i = 0; i < s.length(); i++){// 1, n + 1
           for(int j = 0; j < c.length; j++){// n  n*m + 1, n*m
            if(s.charAt(i) == c[j]){// n*m
                sums[j] = sums[j] + 1;// n*m
            }
        }
    }
        return sums;// 1
    }
    
    public static int[]findNumsOfRepetitionsv2(String s, char[] c){
        // 0ptimal time: O(n+m)
        int[] sums = new int[c.length];//1
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
              map.put(s.charAt(i), 1);  
            }else{
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        for(int j = 0; j < c.length; j++){
            int sum;
            if(!map.containsKey(c[j])){
                sums[j] = map.get(c[j]);
            }else{
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abca", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test "+duration + "ms");
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', }; 
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv1("abca;lkjhutomrt'frestmnbfd'jkhgfdsaweqlpoi'iojkmnbvcxzaqwe", 'a'));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test "+duration + "ms");
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv2("abca;lkjhutomrt'frestmnbfd'jkhgfdsaweqlpoi'iojkmnbvcxzaqwe", 'a'));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test "+duration + "ms");
    }
    
}
