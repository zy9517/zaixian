public class PrintString {
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final Object lock = new Object();
    private static final int targetNum = 84;
    private static volatile String nowString = A;
    private static volatile int num = 2;
    private static volatile int nowNum = 0;

    public static void main(String[] args) {
        Thread tA = new Thread(() -> {
            print(A);
        });
        Thread tB = new Thread(() -> {
            print(B);
        });
        Thread tC = new Thread(() -> {
            print(C);
        });
        tA.start();
        tB.start();
        tC.start();
    }

    private final static void print(String type) {
        while (true) {
            synchronized (lock) {
                if (nowNum < targetNum) {
                    if (!type.equals(nowString)) {
                        lock.notifyAll();
                        continue;
                    }
                    if (nowNum >= targetNum) {
                        lock.notifyAll();
                        continue;
                    }
                    if (nowNum + num > targetNum) {
                        num = targetNum - nowNum;
                    }
                    if (C.equals(type)) {
                        for (int i = 0; i <= num; i++) {
                            System.out.print(nowString);
                        }
                        nowNum = nowNum + num + 1;
                    } else {
                        for (int i = 0; i < num; i++) {
                            System.out.print(nowString);
                        }
                        nowNum += num;
                    }

                    if (nowNum % 7 == 0) {
                        System.out.println();
                    }
                    switch (type) {
                        case A:
                            nowString = B;
                            break;
                        case B:
                            nowString = C;
                            break;
                        case C:
                            nowString = A;
                            break;
                        default:
                            nowString = A;
                            break;
                    }
                    lock.notifyAll();
                } else {
                    lock.notifyAll();
                    break;
                }
            }
        }
    }

}