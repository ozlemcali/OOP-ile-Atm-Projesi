
import java.util.Scanner;


public class Hesap {
    private String isim;
    private String parola;
    private int bakiye;

    public Hesap(String isim,String parola, int bakiye) {
        this.isim = isim;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

   

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen yatırmak istediğiniz miktarı girin:");
        int yatirilacakMiktar=scanner.nextInt();
        bakiye+=yatirilacakMiktar;
        
        System.out.println("Yeni bakiyeniz:" + bakiye);
        
    }
    
    public void paraCek(){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen çekmek istediğiniz miktarı girin:");
        int cekilecekMiktar=scanner.nextInt();
      
        if(bakiye>0)
        {
         bakiye-=cekilecekMiktar;
         
        System.out.println("Yeni bakiyeniz:" + bakiye);
        }
        else
        {
            System.out.println("Yeterli bakiyeniz yok!");
        }
    }
    
}