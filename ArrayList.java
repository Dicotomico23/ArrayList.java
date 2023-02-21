package uaslp.objetos.linkedlist;

public class ArrayList {
    private static final int INITIAL_SIZE = 2;
    private String []array;
    private static int size;

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }

    public void addAtTail(String data){
        if(size == array.length) IncreaseArray();
        array[size] = data;
        size++;
    }
    public void deleteElement(String data){
        for(int cont=0;cont<size;cont++){
            if(array[cont].equals(data)){
                array[cont] = null;
                System.out.println("Element Removed!");
            }
        }
    }
    public void deleteByIndex(int index){
        int cont = 0;
        for(;cont<index;cont++);
            array[cont] = null;
            System.out.println("Element Removed at index: "+cont);
    }
    public static int getSize(){
        return size;
    }
    public void IncreaseArray(){
        System.out.println("Array increased, new size: "+getSize()*2);
        String[] newArray = new String[array.length * 2];
        for(int cont=0;cont<size;cont++){
            newArray[cont] = array[cont];
        }
        array = newArray;
    }
    public void PrintArray(){
        for(int cont=0;cont<size;cont++){
            System.out.println("["+array[cont]+"]");
        }
    }
}
