package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
     power=12;
     int i=0;
     int result=1;
     System.out.println((int)Math.pow(2,0));
     while(i<power){
      result*=2;
      if(result>=0){
       System.out.println(result);
      }else{
       System.out.println("too much power");
      }
      i++;} 
    }
}
