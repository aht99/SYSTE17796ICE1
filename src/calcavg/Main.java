package calcavg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int[] grade = new int[10];
        int total = 0;
        int average = 0;
        System.out.println("Enter 10 grades for average: ");
        
        for(int i = 0; i < grade.length; i++){
            grade[i] = input.nextInt();
            if(grade[i] < 0){
                break;
            }
            total += grade[i];
        }
        average = total / 10;
        
        System.out.println("Average: " + average);
    }
    
}
