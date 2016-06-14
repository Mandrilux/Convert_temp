import java.util.Scanner;
public class tp
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int	i;
	double	temp;
	double	result;
	char	stop;
	String	tmp;
	
	System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
	System.out.println("-------------------------------------------------");
	do{
	    do{
		System.out.println("Choisissez le mode de conversion");
		System.out.println("1 - Convertisseur Celsius - Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit - Celsus");
		i = sc.nextInt();
		if (i != 1 && i != 2)
		    System.out.println("Mode inconnue, veuillez réitérer votre choix.");
	    }while(i <= 0 || i > 2);
	    System.out.println("Température à convertir :");
	    temp = sc.nextDouble();
	    if (i == 1)
		{
		    result = (temp * 1.8) + 32;
		    System.out.println(temp+ " °C correspond à : "+arrondi(result, 2)+" °F.");
		}
	    else
		{
		    result = ((temp -32) * 5) / 9;
		    System.out.println(temp+ " °F correspond à : "+arrondi(result, 2)+" °C.");
		}
	    do{
		System.out.println("Souhaitez vous convertir une autre température ? (0/N)");
		sc.nextLine();
		tmp = sc.nextLine();
		if (tmp.length() != 0)
		    {
			tmp = tmp.toLowerCase();
			stop = tmp.charAt(0);
		    }
		else
		    stop = ' ';
	    } while (stop != 'o' && stop != 'n');
	}while (stop == 'o');
	System.out.println("Au revoir");
    }

    public static double arrondi(double A, int B)
    {
	return (double) ( (int)(A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
