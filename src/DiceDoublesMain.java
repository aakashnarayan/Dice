
public class DiceDoublesMain {

	public static void main(String[] args) 
	{	
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int numRolls = 0;
		
		while (roll1 != roll2)
		{
			numRolls++;
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			System.out.println(roll1 + " " + roll2);
		}
		if (numRolls == 0)
		{	
		
		}
		if(numRolls == 1)
		{
				System.out.println("You have rolled two " + roll1 +"s! \nIt took " + " roll to roll doubles.");
		}

		else
		{
			System.out.println("You have rolled two " + roll1 +"s! \nIt took " + numRolls + " rolls to roll doubles.");
		}
	}
	
}
