package BTTH1;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng thực thi
        EvenRunnable evenTask = new EvenRunnable();
        OddRunnable oddTask = new OddRunnable();

                Thread t1 = new Thread(evenTask);
        Thread t2 = new Thread(oddTask);

        // Khởi chạy
        t1.start();
        t2.start();

        // Thông báo từ luồng chính
        System.out.println(">>> Thread chính kết thúc <<<");
    }
}
