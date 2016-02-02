public class ArrayProjectList implements ProjectList<ArrayEntry> {

	ArrayEntry [] entries;
	
	
	private int n = 1;
    
    public ArrayProjectList() {
        entries=new ArrayEntry[n];
        entries[0]=new ArrayEntry(-1, 0);
    }
    
    public void insertFirst(int value) {
        ArrayEntry [] temp = new ArrayEntry [entries.length +1];
        for (int i=1; i<entries.length; i++){
            temp[i]=entries[i-1];
            temp[i].setIndex(i);
        }
        temp[n]=new ArrayEntry(-1, temp.length-1);
        temp[0]=new ArrayEntry(value, 0);
        entries=temp;

        n=temp.length;
    }
     
    public void insertLast(int value) {
        ArrayEntry [] temp = new ArrayEntry [entries.length +1];
        temp[n]=new ArrayEntry(-1, n);
        for (int i=0; i<entries.length; i++){
            temp[i]=entries[i];
            temp[i].setIndex(i);
        }
        temp[n-1]=new ArrayEntry(value, n-1);
        entries=temp;
        n=temp.length;
    }
    
    public ArrayEntry first() {
        return entries [0];
    }
    
    public ArrayEntry last() {
        return entries[n-1];    
    }

    public boolean isFirst(ArrayEntry p) {
        if (p.getIndex()==0){
            return true;
        }   
        return false;    
    }

    public boolean isLast(ArrayEntry p) {
        if (p.getIndex()==n-1){ 
            return true;
        }
        return false;
    }

    public ArrayEntry before(ArrayEntry p) {
        if (p.getIndex()!=0){
            return entries[p.getIndex()-1];
        }
        return null;
    }

    public ArrayEntry after(ArrayEntry p) {
        if (p.getIndex()!=n-1){
            return entries[p.getIndex()+1];
        }
        return null;
    }

    public boolean isEmpty() {
        if (entries.length==1){
            return true;
        }        
        return false;
    }
    

    public int size() {
        return entries.length-1;    
    }
    
}
