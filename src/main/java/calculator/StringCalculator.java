package calculator;

class StringCalculator {

   public int add(String input) {
		// TODO Auto-generated method stub
		if(input.isEmpty())
		{
		return 0;
		}
		else if(input.contains(","))
		{
			String[] t=input.split(",");
			return Integer.parseInt(t[0])+Integer.parseInt(t[1]);
		}
		else {
			return Integer.parseInt(input);
		}
	}
	private  int toInt(String input)throws NumberFormatException
	{
		return Integer.parseInt(input);
	}

}