public class Tester
{
    public static void main(String[] args)
    {
        DoublyLinkedList<String> myDLL = new DoublyLinkedList<String>();

        myDLL.add("Hello There");

        myDLL.add("Hello Again");

        myDLL.add("Hello Once More");

        myDLL.printForward();

        myDLL.printReverse();
    }
}
