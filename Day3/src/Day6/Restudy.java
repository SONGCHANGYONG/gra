package Day6;
//Ŭ������ ��������� �޼���� �����ȴ�.
//Ŭ������ �ڷ����̴�. (�뵵)
//*** �迭 :���������� ���ӵ� ������ ������ �ڷ����� �ڷ���� ���ִ°�.

//���ǻ� Ŭ���� A ����

class Student {
   int num;
   String name;
   String phone;
   String gender;// "��" "��"
   int grade;
   float socre;
   public String toString() {
	   
	   return num + "/" + name + "/";	   
   }
   
   //��� ���������� ��� �޼���� �������
   //�⺻ �����ڴ� �����ڰ� �����ص� �ڵ����� ���������.	
}
public class Restudy {

	public static void main(String[] args) {
		//1���α׷��� �� 1����... ��������--> �ڷ���+������ 
		Student stu =new Student(); //()��������� �⺻������.
		        //stu �������� new���پ ��������� ���� ���� �����Ͱ� ���� �ּҸ�����ִ�
		
		
		stu.num =1;
		stu.name = "ȫ�浿";
		stu.phone = "010-1111-1111";
		stu.gender = "��";
		stu.grade =3;
		//System.out.println( stu.num + stu.gender);
		System.out.println( stu.toString());

	}

}
