package NumberBased;

import java.util.Scanner;

public class oddevenno {


	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no");
int no = sc.nextInt();
for (int i = 1; i <= no; i++) {
	if(i%2==0){
		System.out.println("evn no" + i);
	}else {
		System.out.println("odd no" + i);
	}
	
}

	}

}
