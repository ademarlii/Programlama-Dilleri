import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        System.out.println("lütfen bir metin giriniz ");
        Scanner scan =new Scanner(System.in);
        String metin=scan.nextLine();

        Gramer gramer =new Gramer();
        gramer.kontrolEt(metin);


    }
}


