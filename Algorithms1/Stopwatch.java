public class Stopwathc{
  
  public Stopwatch(){
    start  = System.currentTimeMillis();
  }
  public double elapsedTime(){
    long now = System.currentTimeMillis();
    return(now-start) / 1000.0;
  }
}
public static void main(String[] args){
  int [] a = In.readInts(args[0]);
  Stopwatch stopwatch = new Stopwatch();
  System.out.println(ThreeSum.count(a));
  double time= stopwatch.elapsedTime();
}
