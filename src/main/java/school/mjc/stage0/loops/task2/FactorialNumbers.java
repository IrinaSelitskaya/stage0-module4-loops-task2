package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
     int counter=0;
     int factorial=1;
     while(counter<=printToInclusive){
      int x=counter;
      while(x>=1){
       factorial*=x;
       x--;}
      System.out.println(factorial);
      counter++;
      factorial=1;}
    }
}
