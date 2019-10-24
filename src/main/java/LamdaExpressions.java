public class LamdaExpressions {

//    public static void main(String[] args) {
//
//        List<Integer> myLList = Arrays.asList(1,2,3,4,5,6);
//
////        myLList.forEach(new Consumer<Integer>() {
////            @Override
////            public void accept(Integer integer) {
////                System.out.println(integer  );
////            }
////        });
////        myLList.forEach(value -> System.out.println(value));
//        myLList.forEach(System.out::println);
//        myLList.stream()
//                .map(e -> String.valueOf(e))
//                .map(String::toString)
//                .forEach(System.out::println);
//        System.out.println(
//                myLList.stream()
////                .reduce (0 , (total,e) -> Integer.sum(total,e))
//                        .map(String::valueOf)
//                        .reduce("", String::concat));
////                 .reduce(0,Integer::sum));
//        System.out.println(
//                myLList.stream()
//                        .filter(e -> e %2 ==0)
//                        .map(e -> e*2)
//                        .reduce(0,Integer::sum)
//                //.mapToInt(e ->e*2)
//        );
////::static method refrerence to an instance method (when you use .
////        reference to static method e is a parameter , parameter can be an object e. or argument
////        SpringApplication.run(SpringExample.class , args);
//
//
//    }
//    public static int compute(int number){
//        try {
//            Thread.sleep(1000);
//        }catch (Exception ex){}
//        return number*2;
//    }
}
