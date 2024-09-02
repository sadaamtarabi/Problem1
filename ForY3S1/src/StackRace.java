public class StackRace {
        public static void main(String[] args) {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }

        public static int divide(int a, int b) {
            return a / b;  
        }
    }

