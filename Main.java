import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray list = new ListArray(); 
		Scanner comScan = new Scanner (System.in);
		String commandHole= getCom(comScan);
		switch(commandHole)
		{
		case "+" :
		{
			comScan.reset();
			System.out.println("Please enter an item to be inserted");
			String item = comScan.nextLine();
			list.insert(item);
			
			break;
		}
		case "-" :
		{
			list.delete();
			break;
		}
		case "=" :
		{
			comScan.reset();
			System.out.println("Please enter the item to be replaced");
			String item = comScan.nextLine();
			list.replace(item);
			break;
		}
		case "?" :
		{
			
			break;
		}
		case "@" :
		{
			
			break;
		}
		case "n" :
		{
			
			break;
		}
		case "m" :
		{
			
			break;
		}
		case "c" :
		{
			
			break;
		}
		case "<" :
		{
			
			break;
		}
		case ">" :
		{
			
			break;
		}
		case "q" :
		{
			
			break;
		}
		
		}
		
		
		ListArray List = new ListArray();
		List.insert(new Integer (2));
		List.insert(new Integer (3));
		List.insert(new Integer (69));
		List.insert(new Integer (5));
		List.goTobegin();
		List.goToNext();
		List.goToNext();
		List.showStruct();
	}
	public static String getCom(Scanner scan)
	{
		boolean validChoice= false;
		scan.reset();
		String[] rightChoice= {"+","-","=","?","@","n","m","p","<",">","c","q"};
		System.out.println("+ - = ? @ n m p < > c q ");
		String command = "";
		do 
		{
			System.out.println("Please enter a command: ");
			command = scan.nextLine();
			for (int i = 0; i < rightChoice.length; i++)
			{
				if (rightChoice[i].equals(command))
				{
					validChoice = true;
					break;
				}
			}
			
		}while (!validChoice);
		//scan.close();
		return command;
	}

}
