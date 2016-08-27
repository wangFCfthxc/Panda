package tw.org.iii.YEAR;

import sun.security.util.Length;

public class TWid {
	private String id = "A123456789";
	
	// 建構子
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
		if (testid.matches("^[A-Z][12][0-9]{6}$")){
			// TODO 
			ret = true;
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
