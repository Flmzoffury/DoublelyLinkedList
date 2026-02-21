public class Node<T>
{
    T data;
    Node<T> prevNode;
    Node<T> nextNode;

    public Node(T userInputData)
    {
        data = userInputData;
    }


    public boolean hasNext()
    {
        return nextNode != null;
    }

    public boolean hasPrev()
    {
        return prevNode != null;
    }

    public T getData()
    {
        return data;
    }

    public Node<T> getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node<T> inputNextNode)
    {
        nextNode = inputNextNode;
    }

    public Node<T> getPrevNode()
    {
        return prevNode;
    }

    public void setPrevNode(Node<T> inputPrevNode)
    {
        prevNode = inputPrevNode;
    }

}
