
public class Exam02 {

	public static void main(String[] args) {
		// 업그레이드 된 약수구하기

		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + ", ");
				}
			}
			System.out.println(i);
			System.out.println("");
		}

	}

}
