


    abstract class Bike {  // Abstract class
        abstract void run();  // Abstract method
    }

    class Honda4 extends Bike {
        void run() {
            System.out.println("running safely");
        }

        public static void main(String args[]) {
            Bike obj = new Honda4();
            obj.run();
        }
    }

