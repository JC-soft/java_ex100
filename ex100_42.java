package practice;

import java.util.Scanner;

public class ex100_42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ball=sc.nextInt();
		if((ball>=50&&ball<=70)||ball%6==0)
			System.out.println("win");
		else
			System.out.println("lose");
		
		
	}

}
