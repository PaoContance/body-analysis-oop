package b6071028;

public class Shape {
	private String shape;
	private String rec;

	public void calShape(double bmi) {
		if (bmi < 18.50) {
			shape = "����Թ�";
			rec = "���˹ѡ���¡��һ��ԡ������´� �ҡ�س�٧�ҡ����˹ѡ�����Թ� �Ҩ����§��͡�����Ѻ�������������§������\n\t���Ѻ��ѧ�ҹ�����§�� �觼������ҧ�����͹���§��� ����Ѻ��зҹ����������§�� ��С���͡���ѧ���\n\t������������ҧ�������������ö����������� BMI ��������ࡳ�컡����";
		} else if (bmi >= 18.50 && bmi < 23) {
			shape = "���˹ѡ���� ����ǹ";
			rec ="���˹ѡ��������������Ѻ���¤�ͤ�� BMI �����ҧ 18.5-22.9 �Ѵ�����ࡳ�컡�� ��ҧ���ä����Դ�ҡ������ǹ\n\t����դ�������§��͡���Դ�ä��ҧ � ���·���ش ��þ������ѡ���дѺ��� BMI ���������дѺ������ҹ����ش";
		}  else if (bmi >= 23 && bmi < 25) {
			shape = "���˹ѡ�Թ";
			rec ="�������ա�Դ����Ŵ���˹ѡ������������ҵðҹ ���Ф�� BMI 㹪�ǧ����ѧ�������繡����������դ�����ǹ�����ҧ\n\t��������������ǹ ���ҡ����ѵԤ�㹤�ͺ���������ä����ҹ��Ф����ѹ���Ե�٧ ��������ѧ�դ�������§�ҡ���Ҥ�����";
		}else if (bmi >= 25 && bmi < 30) {
			shape = "�������ǹ���ǹ�";
			rec ="�س��ǹ��дѺ˹�� �֧�������֧ࡳ�����������ǹ�ҡ � ����ѧ�դ�������§��͡���Դ�ä����ҡѺ������ǹ���蹡ѹ\n\t����ä����ҹ ��Ф����ѹ���Ե�٧";
		} else if (bmi >= 30) {
			shape = "��ǹ�ҡ";
			rec ="��͹��ҧ�ѹ���� �������ࡳ����ǹ�ҡ ����§��͡���Դ�ä�����ç���ὧ�ҡѺ������ǹ �ҡ��� BMI ������дѺ���\n\t�е�ͧ���ѧ����Ѻ��зҹ��ѹ ��Ф���͡���ѧ������ҧ�������� ����ҡ�Ţ����٧���� 40.0 ����ʴ��֧������ǹ����ҡ���";
		}
	}

	public String getShape() {
		return shape;
	}

	public String getRecommend() {
		return rec;
	}
}