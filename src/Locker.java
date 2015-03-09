/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Locker {
    int books, lockerNum;
	CombinationLock school=new CombinationLock();
	
	
	public Locker(){
		this.books=0;
		this.school= new CombinationLock(0,0,0);
		this.lockerNum=0;
	}
	public Locker(int lockerNum, CombinationLock school, int books){
		this.lockerNum=lockerNum;
		this.school=school;
		this.books=books;
	}
	public void putBookInLocker(){
		books++;
	}
	public void removeBookFromLocker(){
		if (books>0){
			books--;
		}
		else books=0;
	}
                public void displayLocker(){
		System.out.print("\nThe number of books present are "+books);
	}


	public void openLocker(int lockerNum, CombinationLock school){
		while(this.school==school&&this.lockerNum==lockerNum){
		System.out.println("Access granted");
		if(this.school != school&& this.lockerNum!=lockerNum)
                break;
                }
                System.out.println("Try again");
                
        }
}

