import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ch5Emart10Point {
	public static void main(String[] args) {

		// 문자열 배열 k19_itemname을 선언하고 요소 값으로 상품명을 지정한다. 
		String[] k19_itemname = { "맥심모카골드마일드커피믹스(12g*20)", "스페셜티카페라떼아포가토 250ml", "동서둥글레차(1.2g*100티백) 120g", "농심신라면120gX5입", "애호박", 
				"홈런볼초코5번들 230g", "[국내산] 당도선별 수박(특) 8kg미만", "퓨라에이스 오투웨어 마스크 KF94 (대형/소형)50개", "콩이가득두부 찌개용 300g", "쌀로별 오리지널 156g", 
				"서울우유 2.3L", "풀무원 국산 콩 순두부 (350g)", "CJ 비비고왕교자490gX2", "비요뜨초코링(143g*2개)", "햇감자 900g",
				"CJ꼬마돈까스 450g", "왕고래밥 56g", "[미국산]고당도체리 454g/팩", "노브랜드 통안심치킨텐더550g", "코카콜라 215ml 12입", 
				"브로콜리 1개", "노브랜드 간편한 유부초밥 540g", "피코크새우볶음밥 4+2기획 1260g", "CJ 햄스빌 베이컨 (110gX3)", "1등급 계란 (15개입/대란)",
				"숯불매콤닭꼬치 800g", "CJ 비비고 사골곰탕 500g", "삼성QLED8KTV", "LG트롬스팀건조기 RH16WS(용량: 16kg/화이트)", "2020LG그램17" };

		// 정수형 배열 k19_price를 선언하고 요소 값으로 각각의 상품에 해당하는  단가를 넣어준다.
		int[] k19_price = { 3180, 1000, 8300, 3380, 1280, 
				4980, 13900, 75000, 1000, 1190, 
				4980, 1800, 8480, 2530, 3580, 
				3880, 980, 10800, 5580, 6880, 
				1180, 4380, 8580, 7980, 3980,
				13980, 1250, 12900000, 1757500, 1966000 };

		// 정수형 배열 k19_num을 선언하고 요소 값으로 각각의 상품에 해당하는 수량을 넣어준다.
		int[] k19_num = { 1, 2, 1, 1, 1,
				1, 1, 1, 1, 1,
				1, 2, 1, 1, 1, 
				1, 3, 1, 1, 1, 
				1, 1, 1, 1, 1, 
				1, 1, 1, 1, 99 };

		//boolean 타입 배열 k19_taxfree를 선언하고 요소 값으로 각각의 상품이 면세인지 아닌지를 넣어준다.
		boolean[] k19_taxfree = { false, false, false, false, true,
				false, true, false, true, false, 
				true, true, false, false, true,
				false, false, false, false, false, 
				true, false, false, false, true, 
				false, false, false, false, false };

		double k19_sumTaxfree = 0; //면세 물품의 가격 합계를 뜻하는 실수형 변수 k19_sumTaxfree를 선언하고 0으로 초기화 한다.  
		double k19_sum = 0; // 과세 물품의 가격  가격 합계를 뜻하는 실수형 변수 k19_sum을 선언하고 0으로 초기화 한다.  
		double k19_taxrate = 10 / 100.0; // 세율을 뜻하는 실수형 변수 k19_taxrate를 선언하고, 10프로 환율을 계산해 저장.
		double k19_tax = 0; //세금을 뜻하는 변수 k19_tax를 선언하고, 0으로 초기화
		DecimalFormat k19_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat 클래스의 format 메소드를 사용하여 세자리 마다콤마를 찍는 포맷 k19_df객체 생성한다.

		Calendar k19_calt = Calendar.getInstance(); // Calender 클래스의 객체 k19_calt를 선언하고, getTime()메소드를 이용해서 현재시간을 가져온다.
		SimpleDateFormat k19_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // SimpleDateFormat 클래스의 객채 k19_sdt를 생성하고 날짜형식을 정한다.

		System.out.printf("%33s\n", "이마트 죽전점 (031)888-1234"); //이마트 점포와 전화번호를 출력
		System.out.printf("%7s%21s\n", "emart", "206-86-50913 이갑수"); // 점포에 대한 정보 출력
		System.out.printf("%28s\n\n", "용인시 수지구 포은대로 552"); // 점포 주소 출력
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가(30일내)"); //영수증 교환 환불에 대한 안내 사항 출력
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드지참)"); //영수증 교환 환불에 대한 안내 사항 출력
		System.out.printf("%s\n", "체크카드/신용카드 청구취소 반영은"); //영수증 교환 환불에 대한 안내 사항 출력
		System.out.printf("%s\n\n", "최대 3~5일 소요 (주말,공휴일제외)"); //영수증 교환 환불에 대한 안내 사항 출력
		System.out.printf("%s%-21s%s\n", "[구 매]", k19_sdt.format(k19_calt.getTime()), "POS:0009-2418"); //구매 날짜와 포스 번호 출력
		System.out.printf("------------------------------------------\n"); //헤더 인쇄
		System.out.printf("%-17s%-6s%-6s%s\n", "   상 품 명", "단 가", "수량", "금 액"); // "상품명", "단가", "수량", "금액" 출력
		System.out.printf("------------------------------------------\n");
		for (int k19_i = 0; k19_i < k19_itemname.length; k19_i++) { // 정수형 변수 k19_i를 선언하고 0으로 초기화 한다. k19_i를  itemname의 길이까지 1씩 늘려가면서 for문을 수행

			byte[] k19_b = k19_itemname[k19_i].getBytes(); //byte타입 배열 k19_b를 선언하고 k19_itemname[k19_i]의 바이트를 구한다.
			String k19_a; //k19_a를 선언

			if (k19_itemname[k19_i].getBytes().length < 14) { // k19_itemname[k19_i]의 바이트 길이가 14보다 작을 경우
				k19_a = new String(k19_b, 0, k19_itemname[k19_i].getBytes().length); //k19_a에 k19_b에서 구한 바이트를 이용해서 k19_itemname[k19_i]의 바이트 길이까지 문자열로 변환해서 저장한다.
				while (k19_a.getBytes().length < 14) { // k19_a의 바이트 수가 14보다 작으면 while문을 수행
					k19_a = k19_a + (" "); //k19_a에 공백을 더해준다. (바이트가 14가 될때 까지)
				}
			} else { // k19_itemname[k19_i]의 바이트 길이가 14보다 클 경우
				k19_a = new String(k19_b, 0, 16); // k19_a에 k19_b에서 구한 바이트를 이용해서 16 바이트까지 문자열로 변환해서 저장한다.
				k19_a = k19_a.substring(0, k19_a.length() - 1); // k19_a의 마지막 글자를 잘라준다. (14바이트로 만들기 위해서)
			}

			int k19_blank = 20 - k19_a.getBytes().length; //k19_blank를 선언하고 22에서 k19_a의 바이트의 길이 만큼 빼준다. (단가의 공간을 지정하기 위해서)
			int k19_blank1 = 18 - k19_a.getBytes().length; //k19_blank1를 선언하고 22에서 k19_a의 바이트의 길이 만큼 빼준다. (단가의 공간을 지정하기 위해서)
			int k19_blank2 = 24 - k19_a.getBytes().length; //k19_blank2를 선언하고 23에서 k19_a의 바이트의 길이 만큼 빼준다. (단가의 공간을 지정하기 위해서)		

			if (k19_taxfree[k19_i] == true) { // 면세 상품일 경우
				if (k19_price.length == 7) { //금액이 백만원 이상일 때
					//상품명, 단가, 수량, 금액을 출력하는데 상품명 옆에 *을 출력해준다.
					System.out.printf("%02d* %-1s%" + k19_blank + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else if (k19_price[k19_i] >= 10000000) { //금액이 천만원 이상일 때
					//상품명, 단가, 수량, 금액을 출력
					System.out.printf("%02d* %-1s%" + k19_blank1 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else {
					//상품명, 단가, 수량, 금액을 출력
					System.out.printf("%02d* %-1s%" + k19_blank2 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				}
				k19_sumTaxfree += k19_price[k19_i] * k19_num[k19_i]; //면세 상품의 총 가격의 합계를 구한다.
			} else { //과세 상품일 경우
				if (k19_price.length == 7) { //금액이 백만원 이상일 때
					//상품명, 단가, 수량, 금액을 출력
					System.out.printf("%02d  %-1s%" + k19_blank + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else if (k19_price[k19_i] >= 10000000) { //금액이 천만원 이상일 때
					//상품명, 단가, 수량, 금액을 출력
					System.out.printf("%02d* %-1s%" + k19_blank1 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else {
					//상품명, 단가, 수량, 금액을 출력
					System.out.printf("%02d  %-1s%" + k19_blank2 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				}
				k19_sum += k19_price[k19_i] * k19_num[k19_i]; //과세 상품의 총 가격의 합계를 구한다.
			}
		}

		int k19_retPrice = (int) ((k19_sum) * 10 / ((1 + k19_taxrate) * 10)); // 세전 가격 k19_retPrice를 선언하고받을 금액에서 (1+세율)을 나누어서 계산해서저장
		if ((double) k19_retPrice == (int) k19_retPrice) { //세전가격에  나오는데 실수형과 정수형의 계산 값이 같으면
			k19_retPrice = k19_retPrice; // 세전가격은 세전가격이다.
		} else { //만약 실수형과 정수형의 계산이 같지 않으면 
			k19_retPrice = k19_retPrice + 1; // 세전 가격에 1을 더해준다.(올림처리)
		}
		k19_tax = k19_sum - k19_retPrice; //세금 = 총액 - 세전가격
		System.out.printf("%-12s%s%14s\n", "", "(*)면 세  물 품", k19_df.format(k19_sumTaxfree)); //면세 물품 가격의 총 합계를  3자리수마다 콤마 찍어서 출력
		System.out.printf("%-14s%s%14s\n", "", " 과 세  물 품", k19_df.format(k19_retPrice)); // 과세 물품 가격의 총 합계를  3자리수마다 콤마 찍어서 출력
		System.out.printf("%-15s%s%14s\n", "", "부   가   세", k19_df.format(k19_tax)); // 부가세를  3자리수마다 콤마 찍어서 출력한다.
		System.out.printf("%-15s%s%14s\n", "", "합        계", k19_df.format(k19_sum + k19_sumTaxfree)); // 과세물품과 면세물품의 총 합계를 더해서  3자리수마다 콤마 찍어서 출력
		System.out.printf("%s%24s\n", "결 제 대 상 금 액", k19_df.format(k19_sum + k19_sumTaxfree)); // 과세물품과 면세물품의 총 합계를 더해서  3자리수마다 콤마 찍어서 출력
		System.out.printf("------------------------------------------\n");
		System.out.printf("%-1s %-14s %s/%8s\n", "0024", "하  나", "5417**8890", "07850246"); //카드 정보를 출력
		System.out.printf("%-16s %s / %11s\n", "카드결제", "일시불", k19_df.format(k19_sum + k19_sumTaxfree)); // 카드 결제 내역을 출력한다. 
		System.out.printf("------------------------------------------\n");

	}

}
