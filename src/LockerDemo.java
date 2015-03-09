/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.util.Scanner;
public class LockerDemo {
    public static void main(String[]args){
		
		Scanner input =new Scanner(System.in);
		int numM1,numM2,numM3, lNum, i=1, count=0, p=1;
		CombinationLock mickeyLock = new CombinationLock(28 ,17, 39);
		CombinationLock donaldLock = new CombinationLock(35,16, 27);
		Locker mickeyLocker = new Locker(100,mickeyLock, 3);
		Locker donaldLocker = new Locker(275,donaldLock, 0);
		
		while(i!=0){
		System.out.println(" enter Mickey's combination #1");
		numM1=input.nextInt();
		System.out.println(" enter Mickey's combination #2");
		numM2=input.nextInt();
		System.out.println(" enter Mickey's combination #3");
		numM3=input.nextInt();
		
		mickeyLock.openLock(numM1,numM2,numM3);
		
		
		System.out.print("\n"+"How many book are you putting in?");
		count=input.nextInt();
		for(int b=0;b<count;b++){
		mickeyLocker.putBookInLocker();
		}
		System.out.print("How many books are you removing?");
		count=input.nextInt();
		for(int b=0;b<count;b++){
		mickeyLocker.removeBookFromLocker();
		}
		
		while(p!=0){
			System.out.println(" enter Donalds's combination #1");
			numM1=input.nextInt();
			System.out.println(" enter Donalds's combination #2");
			numM2=input.nextInt();
			System.out.println(" enter Donald's combination #3");
			numM3=input.nextInt();
			donaldLock.openLock(numM1,numM2,numM3);
			System.out.println(" locker is open");
			p=input.nextInt();
			}
		
		while(p!=0){
			System.out.println("Please enter locker # for Donald");
			lNum=input.nextInt();
			donaldLocker.openLocker(lNum,donaldLock);
			System.out.println("Would you like to try again?"
					+ " \n If so please press 1 to try again, if locker is open press 0 ");
			i=input.nextInt();
			}
			System.out.print("How many book are you putting in?");
			count=input.nextInt();
			for(int b=0;b<count;b++){
			donaldLocker.putBookInLocker();
		}
			System.out.print("How many books are you removing?");
			count=input.nextInt();
			for(int b=0;b<count;b++){
			donaldLocker.removeBookFromLocker();
			}
			mickeyLocker.displayLocker();
			donaldLocker.displayLocker();
			input.close();	
	}
	
    }
}
