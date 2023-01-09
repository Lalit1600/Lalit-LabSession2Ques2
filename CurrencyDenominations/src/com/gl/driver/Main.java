package com.gl.driver;

import java.util.Scanner;
import com.gl.services.Denominations;
import com.gl.sort.MergeSort;


public  class Main {

	public static void main(String[] args) {
	    
     Scanner sc  = new Scanner(System.in);
     MergeSort mergeSort = new MergeSort();
     Denominations denomination=new Denominations();
     System.out.println("Enter the currency denominations");
     int totalNoOfDenominations = sc.nextInt();
     
     System.out.println("Enter currency Denominations value");
     int[]currvalue = new int[totalNoOfDenominations];
     for(int i=0; i<totalNoOfDenominations; i++) {
    	 currvalue[i] = sc.nextInt();
     }
     
     System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(currvalue, 0, totalNoOfDenominations-1);
		denomination.notesCount( currvalue, amount);
     
	}

}
