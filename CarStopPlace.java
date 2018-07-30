package icitic.com.cn.car;

public class CarStopPlace {
	private String INCARTYPE = "InCar";
	private int maxNum; // ͣ�����������
	private int stopNum; // ��ǰͣ������

	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public int getStopNum() {
		return stopNum;
	}

	public void setStopNum(int stopNum) {
		this.stopNum = stopNum;
	}

	public CarStopPlace(int maxNum, int stopNum) {
		this.maxNum = maxNum;
		this.stopNum = stopNum;
	}

	public String carStopPlaceNum(String type) {
		int num1 = maxNum;
		int num2 = stopNum;
		
		if (INCARTYPE.equals(type)) {
			if (num1 <= num2) {
				return "ͣ��λ����";
			} else {
				stopNum += 1;
				return "ͣ���ɹ�";
			}
		} else {
			if (num2 > 0) {
				stopNum -= 1;
				return "ȡ���ɹ�";
			} else {
				return "ȡ��ʧ��";
			}
		}

	}

}
