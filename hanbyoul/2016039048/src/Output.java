
interface Starcrafft
{
	void attack(String s);
}
class Terran implements Starcraft
{
	public void attack(String s)
	{
		System.out.println("Terran�� "+s+"Attack");
	}
}

class Protoss implements Starcraft
{
	public void attack (String s)
	{
		System.out.println("Protoss��"+s+"Attack");
	}
}

class Zerg implements Starcraft
{
	public void attack(String s)
	{
		System.out.println("Zerg��"+s+"Attack");
	}
}
calss Output
{
	
	public static void main(String args) 
	{
		Starcraft obj;
		obj = new Terran();
		obj.attack("����");
		obj = new Protoss();
		obj.attack("���");
		obj = new Zerg();
		obj.attack("����󸮽�ũ");
	}
}
