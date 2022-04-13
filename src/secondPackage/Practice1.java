package secondPackage;

/**
 *  写一个科目类，有“name”这个属性
 *  写一个学生类，有姓名，年龄，科目三个属性
 *  在不修改main方法TDOO以外的内容的基础上使得main方法能顺利实现
 *  要求：属性封装
 */
public class Practice1 {

	public static void main(String[] args) {
		
		Student1[] students = new Student1[4];
		students[0] = new Student1("TODO",21,"Java");
		students[1] = new Student1("TODO",22,"Java");
		students[2] = new Student1("TODO",23,"Python");
		students[3] = new Student1("TODO",24,"Python");
		
		for (Student1 student : students) {
			System.out.println(student);
			// 学生：TODO，年龄：21，所选科目：“Java”
		}
		
	}
}

class Subject1{
	
}

class Student1{
	
}



