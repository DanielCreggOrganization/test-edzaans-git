package ie.gmit.labweek2;

class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            myMethod();
            myMethod2();
        }
    }

    public static void myMethod() {
        System.out.println("I just got executed");
    }
     public static void myMethod2() {
        System.out.println("I just got executed again");
}
