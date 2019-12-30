package course.c02.polymorphism;

public class TestTV {
	
	public static void showAppleTvFuns(AppleTV apple) {
		System.out.println("\n--------顯示所有 AppleTV 功能-----------------\n------------------------------------------");
		//通用
		apple.turnOn();
		apple.turnOff();
		apple.changeChannel();
		apple.changeVolume();
		//特化
		apple.showHD();
		//外掛
		apple.playDVD();
	}	
	
	public static void showSonyTvFuns(SonyTV sony) {
		System.out.println("\n--------顯示所有 SonyTV 功能-----------------\n-----------------------------------------");
		//通用
		sony.turnOn();
		sony.turnOff();
		sony.changeChannel();
		sony.changeVolume();
		//特化
		sony.showSpecialSounds();
	}	
	
	
	public static void showBasicTvFunctions(TV tv) {
		System.out.println("\n--------顯示所有 TV 功能-----------------\n-------------------------------------");
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel();
		tv.changeVolume();
	}
	
	public static void playDvd(DVDable dvd) {
		System.out.println("\n--------顯示 DVDable 功能-----------------\n----------------------------------------");
		dvd.playDVD();
	}
	
	public static void main(String[] args) {
		
		testOverride();
		
		showChangeImpl();

		withoutPolymorphism();
		
		withPolymorphism();
		
	}

	private static void withPolymorphism() {
		AppleTV apple = new AppleTV();		
		SonyTV sony = new SonyTV();
		// 不如放寬限制，讓method可以傳入更大的分類，如 父類別 或 interface，將更有彈性!!
		showBasicTvFunctions(apple);
		showBasicTvFunctions(sony);
		playDvd(apple);
	}

	private static void withoutPolymorphism() {
		AppleTV apple = new AppleTV();		
		SonyTV sony = new SonyTV();
		// method 若限定只能傳某一種參照變數，即便類似目的，也必須寫出好幾個相似method
		showAppleTvFuns(apple);
		showSonyTvFuns(sony);
	}

	private static void showChangeImpl() {
		// 這也表示，父類別 or 介面 的「宣告型態」，
		// 所「參照的物件」也可以更換為「不同子類別」：

		TV tv;
		tv = new AppleTV();
		tv = new SonyTV();

		DVDable dvd;
		dvd = new AppleTV();
	}

	private static void testOverride() {
		//AppleTV 的物件可以多種型態 (自己或父類別)宣告 => 多型
		AppleTV x1 	= new AppleTV();
		TV x2 		= x1;
		DVDable x3 	= x1;
		
		System.out.println("-------- 試試 override 的效果 -----------\n------------------------------------");
		x1.changeChannel();
		x2.changeChannel();
		x1.playDVD();
		x3.playDVD();
	}
	

	
}
