package uaslp.objetos.linkedlist;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ArrayList array = new ArrayList();
        array.addAtTail("Tarea");
        array.addAtTail("6");
        array.addAtTail("ArrayList");
        array.addAtTail("Diego");
        array.addAtTail("Lopez");
        array.addAtTail("Facundo");
        array.deleteElement("Tarea");
        array.deleteByIndex(2);
        array.PrintArray();
        System.out.println("size: "+ArrayList.getSize());
    }
}