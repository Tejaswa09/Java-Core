public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("main started");
        method1();
        System.out.println("main ended");
    }

    private static void method1() throws NullPointerException{
        System.out.println("method1 started");
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() {
       try {
           System.out.println("method 2 started");
           method3();
           System.out.println("method 2 ended");
       }catch (NullPointerException e){
           e.printStackTrace();
       }
    }

    private static void method3() throws  NullPointerException{
        System.out.println("method 3 started");
        String str= null;
        System.out.println(str.length());
        System.out.println("method 3 ended");
    }


}
