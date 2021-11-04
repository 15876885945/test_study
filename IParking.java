package 项目版本管理;

public interface IParking {
	//检查是否有 carType 对应的停车位、如果没有空车位，请返回 false ，否则将该车停入车位并返回 true
	public boolean addCar(Integer carType);
}