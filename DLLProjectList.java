public class DLLProjectList implements ProjectList<DLLNode> {
    public static void main(String args[]){

        System.out.println("UtilityOperations of A");
        testUtility(longIntA);

        System.out.println();
        System.out.println();

        System.out.println("UtilityOperations of B");
        testUtility(longIntB);

        testAdd(B,longIntA);
        testAdd(D,longIntB);
        testAdd(D, longIntA);
        testAdd(A, longIntD);
        testAdd(C, longIntF);
        testAdd(F, longIntC);
        testAdd(F, longIntF);
        System.out.println();
        testSubtract(A, longIntB);

        reachable(A);
        reachable(B);
        reachable(C);
        reachable(D);
        reachable(E);
        reachable(F);
        reachable(G);
        reachable(H);*/
    }

    public static void reachable(String str){
        testCase(str);
    }

    public static String A="2222";
    public static String B="99999999";
    public static String C="-246813575732";
    public static String D="180270361023456789";
    public static String E="1423550000000010056810000054593452907711568359";
    public static String F="-350003274594847454317890";
    public static String G="29302390234702973402973420937420973420937420937234872349872934872893472893749287423847";
    public static String H="-98534342983742987342987339234098230498203894209928374662342342356723423423";

    public static LongInteger longIntA=new LongInteger(A);
    public static LongInteger longIntB=new LongInteger(B);
    public static LongInteger longIntC=new LongInteger(C);
    public static LongInteger longIntD=new LongInteger(D);
    public static LongInteger longIntE=new LongInteger(E);
    public static LongInteger longIntF=new LongInteger(F);
    public static LongInteger longIntG=new LongInteger(G);
    public static LongInteger longIntH=new LongInteger(H);

    private DLLNode head; 
    private DLLNode tail;
    
    public DLLProjectList() { 
        tail=new DLLNode(-1,null,null);
        head=tail;
        this.head=head;
        this.tail=tail;
    }

    public static void testUtility(LongInteger temp){
        Position x=temp.getList().first();
        while (!temp.getList().isLast(x)){
            System.out.println("The overflow of "+x.getValue()+ " is: "+UtilityOperations.overflow(x.getValue()));
            System.out.println("The underflow of "+x.getValue()+ " is: "+UtilityOperations.underflow(x.getValue()));
            System.out.println("The upper half "+x.getValue()+ " is: " + UtilityOperations.upperHalf(x.getValue()));
            System.out.println("The lower half of "+x.getValue()+ " is: "+UtilityOperations.lowerHalf(x.getValue()));
            System.out.println("The digit count of "+x.getValue()+ " is: "+UtilityOperations.digits(x.getValue()));
            System.out.println();
            x=temp.getList().after(x);
        }
    }

    public static void testAdd(String str, LongInteger longInt){
        LongInteger temp=new LongInteger(str);
        longInt.add(temp);
        temp.output();
    }

    public static void testSubtract(String str, LongInteger longInt){
        LongInteger temp=new LongInteger(str);
        longInt.subtract(temp);
        temp.output();
    }


    public static void testCase(String str){
        LongInteger longInt=new LongInteger(str);
        longInt.output();

        boolean sign = longInt.getSign();
        if (sign){
            System.out.println("The sign is -");
        }
        else{
            System.out.println("The sign is +");
        }

        longInt.printValue();

        if (longInt.lessThan(longIntA)){
            System.out.println("This longInt is less than A");
        }
            else if (longInt.greaterThan(longIntA)){
                System.out.println("This longInt is greater than A");
            }
            else if (longInt.equalTo(longIntA)){
                System.out.println("This longInt is equal to A");
            }

        if (longInt.lessThan(longIntB)){
            System.out.println("This longInt is less than B");
        }
            else if (longInt.greaterThan(longIntB)){
                System.out.println("This longInt is greater than B");
            }

            else if (longInt.equalTo(longIntB)){
                System.out.println("This longInt is equal to B");
            }

        if (longInt.lessThan(longIntC)){
            System.out.println("This longInt is less than C");
        }
            else if (longInt.greaterThan(longIntC)){
                System.out.println("This longInt is greater than C");
            }

            else if (longInt.equalTo(longIntC)){
                System.out.println("This longInt is equal to C");
            }

        if (longInt.lessThan(longIntD)){
            System.out.println("This longInt is less than D");
        }
            else if (longInt.greaterThan(longIntD)){
                System.out.println("This longInt is greater than D");
            }

            else if (longInt.equalTo(longIntD)){
                System.out.println("This longInt is equal to D");
            }

        
        if (longInt.lessThan(longIntE)){
            System.out.println("This longInt is less than E");
        }
            else if (longInt.greaterThan(longIntE)){
                System.out.println("This longInt is greater than E");
            }

            else if (longInt.equalTo(longIntE)){
                System.out.println("This longInt is equal to E");
            }

    
        if (longInt.lessThan(longIntF)){
            System.out.println("This longInt is less than F");
        }
            else if (longInt.greaterThan(longIntF)){
                System.out.println("This longInt is greater than F");
            }

            else if (longInt.equalTo(longIntF)){
                System.out.println("This longInt is equal to F");
            }
        
        if (longInt.lessThan(longIntG)){
            System.out.println("This longInt is less than G");
        }
            else if (longInt.greaterThan(longIntG)){
                System.out.println("This longInt is greater than G");
            }
            else if (longInt.equalTo(longIntG)){
                System.out.println("This longInt is equal to G");
            }

        if (longInt.lessThan(longIntH)){
            System.out.println("This longInt is less than H");
        }
            else if (longInt.greaterThan(longIntH)){
                System.out.println("This longInt is greater than H");
            }

            else if (longInt.equalTo(longIntH)){
            System.out.println("This longInt is equal to H");
            }
        
        int digits = longInt.getDigitCount();
        System.out.println("The digit count is:" + digits);

        System.out.println();   
    }
    
    
    public void insertFirst(int value) {
        DLLNode firstnew = new DLLNode(value, head, null);
        head.setPrev(firstnew);
        firstnew.setPrev(null);
        head=firstnew;
    }
    
    
    public void insertLast(int value) {
        DLLNode newLast = new DLLNode(value, tail, null);
        tail.setNext(newLast);
        newLast.setNext(null);
        tail=newLast;
    }
    
    public DLLNode first() {
        return head;    
    }
    
    public DLLNode last() {
        return tail;    
    }
    
    public boolean isFirst(DLLNode p) {
        if (p==first()){
            return true;
        }
        return false;
    }

    public boolean isLast(DLLNode p) {
        if (p.getNext()==null){
            return true;
        }
        return false;
    }

    public DLLNode before(DLLNode p) {
        return p.getPrev();
    }

    public DLLNode after(DLLNode p) {
        return p.getNext();
    }

    public boolean isEmpty() {
        if ((head==tail)&&(head==null)){
            return true;
        }
        return false; 
    }

    public int size() {
        int i=0; 
        DLLNode temp = first();
        while (temp!=last()){
            i=i+1;
            //System.out.println("temp right now is " + temp.getValue());
            //temp=LongInteger.getList().after(temp);
            
            temp=temp.getNext();
        }

        return i;      
    }
}
