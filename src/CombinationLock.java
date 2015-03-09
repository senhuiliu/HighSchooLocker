/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class CombinationLock {
    int num1, num2, num3, dial;
	public CombinationLock(){
		this.num1=0;
		this.num2=0;
		this.num3=0;
		this.dial=0;
		}
	public CombinationLock(int num1, int num2, int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.dial=0;
	}
	
	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}
	public int getNum3(){
		return num3;
	}
	public int getDial(){
		return dial;
	}
	
	public void setNum1(int num1){
		this.num1=num1;
	}
	public void setNum2(int num2){
		this.num2=num2;
	}
	public void setNum3(int num3){
		this.num3=num3;
	}
	public void ResetDial(int dial){
		this.dial=dial;
	}
        
	public int turnRight(int dial){
		while (dial>0&&dial<40){
			this.dial=dial;
			return dial;}
		 System.out.print("Locker Reset");
			return 0;
	}
	public int turnLeft(int dial){
		while (dial<this.dial){
			this.dial=dial;
		return dial;
	}
		System.out.print("Locker Reset");
			return 0;
	}
	public void openLock(int num1, int num2, int num3){
		
		turnRight(num1);
		if (this.num1==dial)
			turnLeft(num2);
		
			if(this.num2==dial)
				turnRight(num3);
			
				if(this.num3==dial)
					System.out.print("Locker is open");
				
			else{
			System.out.println("Try Again");
			}
} 
	}


