package ThrowException;

//  Продемонстрировать  применение  оператора  qow
public class Main {
    static void demoproc() {
        try {
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException e) {
            System.out.println("Исключение  перехвачено  в  теле  метода  demoproc ().");
            throw e;  // повторно  сгенерировать  исключение
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пoвтopно  перехват:  " + e);
        }
    }
}




