package ua.lviv.lgs.t2;

public class Change_dash {
	
	public static void main(String[] args) {
		
		StringBuffer text = new StringBuffer("�������� ��������, ��� ���� ���������, �� � ����� � �'��� ����, ������� ������������,\r\n" + 
				"\r\n" + 
				"���������� (��������: ������, ������). ���� ������� ����� �� � 5 ����, ��\r\n" + 
				"\r\n" + 
				"���������� ��� �������. �������� ������� ��������� ��������� �����, ����� ���� �\r\n" + 
				"\r\n" + 
				"����� ���������� ������� ������ �������. ���������, ����� ������ ��� �����л ���\r\n" + 
				"\r\n" + 
				"����� ������� �����������.");
		
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			
			switch (letter) {
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					
					text.replace(i, i+1, "-");
					
					break;
				default:
					break;
			}
		}
		
		System.out.println(text);
	}
	
	
}
