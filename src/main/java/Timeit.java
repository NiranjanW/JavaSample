
public class Timeit {

    public static void code(Runnable block) {

        long start = System.nanoTime();
        try {
            block.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken" + (start - end) / 1.0e9);
        }
    }

}
