package StackNQueue;

import java.util.*;

public class Monk_powerOfTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> calling=new LinkedList<>();
        ArrayList<Integer> ideal=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            calling.addLast(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            ideal.add(sc.nextInt());
        }
        int time=0;
        while(!calling.isEmpty()){
            if(calling.peekFirst()!=ideal.get(0)){
                int temp = calling.removeFirst();
                calling.addLast(temp);
                time++;
            }
            else{
                calling.removeFirst();
                ideal.remove(0);
                time++;
            }
        }
        System.out.println(time);
    }
}
