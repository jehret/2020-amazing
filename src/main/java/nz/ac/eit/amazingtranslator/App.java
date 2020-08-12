package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        //finish it
        List<String> germanTranslation=new ArrayList<>();
        germanTranslation.add("Eiz");
        germanTranslation.add("Zwei");
        germanTranslation.add("Drei");
        //finish it
        germanTranslation.add("Dreiβig");

        System.out.println( "What is the number to translate?" );
        Scanner scanner=new Scanner(System.in);

        String numberAsString=scanner.nextLine();
        Integer number = null;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        }
        catch (NumberFormatException nfe){
            System.out.println("The number has to be a numeric");
            System.exit(0);
        }

        System.out.println( "What is the language to be used (1-French, 2-German)?" );
        String optionAsString=scanner.nextLine();
        Integer option=null;
        try {
            option = Integer.parseInt(optionAsString);
            System.out.println(option);
        }
        catch (NumberFormatException nfe){
            System.out.println("Available options are numeric");
            System.exit(0);
        }

        //Check that the option is 1 or 2
        if (option==1){
            System.out.println(frenchTranslations.get(number-1));
        }
        else if(option==2){
            System.out.println(germanTranslation.get(number-1));
        }
        else {
            System.out.println("Only french or german");
        }


    }
}
