import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GeriSayim_2 {
    public static void main(String[] args) {
        LocalTime geriye=LocalTime.now();
        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {
            geriye=geriye.minusSeconds(1);
            MyFunc.Bekle();
            System.out.print("\r" + geriye.format(of1));
        }
    }
}
