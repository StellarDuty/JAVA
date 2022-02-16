package chap02;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector (5); //�뷮(capcity) 5�� ���ͻ���
		v.add("1");  //���ھƴϰ� ���ڴ�\
		
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); //(����� ���ش�. �뷮��ũ�� ������)
		System.out.println("======After trimToSize()");
		print(v);
		
		v.ensureCapacity(6); //(�뷮�� �ּ��� 6�� �ǵ����Ѵ�)
		System.out.println("======After ensureCapacity(6)");
		
		v.setSize(7);//ũ�⸦ 7���Ѵ� --> �뷮 ���ڶ�-->���ʹ� �ڵ������� ����ũ��(6)�� �ι�� ����
		System.out.println("======After setSize(7)");
		print(v);
		
		v.clear();//��� ��� ����-->ũ�� 0/�뷮�� 6�� 2���� 12
		System.out.println("======After clear()");
		print(v);	
	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: "+v.size());
		System.out.println("capacity : "+ v.capacity());
	}

}