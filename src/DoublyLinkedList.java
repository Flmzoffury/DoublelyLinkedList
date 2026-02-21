public class DoublyLinkedList<T>
{

    int size;
    Node<T> head;

    public DoublyLinkedList()
    {
        size = 0;
    }

    public void add(T userInputData)
    {
        boolean dataAdded = false;

        if (head == null)
        {
            head = new Node<T>(userInputData);
        }
        else
        {

            Node<T> tempNode = head;
            while (!dataAdded)
            {
                if (tempNode.getNextNode() == null)
                {
                    tempNode.setNextNode(new Node<T>(userInputData));
                    tempNode.getNextNode().setPrevNode(tempNode);
                    dataAdded = true;
                }
                else
                {
                    tempNode = tempNode.getNextNode();
                }
            }
        }

        size++;
    }

    public void printForward()
    {
        Node<T> tempNode = head;
        while (tempNode != null)
        {
            System.out.println(tempNode.getData().toString());
            tempNode = tempNode.getNextNode();
        }
    }

    public void printReverse()
    {
        Node<T> tempNode = head;
        while (tempNode.hasNext())
        {
            tempNode = tempNode.getNextNode();
        }
        while (tempNode.hasPrev())
        {
            System.out.println(tempNode.getData().toString());
            tempNode = tempNode.getPrevNode();
        }
        System.out.println(tempNode.getData());
    }

    public void removeValue(T value)
    {
        boolean foundValue = false;

        if (head.getData().equals(value))
        {
            head = head.getNextNode();
        }
        else if (head.hasNext())
        {
            if (head.getNextNode().getData().equals(value))
            {
                if (head.getNextNode().hasNext())
                {
                    head.setNextNode(head.getNextNode().getNextNode());
                }
                else
                {
                    head.setNextNode(null);
                }
            }
            else
            {
                Node<T> tempNode = head;
                while (tempNode.hasNext() && !foundValue)
                {
                    if (tempNode.getNextNode().hasNext())
                    {
                        if (tempNode.getNextNode().getNextNode().getData().equals(value))
                        {
                            if (tempNode.getNextNode().getNextNode().hasNext())
                            {
                                tempNode.getNextNode().setNextNode(tempNode.getNextNode().getNextNode().getNextNode());
                            }
                            else
                            {
                                tempNode.getNextNode().setNextNode(null);
                            }
                            foundValue = true;
                        }
                    }
                    tempNode = tempNode.getNextNode();
                }
            }

        }


        size--;
    }

    public int size()
    {
        return size;
    }

    public T getNodeData(int inputLocation)
    {
        Node<T> tempNode = head;
        int currentLocation = 0;
        if (tempNode == null)
        {
            return null;
        }
        while (inputLocation != currentLocation && tempNode.hasNext())
        {
            tempNode = tempNode.getNextNode();
            currentLocation++;
        }
        if (currentLocation != inputLocation)
        {
            return null;
        }
        else
        {
            return tempNode.getData();
        }
    }
}
