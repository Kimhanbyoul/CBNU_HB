package hanbyoul;

public class Main {
	public static void main(String[] args) {
		Terran marine =new Terran();
		marine.attack();
		Protoss dragoon =new Protoss();
		dragoon.attack();
		Zerg hydralisk = new Zerg();
		hydralist.attack();
		System.out.println("====��ü ����ȯ�� �������̵��� �̿�====");
		Starcraft obj =new Terran();
		
		obj.attack();		//shot �޼ҵ� ȣ��
		obj =new Protoss();
		obj.attack();		//shot �޼ҵ� ȣ��
		obj =new Zerg();
		obj.attack();		//shot �޼ҵ� ȣ��
		
		/* 	error
		obj=new Starcraft();
		obj.shot();
		*/
	}

}
