import java.util.*;
public class GuesserGame {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args){
   Umpire u =new Umpire();
    u.CollectingNumberFromGuesser();
    u.CollectingNumberFromPlayer();
    u.Comparison();
    }
   
}

class Guesser{
int GuessNumber(){
    System.out.println("Guesser Please Choose Number between 1 to 100:-");
    return GuesserGame.scan.nextInt();
}
}
class player{
int PredictingNumber(){
 System.out.println("Player Guess a Number:-");
    return GuesserGame.scan.nextInt();
}
}

class Umpire{
int num_from_guesser;
int num_from_playe1;
int num_from_playe2;
int num_from_playe3;

void CollectingNumberFromGuesser(){
Guesser g=new Guesser();
num_from_guesser=g.GuessNumber();
}
void CollectingNumberFromPlayer(){
    player p=new player();
    num_from_playe1=p.PredictingNumber();
    num_from_playe2=p.PredictingNumber();
    num_from_playe3=p.PredictingNumber();
}
void Comparison(){
if(num_from_guesser>0 && num_from_guesser<=100){
if(num_from_guesser==num_from_playe1){
System.out.println("WoW player-1 is winner");
}
else if(num_from_guesser==num_from_playe2){
System.out.println("WoW player-2 is winner");

}
else if(num_from_guesser==num_from_playe3){
System.out.println("WoW player-3 is winner");
}
else{
System.out.println("==--Try next time no one winner--==");
}
}
else{
    System.out.println("Input Constraints Not matched Try to input numbers Between 1 to 100");
}

}
}
