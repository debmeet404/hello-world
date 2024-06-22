public class Test {
    public static void main(String[] args) {
        
        Integer x1 = 1000, x2 = 1000;

        if (x1 == x2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        /*
        Java caches some literals. The above program should logically output not same as they are references, but sometimes it outputs same as well!
        */
        
    }
}