public class Calculation {
	//싱글톤 패턴
	private static final SingletonService instance = new SingletonService();
	//getter
	public static SingletonService getInstance() {
		return instance;
	}
	//객체 생성 방어
	private SingletonService() {}
	
	//기본요금
	public int baseFee(int kWh) {
		//200이하 사용시 910원
		if(kWh<=200)
			return 910;
		//
		else if(kWh)
	}
}
