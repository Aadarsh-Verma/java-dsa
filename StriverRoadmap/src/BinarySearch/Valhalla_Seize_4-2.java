package BinarySearch;

import java.util.*;

public class Valhalla_Seize_4 {
    static int lower_bound(int[] arr, int x) {
        int found = Arrays.binarySearch(arr, x);
        while (found > 0) {
            if (arr[found - 1] == arr[found])
                found--;
            else
                break;
        }

        if (found < 0 && found != -1) {
            return -found - 2;
        }

        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_men = sc.nextInt();
        int num_arrows = sc.nextInt();
        int[] men = new int[num_men];
        int[] arrows = new int[num_arrows];
        for (int i = 0; i < num_men; i++) {
            men[i] = sc.nextInt();
        }
        for (int i = 0; i < num_arrows; i++) {
            arrows[i] = sc.nextInt();
        }

        int[] men_clone = Arrays.copyOf(men, men.length);

        int index = 0;
        int remainder = men[0];

        for (int i = 0; i < num_arrows; i++) {
            while (arrows[i] > 0)
//                System.out.println(index+":"+arrows[i]);
                if(index==num_men){
                    System.out.println(num_men);
                    index=0;
                    remainder = men_clone[0];
                    break;
                }
                else if (arrows[i] < remainder) {
                    remainder -= arrows[i];
                    arrows[i]=0;
                    System.out.println(men.length - index);
                }
                else if(arrows[i]==remainder){
                    arrows[i]=0;
                    remainder = 0;
                    index++;
                    if(index==num_men)
                        System.out.println(num_men);
                    else
                    System.out.println(num_men-index);
                }
                else {
//                    System.out.println(remainder);
                    arrows[i]-=remainder;
                    index++;
                    if(index==num_men) {
                        System.out.println(num_men);
                        continue;
                    }
                    remainder = men_clone[index];
                    if(arrows[i]==0){
                        System.out.println(men.length-index);
                    }
                }
        }
    }

//    static void rough (){
//        int j=0;
//        int[] men_clone = Arrays.copyOf(sum_men,men.length);
//        for (int i = 0; i < num_arrows; i++) {
//
//            int index = lower_bound(men_clone,arrows[i]);
//            if(index==men_clone.length-1){
//                System.out.println(num_men);
//                men_clone = Arrays.copyOf(sum_men,num_men);
//                continue;
//            }
//
//            int diff = men_clone[index]-arrows[i];
//            if(diff>0)
//                men_clone[index+1]-=diff;
//            System.out.println(num_men-index-1);
//            int temp_index = index;
//            while(index<num_men){
//                men_clone[index]-=men_clone[temp_index];
//                index++;
//            }
//
//        }
//    }
}
