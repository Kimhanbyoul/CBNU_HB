class Accident
{

	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
		try
		{
			int Jumsu =Integer.parseInt(args[0]);
			if(Jumsu>100)
			{
				throw new NumberFormatException("점수가 너무 큼");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("========================");
			System.out.println(e.getMessage()+"예외발생");
		}
	}

}
