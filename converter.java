import java.util.Scanner;

class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double toConvert, convert=0;
    char response=' ', mode = ' ';

    System.out.println("Converter celsius and farhenheit");
    
    do{
       
      do{
        mode = ' ';
        System.out.println("Choose the conversion mode : ");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius ");
        System.out.println("3 - Exit ");
        mode = sc.nextLine().charAt(0);
       
        if(mode != '1' && mode != '2' && mode != '3')
          System.out.println("Unknown mode, please repeat your choice.");

      }while (mode != '1' && mode != '2' && mode != '3');
      toConvert = ' ';
      if(mode == '1' || mode == '2') {
    	  System.out.println("Temperature to convert :");
          toConvert = sc.nextDouble();
          sc.nextLine();
      }
     
      if(mode == '1'){
        convert = ((9.0/5.0) * toConvert) + 32.0;
        System.out.print(toConvert + " °C correspond to : ");
        System.out.println(round(convert, 2) + " °F.");
      }
      if (mode == '2')
      {
        convert = ((toConvert - 32) * 5) / 9;
        System.out.print(toConvert + " °F correspond to : ");
        System.out.println(round(convert, 2) + " °C.");
      }
      if (mode == '3')
      {
    	  break;
      }
      do{       
        System.out.println("Do you want to convert another temperature ?(O/N)");
        response = sc.nextLine().charAt(0);
       
      }while(response != 'O' && response != 'N');
     
    }while(response == 'O');
    
  System.out.println("Goodbye !");
    
  }
    
  public static double round(double A, int B) {
    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
  } 
}