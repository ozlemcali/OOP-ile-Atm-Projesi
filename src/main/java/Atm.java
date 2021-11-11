
import java.util.Scanner;


public class Atm {
    public void calis(Hesap hesap){
        Login login =new Login();
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************");
        int girisHakki = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Kullanıcı girişi başarılı! Giriş yapıldı'.");
                break;
            }
            else{
                System.out.println("Kullanıcı adı veya parola hatalı!");
                girisHakki-=1;
                System.out.println("Kalan giriş hakkı"+ girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giriş hakkınız bitti!");
                return;
            }
        }
        
        
        System.out.println("****************************");
        String islemler="1.Bakiye Görüntüle \n"+
                        "2.Para Yatırma \n" + 
                        "3.Para Çekme  \n" + 
                        "4.Çıkış için q'ya basın!";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");

        while(true){
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yapıldı!");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                hesap.paraYatir();
            }
            else if(islem.equals("3")){
                hesap.paraCek();
            }
            else{
                System.out.println("Geçersiz işlem!");
            }
            }
        
        
        
    }
}
