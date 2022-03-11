package BinarySearch;

import java.util.*;

public class Renting_Bikes_7 {

    static boolean IsFeasible(int[] personal,int[] rent,int mid,int funds){
        int allocated = 0;
        int spent = 0;
        int index=0;
        for (int i = 0; i < personal.length&&index<rent.length; i++) {
            if(rent[index]<=personal[i]){
                spent+=rent[index];
                allocated++;
                index++;
            }
            else{
                int current_rent = rent[index];
                current_rent-=personal[i];
                int temp=current_rent;
                if(current_rent>funds){
                }
                else{
                    funds-=temp;
                    allocated++;
                    index++;
                    spent+=personal[i];
                }
            }
        }
//        System.out.println(spent+"=>"+funds+" allocated:"+allocated);
        if(funds>0){
            if(spent>funds){
                spent-=funds;
                funds=0;
            }
            else{
                funds-=spent;
                spent=0;
            }
        }

//        System.out.println(spent+"=>"+funds+"allocated: "+allocated);
        System.out.println(allocated+" "+spent);

        return allocated >= mid;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n_boys = sc.nextInt();
        int n_bikes = sc.nextInt();
        int funds = sc.nextInt();
        int[] personal= new int[n_boys];
        int[] rent = new int[n_bikes];
        for (int i = 0; i < personal.length; i++) {
            personal[i]=sc.nextInt();
        }
        for (int i = 0; i < rent.length; i++) {
            rent[i]=sc.nextInt();
        }
        Arrays.sort(personal);
        Arrays.sort(rent);
        IsFeasible(personal,rent,5,funds);


//        int low = 0;
//        int high = personal.length;
//        int mid;
//        int ans=0;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            System.out.println(low+":"+mid+":"+high);
//            boolean isFeasible = IsFeasible(personal, rent, mid,funds);
//            System.out.println(isFeasible);
//            if(isFeasible){
//                ans = mid;
//                low=mid+1;
//            }
//            else {
//                high=mid-1;
//            }
//        }
//        System.out.println(ans);
    }
}
