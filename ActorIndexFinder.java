package com.rishabh.microsoftQuestions;
/*
Nikhil hosted a Comic-con. The tickets for the comic con were available online. A total of N
persons bought the tickets and also Nikhil came to know that this time one of the actors
(celebrity) of the famous Star Trek: The Original Series might have bought tickets.
This time, a square S of size Nx N is used by the organizers to represent the people in
Comic-con. If an element at i-th row and j-th column (S[i][j]) is 1, it means that the i-th
person knows the j-th person. The actor of the Star Trek: The Original Series is known to
everyone in the Comic-con, but he doesn't know anyone. Nikhil, being a host, has a lot of
responsibility, but he also wants to meet the actor. He only has access to the square
representing the people in the Comic-con, so you, being a friend of Nikhil, help him find
the index of the actor in square S. If the actor is not there in the Comic-con, return -1.
Note: S[i][j] can be either 0 or 1. If s[i][j] == 1, it means that i-th person knows the j-th
person, else if S[i][j] == 0, it means that i-th person does not know the j-th person.

 */
//for more logic check prepbytes insta page
public class ActorFinder {
    public static int findActorIndex(int[][] arr,int n){
        boolean[] isActor = new boolean[n];
        for (int i = 0; i < n; i++) {
            isActor[i] = true;
        }

        int[] numberPersonKnow = new int[n];
        for (int i = 0; i < n; i++) {
            numberPersonKnow[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1){
                    numberPersonKnow[j]++;
                    isActor[i] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(isActor[i] && numberPersonKnow[i] == n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr ={
                {0,1,1},
                {0,0,0},
                {1,1,0}
        };
        int n = 3;
        int actorIndex = findActorIndex(arr,n);
        System.out.println("Actor index is:" + actorIndex);
    }
}
