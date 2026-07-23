                                             // 1030A - In Search Of an Easy Problem //

import java.util.*;

public class InSearchOfAnEasyProblem {
    public static void main (String []args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int answer = sc.nextInt();
            
            if (answer == 1) {
                System.out.println("HARD");
                sc.close();
                return;
            }
        }
        System.out.println("EASY");
        sc.close();
    }
}