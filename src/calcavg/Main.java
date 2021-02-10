package calcavg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] marks = new int[10];
        int total = 0;
        int average = 0;
        System.out.println("Enter 10 grades for average: ");
        
        for(int i = 0; i < marks.length; i++){
            marks[i] = input.nextInt();
            if(marks[i] < 0){
                break;
            }
            total += marks[i];
        }
        average = total / 10;
        
        System.out.println("Average: " + average);
    }
    
}
