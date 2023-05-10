import java.time.LocalTime;

public class GeriSaydirma {
    public static void main(String[] args) {
      int saat, dakika, saniye;
        LocalTime saatim = LocalTime.now();
        saat = saatim.getHour();
        dakika = saatim.getMinute();
        saniye = saatim.getSecond();
        while (true) {
            saniye--;
            if(saniye<1)
            {
                dakika--;
                saniye=59;
            }
            if (dakika<1)
            {
                saat--;
                dakika=59;
            }
            if (saat<1)    saat=23;
            System.out.print("\rsaat : "+saat+":"+dakika+":"+saniye);
            MyFunc.Bekle();
        }
    }
}
