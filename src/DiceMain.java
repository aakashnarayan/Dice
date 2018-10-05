
public class DiceMain {

	public static void main(String[] args) 
	{
		Dice dice = new Dice();
		int oneRolls = 0;
		int twoRolls = 0;
		int threeRolls = 0;
		int fourRolls = 0;
		int fiveRolls = 0;
		int sixRolls = 0;
		for (int i = 0 ; i < 10; i++) {
			 if (dice.roll() == 1) 
			 {
				 oneRolls++;;
			 }
			 else if (dice.roll() == 2) 
			 {
				 twoRolls++;;
			 }
			 else if (dice.roll() == 3) 
			 {
				 threeRolls++;;
			 }
			 else if (dice.roll() == 4) 
			 {
				 fourRolls++;;
			 }
			 else if (dice.roll() == 5) 
			 {
				 fiveRolls++;;
			 }
			 else 
			 {
				 sixRolls++;;
			 }
		}
		System.out.println("The dice was rolled  10 times.");
		if (oneRolls == 1)
		{
			System.out.println("1 was rolled 1 time.");
		}
		else 
		{
			System.out.println("1 was rolled " + oneRolls + " times.");
		}
		if (twoRolls == 1)
		{
			System.out.println("2 was rolled 1 time.");
		}
		else 
		{
			System.out.println("2 was rolled " + twoRolls + " times.");
		}
		if (threeRolls == 1)
		{
			System.out.println("3 was rolled 1 time.");
		}
		else 
		{
			System.out.println("3 was rolled " + threeRolls + " times.");
		}
		if (fourRolls == 1)
		{
			System.out.println("4 was rolled 1 time.");
		}
		else 
		{
			System.out.println("4 was rolled " + fourRolls + " times.");
		}
		if (fiveRolls == 1)
		{
			System.out.println("5 was rolled 1 time.");
		}
		else 
		{
			System.out.println("5 was rolled " + fiveRolls + " times.");
		}
		if (sixRolls == 1)
		{
			System.out.println("6 was rolled 1 time.");
		}
		else 
		{
			System.out.println("6 was rolled " + sixRolls + " times.");			}
	}

}
