package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
     int counter=2;
     int divisor=2;
     int divisorsSum=0;
     while(counter<=printToInclusive){
      while(divisor<=counter){
       if(counter%divisor==0){
        divisorsSum++;} 
       divisor++;} 
     if(divisorsSum==1){
      System.out.println(counter);} 
     counter++;
     divisorsSum=0;
     divisor=2;}   
    }
}
