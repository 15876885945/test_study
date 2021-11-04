package 项目版本管理;
import java.util.*;

public class ParkingSystem implements IParking {
	int []count=new int[3];
	//大、中、小车停车位的数量
	ParkingSystem(Integer big,Integer medium,Integer small){
		count[0]=big;
		count[1]=medium;
		count[2]=small;
	}
	//判断有无输入的carType所对应的车位（1号代表大车，2号代表中车，3号代表小车）
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
		System.out.println("请输入大、中、小车所对应的停车量");
		ParkingSystem ps = new ParkingSystem(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.println("请输入需要停车的对应号");
		Integer carType=in.nextInt();
		System.out.println("是否还有停车位:"+ps.addCar(carType));
		in.close();
	}
}
