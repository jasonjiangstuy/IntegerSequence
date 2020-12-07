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
    }
}
