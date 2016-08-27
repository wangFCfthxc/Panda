package tw.org.iii.YEAR;

public class Hello7 {

	public static void main(String[] args) {
//	TODO	for (int i = 1; i <= 100; i++) {
//			System.out.print(i + "  ");
//			if (i % 10 == 0){
//				System.out.println();
//			}
//
//		}
		for (int j = 0; j < 10; j++){
			for (int i = 1; i <=10 ; i++){
				int v = j * 10 + i;
				//判斷是否為質數
				boolean isOK = true;
				for (int k=2; k<v; k++){
					if (v % k == 0){
						//你不是值數
						isOK = false;
						break;
					}
				}
				System.out.print(v + (isOK?"*":" ")  + " ");
			}
			System.out.println();
		}
	}

}
