import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainTest {
	public static void main(String[] args) {
		// Calendar클래스 (추상클래스) => 생성자 존재 X (Calendar c = new Calendar() 사용 못함)
		
		Calendar c = new GregorianCalendar();	// GregorianCalendar 음력을 구하는 메소드 있음 Calendar에는 없음
		Calendar c2 = Calendar.getInstance();	// 제일 많이 사용. Calendar안에 getInstance라는 static 메서드가 있음

		// (GregorianCalendar)C2.~  부모가 자식꺼 쓰고 싶을 때는 (이런식으로 형변환 하면 되겠지)
		// 원래 추상적일수록 부모타입인데 캘린더는 실제로 추상클래스고
		
		
		/* Calendar 객체명 = Calendar.getInstance()
		  1) 시스템의 현재 날짜와 시간정보를 얻기 위해 getInstance()메서드 사용
		  2) 객체가 갖고 있는 날짜 시간 정보는 get()메소드를 이용하여 사용.

		   long : 시간을 1000분의 1초 단위로 계산된 결과를 알려준다.

		  java.lang.Object

			 java.util.Calendar

				java.util.GregorianCalendar
				*/
		
		// 추상 클래스, static 메서드, 다형성, new 연산자, 생성자
		System.out.println(c);
		System.out.println(c.get(1));		// 출력창에 출력된 수많은 속성중 원하는 것들만 볼 수 있음 >>> 년도
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+2);	// 0 부터 시작 1~11
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));	// 1 : 일요일 ~ 7 : 토요일 
		
		/*
		특정한 횟수 O : for
		특정한 횟수 X : while*/
		String yo = "";
		
		switch(c.get(Calendar.DAY_OF_WEEK)) {		// 오늘 날짜
			case 1 : 
				yo = "일요일";
				break;				// 가장 가까운 반복문을 빠져나감. if문은 안빠져 나감
			case 4 : 
				yo = "수요일";
				break;
			default : 
				break;
			}
		
		System.out.println(yo);
		
		
		// 달력 만들려면 첫번째 날짜랑 마지막 날짜를 알아야 함.
		System.out.println(c.getActualMaximum(Calendar.DATE));		// 마지막 날짜 => 오늘의 최고의 날짜
		
		
		System.out.println();
		Calendar xmas = Calendar.getInstance();
		xmas.set(Calendar.YEAR, 2022);		// 2022년
		xmas.set(Calendar.MONTH, 11);		// 12월
		xmas.set(Calendar.DATE, 25);		// 25월
		
		System.out.println(xmas);
		
		
		
	}
}
