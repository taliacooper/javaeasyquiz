import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {

        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        Question quiz = new Question();

        //ask every question
        //fill array w every answer

        for (int i = 0; i < quiz.q.length; i++) {
            System.out.println(quiz.q[i]);
            String answer = keyboardInput.nextLine();
            if (answer.equals(quiz.a[i])) {
                score ++;
            }



            //compute/show score
        }
        System.out.println("You scored " + score + "/" + quiz.q.length + "!");

    }
}
