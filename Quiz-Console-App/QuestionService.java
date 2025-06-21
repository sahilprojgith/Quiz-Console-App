import java.util.Scanner;

public class QuestionService {
  
  Question[] questions = new Question[5];
  String selection[] = new String[5];



  public QuestionService(){ // use reference variable not 
     questions[0] = new Question(1, "Size of int?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of float?", "2", "4", "8", "6", "4");
        questions[2] = new Question(3, "Size of double?", "2", "4", "6", "8", "8");
        questions[3] = new Question(4, "Default value of int?", "0", "1", "null", "-1", "0");
        questions[4] = new Question(5, "Who invented Java?", "Dennis Ritchie", "James Gosling", "Guido van Rossum", "Bjarne Stroustrup", "James Gosling");
  }

  public  void playQuiz(){

    Scanner scanner = new Scanner(System.in);
    // when  array is filled use enhanced for loop
   int i =0;
    for(Question q : questions){
     System.out.println("Question " + q.getId() + ": " + q.getQuestion());
    System.out.println("A. " + q.getOpt1());
    System.out.println("B. " + q.getOpt2());
    System.out.println("C. " + q.getOpt3());
    System.out.println("D. " + q.getOpt4());

    System.out.print("Your answer: ");
    selection[i] = scanner.nextLine();
    i++;
  }
  scanner.close();

  System.out.println("\nYour Answers:");
    for (String s : selection) {
        System.out.println(s);
    }

  }

  // Score
    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i]; // go through each question

            String answer = que.getAnswer(); //stores the correct answer for the current question in the answer variable

            String userAnswer = selection[i]; // This gets the answer the user typed for the same question from the selection[] array

            if (answer.equals(userAnswer)) { // getAnswer stored in String answer above.

                score++; // score increments if matches the useranswer

            }

        }

        System.out.println("Your score is : " + score + "/5 ");
    }
}
