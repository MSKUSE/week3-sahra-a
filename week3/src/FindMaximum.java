public class FindMaximum {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        boolean condition = number1 > number2;
        int max = condition ? number1 : number2;
        System.out.println(max);
    }
}

//        if (number1<number2){
//            System.out.println("max number is:"+ number2);
//        }
//        else
//            System.out.println("max number is: "+ number1);
//    }

