package DivideAndConquer;


import java.util.*;

public class CodeForOne {
    static LinkedList<Long> test(LinkedList<Long> list){
        for (int i = 0; i < list.size() && !isDone(list); i++) {
            if(!(list.get(i)==0||list.get(i)==1)) {
                long temp = list.remove(i);
//                System.out.println(temp+":"+i);
                list.add(i, temp / 2);
                list.add(i, temp % 2);
                list.add(i, temp / 2);
            }
//            if(i==list.size()-1)
//                i=0;
//            System.out.println(list+":"+i);
        }
        return list;
    }
    static void code(long num,long start, long end) {

        LinkedList<Long> list = new LinkedList<>();
        list.add(num);
        while (!isDone(list)){
            list = test(list);
        }
        int count=0;

        for (long i = start-1; i <= end-1; i++) {
//            if(list.get(i)==1)
                count++;
        }
        System.out.println(count);
//        System.out.println(list);
    }

    static boolean isDone(LinkedList<Long> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0 && list.get(i) != 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long start = sc.nextInt();
        long end = sc.nextInt();
        code(num,start,end);

    }

}
