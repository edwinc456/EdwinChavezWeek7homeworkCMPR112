import java.util.Scanner;

public class rockpaper 
{
public static void main(String[]args)
{
	boolean correct;
	int computernum;
	int num2;
	int user;
	int computer;
	int tie;
	int game;
	Scanner input = new Scanner(System.in);
	int counter=0;
	game=0;
	user=0;
	
	computer=0;
	tie=0;
	
	
	do
	{
		
		correct = false;
		
		System.out.println("Pick 1 for rock, 2 paper, 3 for scissors: ");	
			num2 = input.nextInt();
			computernum = 1 + (int)(Math.random()*3);
		if(num2 == computernum)
			correct = true;
		if(correct)
		{
			
			System.out.printf("This match has been a draw! both of you selected %d \n" , computernum);
			tie= tie +1;
			
		}
		
		else if ((computernum==1 && num2==2) || (computernum==2 && num2==3) || (computernum==3 && num2==1))
			{
			System.out.printf("Congratulations you win! The computer picked %d\n ", computernum);
			user= user+1;
			
			}
		
		else if((computernum==2 && num2==1) ||(computernum==3 && num2==2) || (computernum==1 && num2==3))
		{
			System.out.printf("Im sorry but you lose. The computer chose %d\n", computernum);
			computer=computer+1;
			
		}	
		 game= game+1;
		
		counter ++;
		System.out.printf("Game:%d Score: user= %d    computer=%d   tie= %d \n\n ", game, user, computer, tie );
	}
	
	while(counter<3);
}
}