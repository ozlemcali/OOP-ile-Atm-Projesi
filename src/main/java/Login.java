
import java.util.Scanner;


public class Login {
    
    public boolean login(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        
            System.out.println("Kullanıcı adı: ");
            kullaniciAdi=scanner.nextLine();
            System.out.println("Parola: ");
            parola=scanner.nextLine();
            if(hesap.getIsim().equals(kullaniciAdi) && hesap.getParola().equals(parola))
            {
                return true;
            }
            else
            {
                return false;
            }
        
    }

}
