package ��Ŀ�汾����;
import java.util.*;

public class ParkingSystem implements IParking {
	int []count=new int[3];
	//���С�С��ͣ��λ������
	ParkingSystem(Integer big,Integer medium,Integer small){
		count[0]=big;
		count[1]=medium;
		count[2]=small;
	}
	//�ж����������carType����Ӧ�ĳ�λ��1�Ŵ���󳵣�2�Ŵ����г���3�Ŵ���С����
	@Override
	public boolean addCar(Integer carType) {
		if(carType==1)
			return count[0]>0;
		else if(carType==2)
			return count[1]>0;
		else if(carType==3)
			return count[2]>0;
		return false;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("��������С�С������Ӧ��ͣ����");
		ParkingSystem ps = new ParkingSystem(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.println("��������Ҫͣ���Ķ�Ӧ��");
		Integer carType=in.nextInt();
		System.out.println("�Ƿ���ͣ��λ:"+ps.addCar(carType));
		in.close();
		System.out.println("����һ��С����");
	}
}
