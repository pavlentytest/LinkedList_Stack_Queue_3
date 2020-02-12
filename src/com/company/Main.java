package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     /*   List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0; i< 100000; i++) {
            arrayList.add(0,i);   // O(n)
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add (begin): "+ duration);

        startTime = System.nanoTime();
        for(int i=0; i< 100000; i++) {
            linkedList.add(0,i);  // O(1)
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add (begin): "+ duration);


        startTime = System.nanoTime();
        for(int i=0; i< 100000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList add (end): "+ duration);

        startTime = System.nanoTime();
        for(int i=0; i< 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add (end): "+ duration);


        startTime = System.nanoTime();
        for(int i=50000; i < 60000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get (middle): "+ duration);

        startTime = System.nanoTime();
        for(int i=50000; i < 60000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get (middle): "+ duration);

        startTime = System.nanoTime();
        for(int i=0; i < 50000; i++) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove (begin): "+ duration);

        startTime = System.nanoTime();
        for(int i=0; i < 50000; i++) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove (begin): "+ duration);


        System.out.println("ArrayList size: " + arrayList.size());
        startTime = System.nanoTime();
        for(int i=arrayList.size()-1; i > -1; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove (begin): "+ duration);

        System.out.println("LinkedList size: " + linkedList.size());
        startTime = System.nanoTime();
        for(int i=arrayList.size()-1; i > -1; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove (end): "+ duration);
*/
        // Stack - LIFO - last in first out
        Stack<String> stack = new Stack<>();
        String[] nums = {"1","2","3","4","5"};
        for(String s: nums) {
            stack.push(s);
        }
        while(!stack.empty()) {
            System.out.print(stack.pop() + " "); // возращает и удаляет из стека послдений элемент
        }
        System.out.println();
        // Queue - FIFO - first in first out
        Queue<String> queue = new ArrayDeque<>();
        for(String s: nums) {
            queue.offer(s);
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // возращает и удаляет из очереди первый элемент
        }



        
    }
}
