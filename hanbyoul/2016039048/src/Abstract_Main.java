package hanbyoul;

public class Main {
	public static void main(String[] args) {
		Terran marine =new Terran();
		marine.attack();
		Protoss dragoon =new Protoss();
		dragoon.attack();
		Zerg hydralisk = new Zerg();
		hydralist.attack();
		System.out.println("====객체 형변환과 오버라이딩을 이용====");
		Starcraft obj =new Terran();
		
		obj.attack();		//shot 메소드 호출
		obj =new Protoss();
		obj.attack();		//shot 메소드 호출
		obj =new Zerg();
		obj.attack();		//shot 메소드 호출
		
		/* 	error
		obj=new Starcraft();
		obj.shot();
		*/
	}

}
