public class Main {
    public static void main(String[] args) {
        // Set the global exception handler
        /// for handle un-caught exceptions
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());

        // Simulate an uncaught exception
//        throw new GlobalException("This is a global exception.");


        try {
//            int x = 3 / 0;
            String s = "";
            s.charAt(5);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("RunTime");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}