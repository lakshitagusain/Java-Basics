public class Tester {
    public boolean checkTemp(int temp) {
    if (temp > 100) {
    return true;
    } else {
    return false;
    }
    }
    public static void main(String args[]) {
    Tester tester = new Tester();
    if (tester.checkTemp(110)) {
    System.out.println("Data is valid");
    } else {
    System.out.println("Data is invalid");
    }
    }
    }