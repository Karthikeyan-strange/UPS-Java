
class First extends Thread {
    public void run() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Object 1:");
    }
}

class Second extends Thread {
    First obj1;

    Second(First obj1) {
        this.obj1 = obj1;
    }

    public void run() {
        System.out.println("Object 2:");

        synchronized (obj1) {
            obj1.notify();
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second(obj1);

        obj1.start();
        obj2.start();
    }
}
