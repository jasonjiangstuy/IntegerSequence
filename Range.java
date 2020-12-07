import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
        if (start > end){
            throw new IllegalArgumentException("stop");
        }
        // else{
            this.start = start;
            this.end = end;
            current = 0; 
        // }

    }
  public void reset(){ 
      current = 0; 
   }
  public int length(){ 
      return end - start + 1; 
   }
  public boolean hasNext(){ 
      return (start + current <= end);
   }

  //@throws NoSuchElementException
  public int next(){  
      if (start + current > end){
        throw new NoSuchElementException();
      }
      else{
        current ++;
        return start + current - 1;
      }
    }
  
}