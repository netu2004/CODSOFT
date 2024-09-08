import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Quiz[] quizzes=new Quiz[]{
           new Quiz("Who is Virat Kohli?",new String[]{"Actor","Cricketer","Businessman"},2),
           new Quiz("What is nickname of Virat Kohli?",new String[]{"Chiku","Mahi","Jaddu"},1),
           new Quiz("For which ipl Franchise does Virat Kohli play?",new String[]{"MI","RR","RCB"},3)
        };
        int totalScore=0;
        for(Quiz quiz:quizzes){
            quiz.askQuestion();
            Timer timer=new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run(){
                    System.out.println("Time's up!");
                }
            },10000);
            int answer=scanner.nextInt();
            quiz.submitAnswer(answer);
            totalScore+=quiz.getScore();
            timer.cancel();
        }
        System.out.println("Final score:"+totalScore+"/"+quizzes.length);
    }
    
}
