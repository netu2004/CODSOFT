import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Quiz {
    private String question;
    private String[] opts;
    private int correctAns;
    private int score;
    public Quiz(String question,String[] opts,int correctAns){
        this.question=question;
        this.opts=opts;
        this.correctAns=correctAns;
        this.score=0;
    }
    public void askQuestion(){
        System.out.println(question);
        for(int i=0;i<opts.length;i++){
            System.out.println((i+1)+"."+opts[i]);
        }
    }
    public void submitAnswer(int ans){
        if(ans==correctAns){
            score++;
            System.out.println("Correct Answer");
        }else{
            System.out.println("Incorrect Answer.");
            System.out.println("The correct answer is "+opts[correctAns-1]);
        }
    }
    public int getScore(){
        return score;
    }
    
}
