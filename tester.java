public class tester {
    public static void main(String[] args) {
        IntegerSequence r = new Range(10,20);
        int count = 0; 
        // check hasNext, check next
        while(r.hasNext()){
            count ++;
            System.out.print(r.next());
            if(r.hasNext() ){       
                System.out.print( ", " );
            }
        }
        // check length
        System.out.println(r.length() == count);
        
        // check reset
        count = 0;
        r.reset();
        while(r.hasNext()){
            count ++;
            System.out.print(r.next());
            if(r.hasNext() ){       
                System.out.print( ", " );
            }
        }
        // System.out.print(r.next());
        //error
        

        System.out.println(r.length() == count);
        System.out.println();

        int[]nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);
    
        System.out.println("ArraySequence(array):");
        while(as.hasNext()){
          System.out.print(as.next()+", ");
        }

        r = new Range(10,20);
        as = new ArraySequence(r);
       
        System.out.println("ArraySequence(seq):");
        while(as.hasNext()){
          System.out.print(as.next()+", ");
        }
        System.out.println();
    }
}
