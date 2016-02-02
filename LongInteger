public class LongInteger {

    private ProjectList list = new DLLProjectList();
    //private ProjectList list = new ArrayProjectList(); 
	
    public boolean isNegative=false;
    public boolean subtracted=false;
    public LongInteger(){}   
    public LongInteger(String s) {
        //create substring, put in a node. Get the next substring. Put in another node, etc.
        Integer first=0;
        int second=0;
        String temp="";
        while (s.length()>=8){
            temp=s.substring((s.length()-8),s.length());
            first=first.valueOf(temp);
            second=first.intValue();
            if (second<0){
                first=first.valueOf(temp.substring(1));
                second=first.intValue();
            }
            list.insertFirst(second);

            s=s.substring(0,(s.length()-8));
        }
        if (s.length()>0){
            try{
                first=first.valueOf(s);
                second=first.intValue();
                if (second<0){
                    first=first.valueOf(s.substring(1));
                    isNegative=true;
                    second=first.intValue();
                }
            list.insertFirst(second);
            }
            catch(NumberFormatException e){
                isNegative=true;
            }   
        }
    }

    public ProjectList getList(){
        return list;
    }

    public boolean getSign() {
        return isNegative;
    }

    public void oppositeSign(){
        if (isNegative){
            isNegative=false;
        }
        else{
            isNegative=true;
        }
    }
	
    public int getDigitCount() { 
       int j=0;
       j=(list.size()-1)*8;
       int k=list.first().getValue();
       int m=UtilityOperations.digits(k);
       j=j+m;
       return j;
    }

    public void printValue(){
        Position x=list.first();
        while (!list.isLast(x)){
            System.out.println(x.getValue());
            x=list.after(x);
            }
        }
    
    
    public void output() {
       String out="";
       Position x=list.first();
       if (isNegative){
            out=out+"-";
        }
        
        while (!list.isLast(x)){
            String temp=Integer.toString(x.getValue());
            if (temp.substring(0,0)=="-"){
             break;   
            }
            String toAdd="";
            if (list.isFirst(x)||(isNegative&&out.length()==1)){
                temp=temp;
            }
            else if (temp.length()<8&& out.length()!=0){
                int more = 8-temp.length();
                for (int j=more; j>0; j--){
                    toAdd=toAdd+"0";
                }
            }
            toAdd=toAdd+temp;
            out=out+toAdd;
            x=list.after(x);
        }
         //if the list is empty because of noExtra();
        if (list.isLast(x)&&((isNegative &&out.length()==1)||!isNegative&&out.length()==0)){
            System.out.println(0);
        }
        else{
            System.out.println(out);
        }
                  
    }
    

    public boolean equalTo(LongInteger i) {
        
        if ((i.getSign() && !getSign())||(!i.getSign() && getSign())){
            return false;
        }   
            else if ((i.getSign() && getSign())||(!i.getSign() && !getSign())){
                if (i.getDigitCount()!=getDigitCount()){
                    return false;
                }
                else if (i.getDigitCount()==getDigitCount()){
                    Position x=list.first();
                    Position y=i.list.first();
                    while(!list.isLast(x) && !i.list.isLast(y)){
                        if (x.getValue()!=y.getValue()){
                            return false;
                        }
                        x=list.after(x);
                        y=i.list.after(y);
                    }
                    return true;
                }
            }
            return false;
    }
   
    
    public boolean lessThan(LongInteger i) {

        if (i.getSign() && !getSign()){         
            return false;
        }
        else if(!i.getSign() && getSign()){ 
            return true;
        }
        else if ((i.getSign() && getSign())||(!i.getSign() && !getSign())){
            if ((getSign() && i.getDigitCount()<getDigitCount())||(!getSign() && i.getDigitCount()>getDigitCount())){ 
                return true;
            }
            else if ((getSign() && i.getDigitCount()>getDigitCount())||(!getSign() && i.getDigitCount()<getDigitCount())){
                return false;
            }
            else if (i.getDigitCount()==getDigitCount()){
                    Position x=list.first();
                    Position y=i.list.first();
                    while(!list.isLast(x) && !i.list.isLast(y)){
                        if ((!getSign()&&(y.getValue()<x.getValue()))||(getSign()&&(y.getValue()>x.getValue()))){
                            return false;
                        }
                        else if ((!getSign()&&(y.getValue()>x.getValue()))||(getSign()&&(y.getValue()>x.getValue()))){
                            return true;
                        }
                        x=list.after(x);
                        y=i.list.after(y);
                    }
                }

            }
            return false;
        }
        

    
    public boolean greaterThan(LongInteger i) {
        if (i.getSign() && !getSign()){         
            return true;
        }
        else if(!i.getSign() && getSign()){ 
            return false;
        }
        else if ((i.getSign() && getSign())||(!i.getSign() && !getSign())){
            if ((getSign() && i.getDigitCount()<getDigitCount())||(!getSign() && i.getDigitCount()>getDigitCount())){ 
                return false;
            }
            else if ((getSign() && i.getDigitCount()>getDigitCount())||(!getSign() && i.getDigitCount()<getDigitCount())){
                return true;
            }
            else if (i.getDigitCount()==getDigitCount()){
                Position x=list.first();
                Position y=i.list.first();
                while(!list.isLast(x) && !i.list.isLast(y)){
                    if ((!getSign()&&(y.getValue()>x.getValue()))||(getSign()&&(y.getValue()<x.getValue()))){
                        return false;
                    }
                    else if ((!getSign()&&(y.getValue()<x.getValue()))||(getSign()&&(y.getValue()>x.getValue()))){
                        return true;
                    }
                    x=list.after(x);
                    y=i.list.after(y);
                }
            }
 
        }
        
        return false;
    }
    public boolean iChanged=false;
    public LongInteger add(LongInteger i) {
        LongInteger results=new LongInteger();
        int a=0;
        int b=0;
        Position x=list.last();
        Position y=i.list.last();
        x=list.before(x);
        y=i.list.before(y);
        if ((!i.getSign() && !getSign())||(i.getSign()&&getSign())){
            if(i.getSign()&&getSign()&&!subtracted){
                results.oppositeSign();
            }
            while (!list.isFirst(x)&& !i.list.isFirst(y)){
                a=x.getValue() + y.getValue()+b;
                b=UtilityOperations.overflow(a);
                a=UtilityOperations.underflow(a);
                results.list.insertFirst(a);
                x=list.before(x);
                y=i.list.before(y);
            }
            if (list.isFirst(x) || i.list.isFirst(y)){
                a=x.getValue() + y.getValue()+b;        
                b=UtilityOperations.overflow(a);
                a=UtilityOperations.underflow(a);
                results.list.insertFirst(a);


                if (!list.isFirst(x)&&i.list.isFirst(y)){   //when s1 is longer than s2
                    x=list.before(x);
                    b=x.getValue()+b; 
                    results.list.insertFirst(b);      
                    while (!list.isFirst(x)){
                        x=list.before(x);
                        results.list.insertFirst(x.getValue());
                    }
                }
                else if (!i.list.isFirst(y)&&list.isFirst(x)){  //when s2 is longer than s1
                    y=i.list.before(y);
                    b=y.getValue()+b;
                    results.list.insertFirst(b);
                    while (!i.list.isFirst(y)){
                        y=i.list.before(y);
                        results.list.insertFirst(y.getValue());
                    }
                    
                }
                else if (list.isFirst(x)&&i.list.isFirst(y)){
                    results.list.insertFirst(b);
                }
            }
        }
        else if ((!getSign()&&i.getSign())||(!i.getSign()||getSign())){
            i.oppositeSign();
            iChanged=true;
            return subtract(i);
        }
        if (iChanged){
            i.oppositeSign();
            iChanged=false;
        }
        if(subtracted){
            subtracted=false;
            return results;
        }
        return noExtra(results);   //return s2
    }

    public LongInteger noExtra(LongInteger i){
        LongInteger results = new LongInteger();

        if (i.list.first().getValue()==0){
            Position x=i.list.first();

            while (x.getValue()==0){
                if (!i.list.isLast(x)){
                    x=i.list.after(x);
                }
                else{
                    results.list.insertFirst(0);
                    return results;
                }
            }
            Position y=i.list.last();

            while (!i.list.isFirst(y)&&x!=y){
                results.isNegative=i.isNegative;
                y=i.list.before(y);
                results.list.insertFirst(y.getValue());            
            }
            return results;
        }
        return i;
    }

    public LongInteger lessThanSub (LongInteger i){
            LongInteger results = new LongInteger();
            if (!getSign()){
                results.oppositeSign();
            }
            int a;
            int b;
            int c;
            Position y=list.last();
            Position x=i.list.last();

            y=list.before(y);
            x=i.list.before(x);
            boolean negativeOne=false;
            while(!list.isFirst(y) && !i.list.isFirst(x)){
                int again=x.getValue();
                if (negativeOne){
                    again=again-1;
                    negativeOne=false;
                }
                if (y.getValue()<again){
                    a=again-y.getValue();
                    results.list.insertFirst(a);
                    x=i.list.before(x);
                    y=list.before(y);
                }
                else if (again<y.getValue()){
                    c=100000000+again;
                    a=c-y.getValue();
                    results.list.insertFirst(a);
                    negativeOne=true;
                    x=i.list.before(x);
                    y=list.before(y);
                }
                else if (again==y.getValue()){
                    results.list.insertFirst(0);
                    x=i.list.before(x);
                    y=list.before(y);
                }
            }
            int again=x.getValue();
            if (negativeOne){
                    again=again-1;
                    negativeOne=false;
                }
            if (i.list.isFirst(x)&&list.isFirst(y)){ //y.getValue should always be less than x.getValue() here
                a=again-y.getValue();
                results.list.insertFirst(a);
            }
            else if (list.isFirst(y)){  //when the i is shorter 
                if (again>y.getValue()){
                    a=again-y.getValue();
                    results.list.insertFirst(a);
                }
                else if(again<y.getValue() || again==y.getValue()){
                    if (again==y.getValue()){
                        results.list.insertFirst(0);
                    }
                    else{c=100000000+again;
                    a=c-y.getValue();
                    results.list.insertFirst(a);
                    x=i.list.before(x);
                    results.list.insertFirst(x.getValue()-1);}
                    
                }
                while(!i.list.isFirst(x)){
                    x=i.list.before(x);
                    results.list.insertFirst(x.getValue());
                }
                
    }
    if (iChanged){
        i.oppositeSign();
        iChanged=false;
    }
    return noExtra(results);
}
    
    public LongInteger subtract(LongInteger i) {
        LongInteger tempi=new LongInteger();

        if ((!getSign()&&i.getSign())||(getSign()&&!i.getSign())){       //list is positive, i is negative: +s1-(-s2)=s1+s2
            subtracted=true;
            if (!getSign() && i.getSign()){
            i.oppositeSign();
            iChanged=true;
            tempi=add(i);
        }
        else if (getSign()&&!i.getSign()){
            i.oppositeSign();
            iChanged=true;            
            tempi=add(i);
            tempi.oppositeSign();
        }
            return tempi;
        }
        if ((lessThan(i)&&!(getSign()&&i.getSign()))||(greaterThan(i)&&(getSign()&&i.getSign()))){
            return lessThanSub(i);
        }

        if(greaterThan(i)||equalTo(i)||(getSign()&&i.getSign())){
            if (getSign()&&i.getSign()){
                tempi.oppositeSign();
            }
            int a;
            int b;
            int c;
            Position x=list.last();
            Position y=i.list.last();
            boolean negativeOne=false;
            x=list.before(x);
            y=i.list.before(y);
            while(!i.list.isFirst(y) && !list.isFirst(x)){
                int hi=x.getValue();
                if (negativeOne){
                    hi=hi-1;
                    negativeOne=false;
                }
                if (y.getValue()<hi){
                    a=hi-y.getValue();
                    tempi.list.insertFirst(a);
                }
                else if (hi<y.getValue()){
                    c=100000000+hi;
                    a=c-y.getValue();
                    negativeOne=true;
                    tempi.list.insertFirst(a);
                    negativeOne=true;
                }
                else if (hi==y.getValue()){
                    tempi.list.insertFirst(0);
                }
                    x=list.before(x);
                    y=i.list.before(y);
            }

            int hi=x.getValue();        
            if (negativeOne){
                hi=hi-1;
                negativeOne=false;
            }

            if (i.list.isFirst(y)&&list.isFirst(x)){ 
                a=hi-y.getValue();
                tempi.list.insertFirst(a);
            }
            else if (i.list.isFirst(y)){ //when the i is shorter 
                if (hi>y.getValue()){
                    a=hi-y.getValue();
                    tempi.list.insertFirst(a);
                }
                else if(hi<y.getValue() || hi==y.getValue()){
                    if (hi==y.getValue()){
                        tempi.list.insertFirst(0);
                    }
                    else{c=100000000+hi;
                    a=c-y.getValue();
                    tempi.list.insertFirst(a);
                    x=list.before(x);
                    tempi.list.insertFirst(x.getValue()-1);}

                }
                while(!list.isFirst(x)){
                        x=list.before(x);
                        tempi.list.insertFirst(x.getValue());
                    }
            }
    }
    if (iChanged){
        i.oppositeSign();
        iChanged=false;
    }
    return noExtra(tempi);
}

    public int padding(int j){
        int r=10;
        for (int i=1; i<j; i++){
            r=r*10;
        }
        return r;
    }
    
    public LongInteger multiply(LongInteger i) {
        LongInteger toReturn =new LongInteger();
        Position y=i.list.last();
        int buffersNeeded=0;
        while ( !i.list.isFirst(y)){
            LongInteger temp=new LongInteger();
            y=i.list.before(y); 
            Position x=list.last();
            int b1=UtilityOperations.upperHalf(y.getValue());
            int b2=UtilityOperations.lowerHalf(y.getValue());
            while (!list.isFirst(x)){
                x=list.before(x);
                int a1=UtilityOperations.upperHalf(x.getValue());
                int a2=UtilityOperations.lowerHalf(x.getValue());
                int z1=a1*b1;
                int z3=a2*b2;
                int z2=((a1+a2)*(b1+b2))-z3-z1;

                int result=UtilityOperations.lowerHalf(z3);
                result=result+((UtilityOperations.lowerHalf(z2)+UtilityOperations.upperHalf(z3))*padding(4));
                int over=UtilityOperations.overflow(result);
                int real=0;
                int toBeAdded=0;
                Position r=temp.list.first();
                if (r==temp.list.last()){

                    temp.list.insertFirst(UtilityOperations.underflow(result));
                    toBeAdded=UtilityOperations.overflow(result);  
                }
                else{
                    real=UtilityOperations.underflow(result)+temp.list.first().getValue();
                    temp.list.first().setValue(UtilityOperations.underflow(real));
                    toBeAdded=UtilityOperations.overflow(real)+UtilityOperations.overflow(result);
                }
                result=UtilityOperations.upperHalf(z2)+UtilityOperations.lowerHalf(z1)+toBeAdded;
                result=result+(UtilityOperations.upperHalf(z1)*padding(4));
                temp.list.insertFirst(result);

            }

            for (int k=0; k<buffersNeeded; k++){
                temp.list.insertLast(0);
            }
            buffersNeeded++;
            try{
                toReturn=toReturn.add(temp);
            }
            catch(NullPointerException e){
                toReturn=temp;
            }
            catch(ArrayIndexOutOfBoundsException w){
                toReturn=toReturn;
            }
        }
        if ((!getSign() && i.getSign())||(getSign() && !i.getSign())){
            toReturn.oppositeSign();
        }
        return noExtra(toReturn);
    }
    
    public LongInteger power(int p) {
        LongInteger temp=new LongInteger();
        temp.list=list;
        int m=1;
        if ((p-m)==0){
            return noExtra(temp);}
        if ((p-m)>2){
            temp=temp.multiply(power(p-m));
        }
        else if ((p-m)==1){
            temp=multiply(temp);
        }
        else if ((p-m)==2){
            LongInteger x=new LongInteger();
            x.list=list;
            x=x.multiply(x);
            temp=temp.multiply(x);
        }
        if ((p%2)==1){
            temp.isNegative=isNegative;
        }
        else if (p%2==0){
            temp.isNegative=false;
        }
         return noExtra(temp);           
    }
}
