package Tasks.FourthList;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            counts.put(num, counts.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                Integer head = deque.poll();
                Integer count = counts.get(head);
                if (count == 1) {
                    counts.remove(head);
                } else {
                    counts.put(head, count-1);
                }
            }
            if (deque.size() == m) {
                max = Math.max(max, counts.size());
            }

            if(max == m){
                break;
            }
        }

        System.out.println(max);
    }
}




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Deque<Integer> deque = new ArrayDeque<>();
//        HashSet<Integer> set = new HashSet<>();
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int max = 1;
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int input = scanner.nextInt();
//            deque.add(input);
//
//            count++;
//            if (count >= m) {
//                set.addAll(deque);
//                if(max < set.size()){
//                    max = set.size();
//                }
//                count = 2;
//                set.clear();
//                deque.remove();
//            }
//        }
//
//        System.out.println(max);
//    }
//}



//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] arr = new int[n];
//
//        for(int i = 0; i < m; ++i){
//            int val = sc.nextInt();
//            map.put(val, i);
//            arr[i] = val;
//        }
//        int uniq = map.size();
//        for(int i = m; i < n; ++i){
//            int val = sc.nextInt();
//            arr[i] = val;
//            map.put(val, i);
//            if(val != arr[i - m] && map.get(arr[i - m]) == i - m){
//                map.remove(arr[i - m]);
//            }
//            if(map.size() > uniq) { uniq = map.size(); }
//        }
//        sc.close();
//        System.out.println(uniq);
//    }