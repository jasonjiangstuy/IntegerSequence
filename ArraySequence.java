import java.io.Console;
import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int [] other){ 
        data = new int[other.length];
        currentIndex = 0;
        for (int i = 0; i < other.length; i ++){
            data[i] = other[i];
        }

    }
      
//Postcondition: The otherseq will be reset.
//This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq){ 
        otherseq.reset();
        data = new int[otherseq.length()];
        currentIndex = 0;
        while(otherseq.hasNext()){
          data[currentIndex] = otherseq.next();
          currentIndex ++;
        }
        currentIndex = 0;
        otherseq.reset();
     }

    public void reset(){ 
        currentIndex = 0; 
 }
    public int length(){ 
        return data.length; 
    }
    public boolean hasNext(){ 
        return (currentIndex < data.length);
    }

    //@throws NoSuchElementException
    public int next(){  
        if (currentIndex > data.length){
            throw new NoSuchElementException();
        }
        else{
            return data[currentIndex++];
        }
    }
}