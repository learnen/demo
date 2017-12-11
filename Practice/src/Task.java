import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		
		for(int  i = 0; i < number ;i++) {
			
			for(int j = 0; j < number ;j++) {
				
				if (i > 0 && (j == 0 || j == i || j ==number - 1 || j == number - 1 -i)) {
					System.out.print("* ");
				}else {
					if (i == 0 || i == number - 1 ) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}
		
		
		
		int a = 980;
		int b = 222;
		String user = "李耀";
		
		System.out.println("请输入你的帐号:");
		for(;;) {
			int num =  input.nextInt();
			if(num == a) {
				break;
			}else {
				System.out.println("帐号不正确请重新输入帐号");
			}	
		}
		
		
		System.out.println("请输入你的密码:");
		for(;;) {
			int password =  input.nextInt();
			if(password == b) {
				break;
			}else {
				System.out.println("不正确请重新输入帐号");
			}	
		}
		
		System.out.println("欢迎"+user+"登录系统");	
			
		
		
		//a = 9;
		// b = 1 ; c == 1 || c == 7
		// b = 2 ; c == b || c == a-b-1
		
		// b = 3 ; c == 3 || c == 5
	}
}
