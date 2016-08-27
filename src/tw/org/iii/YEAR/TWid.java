package tw.org.iii.YEAR;

import sun.security.util.Length;

public class TWid {
	private String id = null;
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	// 建構子
	TWid(){
		this((int)(Math.random()*2)==0, (int)(Math.random()*26));
	}
	TWid(boolean gender){
		this(gender, (int)(Math.random()*26));
	}
	TWid(int area){
		this((int)(Math.random()*2)==0,area);
	}
	TWid(boolean gender, int area){
//		String c0 = check.substring(area, area-1);
//		String c1 = gender?"1":"2";
//		String c2 = "" + (int)(Math.random()*10);
		StringBuffer temp = 
				new StringBuffer(check.substring(area, area+1));
//		id = check.substring(area, area+1);
		temp.append(gender?"1":"2");
//		id += gender?"1":"2";
		
		for (int i=0; i<7; i++){
			temp.append((int)(Math.random()*10));
//			id += (int)(Math.random()*10);
		}
		for (int i=0; i<10; i++){
			if (isRight(temp.toString() + i)){
				id = temp.append(i).toString();
				break;
			}
		}
		
	}
	TWid(String id){
		this.id = id;
	}
	
	// 傳回身分證字串
	String getid(){
		return id;
	}
	// 傳回性別
	boolean getGender(){
		return id.charAt(1) == '1';
	}
	// 傳回地區
	String getArea(){
		return "台中市";
	}
	// 是否正確 =>通過驗證
	static boolean isRight(String testid){
		boolean ret = false;
		if (testid.matches("^[A-Z][12][0-9]{8}$")){
			int n12 = check.indexOf(testid.charAt(0))+10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			// B123456789
			int n3 = Integer.parseInt(testid.substring(1, 2));
			int n4 = Integer.parseInt(testid.substring(2, 3));
			int n5 = Integer.parseInt(testid.substring(3, 4));
			int n6 = Integer.parseInt(testid.substring(4, 5));
			int n7 = Integer.parseInt(testid.substring(5, 6));
			int n8 = Integer.parseInt(testid.substring(6, 7));
			int n9 = Integer.parseInt(testid.substring(7, 8));
			int n10 = Integer.parseInt(testid.substring(8, 9));
			int n11 = Integer.parseInt(testid.substring(9, 10));
			int total = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5
					+ n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			
			ret = total % 10 == 0;
		}else{
			ret = false;
		}
		return ret;
	}
	
//	static boolean preCheck(String testid){
//		boolean isOK = false;
//		if (testid.matches("")){
//			isOK = true;
//		}
////		if(testid.length() == 10){
////			if(testid.charAt(1)=='1' || testid.charAt(1)=='2'){
////				// 抽出第一碼 => testid.charAT(0)
////				// 是否為A-Z => "ABCDEFGHIJKLMNOPQRSTUVXYZ".ibdexOF();
////				if(){
////					// 第三碼~第十碼 =>
////					// 是否為0-9
////				}
////			}
////		}
//		
//		return isOK;
//	}

}
