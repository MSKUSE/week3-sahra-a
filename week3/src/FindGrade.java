public class FindGrade {

    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);
        if (score <= 59) {
            System.out.println("your grade is: F " + "your score is:" + score);
        } else if (score >= 60 && score < 70) {
            System.out.println("your grade is: D");

        } else if (score >= 70 && score < 80) {
            System.out.println("your grade is : C");
        } else if (score >= 80 && score < 90) {
            System.out.println("your grade is : B ");
        } else if (score > 89 && score <= 100) {
            System.out.println("your grade is : A");
        }


        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F


    }


}