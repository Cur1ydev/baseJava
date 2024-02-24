import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

 class Helloworld{
    //    public abstract void hehe();
//
//    public static String name = "Pham Loi";
//    private Boolean status;
//
//    public void abc() {
//        System.out.println();
//    }
//
//    static void hello() {
//        System.out.println("Loixoan");
//    }
    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()));;
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
////         Day day = Day.SUNDAY;
//        for (Day day: Day.values()){
//            System.out.println(day);
//        }
//        System.out.println(1);
//        System.out.println(day);
//        Helloworld hl = new Helloworld(10);
//        System.out.println(hl.cal());
//        System.out.println(cal(7, 5));
//        cal(1,5);
//        System.out.println(TestInterface.x);


    }
}

//interface SMAL {
//     public int x = 10;
//}
//public class xyz implements SMAL {
//
//}
//interface kaka {
//    public void hihi();
//    public void huhu();
//}
//
//class hehe extends Helloworld implements kaka{
//    @Override
//    public void hehe() {
//        System.out.println("hehe cai choa gi");
//    }
//
//    @Override
//    public void hihi() {
//        System.out.println("hihi cai choa gi");
//    }
//
//    @Override
//    public void huhu() {
//        System.out.println("huhu cai choa gi");
//    }
//
//    public static void main(String[] args) {
//        hehe a = new hehe();
//        a.hehe();
//        a.hihi();
//        a.huhu();
//    }
//}

