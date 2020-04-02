package task_011;

import java.util.List;

public class Create {
	public int createData(List<Employee> list,int id, int tall, int weight,String enName, String name, String phone, String email, float bmi){
		list.add(new Employee(id, tall, weight, enName,name,phone,email,bmi));
		return list.size();
	}
}
