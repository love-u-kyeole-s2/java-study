import java.util.*;

public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		
		for (int i = 0; i < 3; i++) {	
			// j 는 이미 배열에 저장된 값
			// i는 현재 난수값
			com[i] = (int)(Math.random() * 9) + 1;
			
			for (int j = 0; j < i; j++) {
				if (com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		
		// 사용자 입력 받기
		while (true) {
			System.out.println("세자리 정수를 입력하세요>>");
			int input = scan.nextInt();
			
			if (input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다!!");
				// 처음으로 이동
				continue; // while => 조건식, for => 증가식
			}
			
			// 배열에 저장
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			// 잘못된 입력 => 같은 수를 입력하면 안된다, 0을 입력하면 안된다.
			if (user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			int s = 0, b = 0;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == user[i]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			System.out.printf("Input Number:%d, Result:%dS-%dB\n", input, s, b);
			
			if (s == 3) {
				System.out.println("Game Over!");
				break;
			}
		}
	}
}