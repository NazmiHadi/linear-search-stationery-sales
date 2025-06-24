//programmer Nazmi Hadi @ 21/3/2025

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        
        //to store N value of array
        System.out.println("=======================================");
        System.out.print("Enter Number of Stationary Items : ");
        int N = input.nextInt();
        System.out.println("=======================================\n");

        
        String[] stationaryType = new String[N];
        int[] totalSale = new int[N];
        
        
        //to input N times of elements in respective array
        for(int i = 0; i < N; i++){
            System.out.printf((i+1) + "%-25s", ". Enter Stationary Type        : ");
            stationaryType[i] = inputS.nextLine();
            
            System.out.printf("%-25s", "   Enter Total sale for a month : ");
            totalSale[i] = input.nextInt();
            
            System.out.println("______________________________________________");
        }
        
        
        //to display each elements in the array
        System.out.println("===============================================================");
        System.out.println("                        SALES RECORD");
        System.out.println("===============================================================");
        System.out.printf("%-5s %-25s %-15s %5s \n", "Bil", "Stationary Type", "Total Sales", "Index Positions" );
        System.out.println("---------------------------------------------------------------");

        
        for(int i = 0; i < N; i++){
            System.out.printf("%-5d %-25s %-20d %5d \n", (i+1), stationaryType[i], totalSale[i], i);
        }
        
        
        //to search for a specific stationary type
        System.out.println(" ");
        System.out.println("==================================================================");
        System.out.println("==================================================================");
        System.out.println("                        LINEAR SEARCH");
        System.out.println("==================================================================");
        System.out.println("==================================================================");
        System.out.println(" ");

        System.out.print("Enter Stationary to search in array : ");
        String searchStationary = inputS.nextLine();
        boolean searchConfirm = false;
        
        for(int i = 0; i < N; i++){
            if(searchStationary.equals(stationaryType[i])){
                System.out.println("##############################################################");
                System.out.println("                            FOUND!");
                System.out.println("##############################################################");
                System.out.println(" ");
                System.out.println("---------------------------------------------------------------");
                System.out.printf("%-5s %-25s %-15s %8s \n", "Bil", "Stationary Type", "Total Sales", "Index Positions" );
                System.out.printf("%-5d %-25s %-20d %8d \n", (i+1), stationaryType[i], totalSale[i], i);
                System.out.println("---------------------------------------------------------------");
                
                searchConfirm = true;

            }
        }
        if(searchConfirm == false){
            System.out.println("##############################################################");
            System.out.println("    THE ELEMENT YOU ENTERED IS NOT FOUND IN THE ARRAY");
            System.out.println("##############################################################");
        } 
        System.out.println(" ");
        System.out.println("===============================================================\n");

        
        //to search for specific total sale value
        System.out.print("Enter Total Sale to search in array : ");
        int searchSale = input.nextInt();
        searchConfirm = false;
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");

        
        for(int i = 0; i < N; i++){
            if(searchSale == totalSale[i]){
                System.out.println("##############################################################");
                System.out.println("                            FOUND!");
                System.out.println("##############################################################");
                System.out.println(" ");
                System.out.println("---------------------------------------------------------------");
                System.out.printf("%-5s %-25s %-15s %8s \n", "Bil", "Stationary Type", "Total Sales", "Index Positions" );
                System.out.println("---------------------------------------------------------------");
                System.out.printf("%-5d %-25s %-20d %8d \n", (i+1), stationaryType[i], totalSale[i], i);
                System.out.println("---------------------------------------------------------------");

                searchConfirm = true;
            }
        }
        if(searchConfirm == false){
            System.out.println("##############################################################");
            System.out.println("     THE ELEMENT YOU ENTERED IS NOT FOUND IN THE ARRAY");
            System.out.println("##############################################################");
        }
    }
}