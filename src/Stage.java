import java.util.Scanner;

public class Stage {
  private int kHw;

  public void start() {
    Scanner sc = new Scanner(System.in);
		System.out.println("사용량을 입력하세요.");
		kHw = sc.nextInt();

    Calculation c = Calculation.getInstance();
    
    System.out.println("기본 요금: " + c.baseFee(kHw));
    System.out.println("전력량 요금: " + c.electricityFee(kHw));
    System.out.println("기후 환경 요금: " + c.climateEnvironmentFee(kHw));
    System.out.println("전기 요금: " + c.totalElectricityFee(kHw));
    System.out.println("부가 가치세: " + c.valueAddedTax(kHw));
    System.out.println("전력 기반 기금: " + c.electricityInfrastructureFund(kHw));
    System.out.println("청구 금액: " + c.totalCharge(kHw));
  }
}
