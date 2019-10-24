import java.util.concurrent.*;

public class IntegerCaluculator<executor> {

    private ExecutorService executor = Executors.newSingleThreadExecutor();
    Runnable runnableTask = () -> {
        try {
            TimeUnit.MICROSECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };


    public Future<Integer> calculate(Integer input) {
        ExecutorService executor = this.executor;
        return executor.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }

    Callable<String> callableTask = () -> {
        TimeUnit.MILLISECONDS.sleep(300);
        return "Task's execution";
    };
    Future<String> future =
            executor.submit(callableTask);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<Integer> future = new IntegerCaluculator<>().calculate(10);

        while (!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(300);
        }

        Integer result = future.get();
    }
}
