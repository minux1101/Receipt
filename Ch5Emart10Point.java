import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ch5Emart10Point {
	public static void main(String[] args) {

		// ���ڿ� �迭 k19_itemname�� �����ϰ� ��� ������ ��ǰ���� �����Ѵ�. 
		String[] k19_itemname = { "�ƽɸ�ī��帶�ϵ�Ŀ�ǹͽ�(12g*20)", "�����Ƽī��󶼾������� 250ml", "�����ձ۷���(1.2g*100Ƽ��) 120g", "��ɽŶ��120gX5��", "��ȣ��", 
				"Ȩ��������5���� 230g", "[������] �絵���� ����(Ư) 8kg�̸�", "ǻ���̽� �������� ����ũ KF94 (����/����)50��", "���̰���κ� ��� 300g", "�ҷκ� �������� 156g", 
				"������� 2.3L", "Ǯ���� ���� �� ���κ� (350g)", "CJ �����ձ���490gX2", "�������ڸ�(143g*2��)", "�ް��� 900g",
				"CJ������� 450g", "�հ����� 56g", "[�̱���]���絵ü�� 454g/��", "��귣�� ��Ƚ�ġŲ�ٴ�550g", "��ī�ݶ� 215ml 12��", 
				"����ݸ� 1��", "��귣�� ������ �����ʹ� 540g", "����ũ���캺���� 4+2��ȹ 1260g", "CJ �ܽ��� ������ (110gX3)", "1��� ��� (15����/���)",
				"���Ҹ��޴߲�ġ 800g", "CJ ���� ������ 500g", "�ＺQLED8KTV", "LGƮ�ҽ��������� RH16WS(�뷮: 16kg/ȭ��Ʈ)", "2020LG�׷�17" };

		// ������ �迭 k19_price�� �����ϰ� ��� ������ ������ ��ǰ�� �ش��ϴ�  �ܰ��� �־��ش�.
		int[] k19_price = { 3180, 1000, 8300, 3380, 1280, 
				4980, 13900, 75000, 1000, 1190, 
				4980, 1800, 8480, 2530, 3580, 
				3880, 980, 10800, 5580, 6880, 
				1180, 4380, 8580, 7980, 3980,
				13980, 1250, 12900000, 1757500, 1966000 };

		// ������ �迭 k19_num�� �����ϰ� ��� ������ ������ ��ǰ�� �ش��ϴ� ������ �־��ش�.
		int[] k19_num = { 1, 2, 1, 1, 1,
				1, 1, 1, 1, 1,
				1, 2, 1, 1, 1, 
				1, 3, 1, 1, 1, 
				1, 1, 1, 1, 1, 
				1, 1, 1, 1, 99 };

		//boolean Ÿ�� �迭 k19_taxfree�� �����ϰ� ��� ������ ������ ��ǰ�� �鼼���� �ƴ����� �־��ش�.
		boolean[] k19_taxfree = { false, false, false, false, true,
				false, true, false, true, false, 
				true, true, false, false, true,
				false, false, false, false, false, 
				true, false, false, false, true, 
				false, false, false, false, false };

		double k19_sumTaxfree = 0; //�鼼 ��ǰ�� ���� �հ踦 ���ϴ� �Ǽ��� ���� k19_sumTaxfree�� �����ϰ� 0���� �ʱ�ȭ �Ѵ�.  
		double k19_sum = 0; // ���� ��ǰ�� ����  ���� �հ踦 ���ϴ� �Ǽ��� ���� k19_sum�� �����ϰ� 0���� �ʱ�ȭ �Ѵ�.  
		double k19_taxrate = 10 / 100.0; // ������ ���ϴ� �Ǽ��� ���� k19_taxrate�� �����ϰ�, 10���� ȯ���� ����� ����.
		double k19_tax = 0; //������ ���ϴ� ���� k19_tax�� �����ϰ�, 0���� �ʱ�ȭ
		DecimalFormat k19_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Ŭ������ format �޼ҵ带 ����Ͽ� ���ڸ� �����޸��� ��� ���� k19_df��ü �����Ѵ�.

		Calendar k19_calt = Calendar.getInstance(); // Calender Ŭ������ ��ü k19_calt�� �����ϰ�, getTime()�޼ҵ带 �̿��ؼ� ����ð��� �����´�.
		SimpleDateFormat k19_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // SimpleDateFormat Ŭ������ ��ä k19_sdt�� �����ϰ� ��¥������ ���Ѵ�.

		System.out.printf("%33s\n", "�̸�Ʈ ������ (031)888-1234"); //�̸�Ʈ ������ ��ȭ��ȣ�� ���
		System.out.printf("%7s%21s\n", "emart", "206-86-50913 �̰���"); // ������ ���� ���� ���
		System.out.printf("%28s\n\n", "���ν� ������ ������� 552"); // ���� �ּ� ���
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�(30�ϳ�)"); //������ ��ȯ ȯ�ҿ� ���� �ȳ� ���� ���
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī������)"); //������ ��ȯ ȯ�ҿ� ���� �ȳ� ���� ���
		System.out.printf("%s\n", "üũī��/�ſ�ī�� û����� �ݿ���"); //������ ��ȯ ȯ�ҿ� ���� �ȳ� ���� ���
		System.out.printf("%s\n\n", "�ִ� 3~5�� �ҿ� (�ָ�,����������)"); //������ ��ȯ ȯ�ҿ� ���� �ȳ� ���� ���
		System.out.printf("%s%-21s%s\n", "[�� ��]", k19_sdt.format(k19_calt.getTime()), "POS:0009-2418"); //���� ��¥�� ���� ��ȣ ���
		System.out.printf("------------------------------------------\n"); //��� �μ�
		System.out.printf("%-17s%-6s%-6s%s\n", "   �� ǰ ��", "�� ��", "����", "�� ��"); // "��ǰ��", "�ܰ�", "����", "�ݾ�" ���
		System.out.printf("------------------------------------------\n");
		for (int k19_i = 0; k19_i < k19_itemname.length; k19_i++) { // ������ ���� k19_i�� �����ϰ� 0���� �ʱ�ȭ �Ѵ�. k19_i��  itemname�� ���̱��� 1�� �÷����鼭 for���� ����

			byte[] k19_b = k19_itemname[k19_i].getBytes(); //byteŸ�� �迭 k19_b�� �����ϰ� k19_itemname[k19_i]�� ����Ʈ�� ���Ѵ�.
			String k19_a; //k19_a�� ����

			if (k19_itemname[k19_i].getBytes().length < 14) { // k19_itemname[k19_i]�� ����Ʈ ���̰� 14���� ���� ���
				k19_a = new String(k19_b, 0, k19_itemname[k19_i].getBytes().length); //k19_a�� k19_b���� ���� ����Ʈ�� �̿��ؼ� k19_itemname[k19_i]�� ����Ʈ ���̱��� ���ڿ��� ��ȯ�ؼ� �����Ѵ�.
				while (k19_a.getBytes().length < 14) { // k19_a�� ����Ʈ ���� 14���� ������ while���� ����
					k19_a = k19_a + (" "); //k19_a�� ������ �����ش�. (����Ʈ�� 14�� �ɶ� ����)
				}
			} else { // k19_itemname[k19_i]�� ����Ʈ ���̰� 14���� Ŭ ���
				k19_a = new String(k19_b, 0, 16); // k19_a�� k19_b���� ���� ����Ʈ�� �̿��ؼ� 16 ����Ʈ���� ���ڿ��� ��ȯ�ؼ� �����Ѵ�.
				k19_a = k19_a.substring(0, k19_a.length() - 1); // k19_a�� ������ ���ڸ� �߶��ش�. (14����Ʈ�� ����� ���ؼ�)
			}

			int k19_blank = 20 - k19_a.getBytes().length; //k19_blank�� �����ϰ� 22���� k19_a�� ����Ʈ�� ���� ��ŭ ���ش�. (�ܰ��� ������ �����ϱ� ���ؼ�)
			int k19_blank1 = 18 - k19_a.getBytes().length; //k19_blank1�� �����ϰ� 22���� k19_a�� ����Ʈ�� ���� ��ŭ ���ش�. (�ܰ��� ������ �����ϱ� ���ؼ�)
			int k19_blank2 = 24 - k19_a.getBytes().length; //k19_blank2�� �����ϰ� 23���� k19_a�� ����Ʈ�� ���� ��ŭ ���ش�. (�ܰ��� ������ �����ϱ� ���ؼ�)		

			if (k19_taxfree[k19_i] == true) { // �鼼 ��ǰ�� ���
				if (k19_price.length == 7) { //�ݾ��� �鸸�� �̻��� ��
					//��ǰ��, �ܰ�, ����, �ݾ��� ����ϴµ� ��ǰ�� ���� *�� ������ش�.
					System.out.printf("%02d* %-1s%" + k19_blank + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else if (k19_price[k19_i] >= 10000000) { //�ݾ��� õ���� �̻��� ��
					//��ǰ��, �ܰ�, ����, �ݾ��� ���
					System.out.printf("%02d* %-1s%" + k19_blank1 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else {
					//��ǰ��, �ܰ�, ����, �ݾ��� ���
					System.out.printf("%02d* %-1s%" + k19_blank2 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				}
				k19_sumTaxfree += k19_price[k19_i] * k19_num[k19_i]; //�鼼 ��ǰ�� �� ������ �հ踦 ���Ѵ�.
			} else { //���� ��ǰ�� ���
				if (k19_price.length == 7) { //�ݾ��� �鸸�� �̻��� ��
					//��ǰ��, �ܰ�, ����, �ݾ��� ���
					System.out.printf("%02d  %-1s%" + k19_blank + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else if (k19_price[k19_i] >= 10000000) { //�ݾ��� õ���� �̻��� ��
					//��ǰ��, �ܰ�, ����, �ݾ��� ���
					System.out.printf("%02d* %-1s%" + k19_blank1 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				} else {
					//��ǰ��, �ܰ�, ����, �ݾ��� ���
					System.out.printf("%02d  %-1s%" + k19_blank2 + "s%2d%11s\n", k19_i + 1, k19_a, k19_df.format(k19_price[k19_i]), k19_num[k19_i],
							k19_df.format(k19_price[k19_i] * k19_num[k19_i]));
				}
				k19_sum += k19_price[k19_i] * k19_num[k19_i]; //���� ��ǰ�� �� ������ �հ踦 ���Ѵ�.
			}
		}

		int k19_retPrice = (int) ((k19_sum) * 10 / ((1 + k19_taxrate) * 10)); // ���� ���� k19_retPrice�� �����ϰ����� �ݾ׿��� (1+����)�� ����� ����ؼ�����
		if ((double) k19_retPrice == (int) k19_retPrice) { //�������ݿ�  �����µ� �Ǽ����� �������� ��� ���� ������
			k19_retPrice = k19_retPrice; // ���������� ���������̴�.
		} else { //���� �Ǽ����� �������� ����� ���� ������ 
			k19_retPrice = k19_retPrice + 1; // ���� ���ݿ� 1�� �����ش�.(�ø�ó��)
		}
		k19_tax = k19_sum - k19_retPrice; //���� = �Ѿ� - ��������
		System.out.printf("%-12s%s%14s\n", "", "(*)�� ��  �� ǰ", k19_df.format(k19_sumTaxfree)); //�鼼 ��ǰ ������ �� �հ踦  3�ڸ������� �޸� �� ���
		System.out.printf("%-14s%s%14s\n", "", " �� ��  �� ǰ", k19_df.format(k19_retPrice)); // ���� ��ǰ ������ �� �հ踦  3�ڸ������� �޸� �� ���
		System.out.printf("%-15s%s%14s\n", "", "��   ��   ��", k19_df.format(k19_tax)); // �ΰ�����  3�ڸ������� �޸� �� ����Ѵ�.
		System.out.printf("%-15s%s%14s\n", "", "��        ��", k19_df.format(k19_sum + k19_sumTaxfree)); // ������ǰ�� �鼼��ǰ�� �� �հ踦 ���ؼ�  3�ڸ������� �޸� �� ���
		System.out.printf("%s%24s\n", "�� �� �� �� �� ��", k19_df.format(k19_sum + k19_sumTaxfree)); // ������ǰ�� �鼼��ǰ�� �� �հ踦 ���ؼ�  3�ڸ������� �޸� �� ���
		System.out.printf("------------------------------------------\n");
		System.out.printf("%-1s %-14s %s/%8s\n", "0024", "��  ��", "5417**8890", "07850246"); //ī�� ������ ���
		System.out.printf("%-16s %s / %11s\n", "ī�����", "�Ͻú�", k19_df.format(k19_sum + k19_sumTaxfree)); // ī�� ���� ������ ����Ѵ�. 
		System.out.printf("------------------------------------------\n");

	}

}