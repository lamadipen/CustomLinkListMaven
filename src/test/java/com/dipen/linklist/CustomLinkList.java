package com.dipen.linklist;

/**
 * Created by dipen on 5/6/2017.
 */
public class CustomLinkList {

    private Node rootNode;
    private int sizeCustomLinkList;

    /** overloaded constructor
     * @param  rootNode of type Node
     * **/
    public CustomLinkList(Node rootNode) {
        this.rootNode = rootNode;
        this.sizeCustomLinkList =1;
    }

    /** method to add node into CustomLinkList
     * @param  newData of int type
     * **/
    public void addNode(int newData)
    {
        Node tempNode = new Node(newData);
        Node currentNode = rootNode;

        while(currentNode.getNextNode() != null)
        {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(tempNode);
        sizeCustomLinkList++;
    }

    /** method to remove node from CustomLinkList **/
    public void removeNode()
    {
        Node currentNode = rootNode;
        while(currentNode.getNextNode().getNextNode() != null)
        {
            currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        sizeCustomLinkList--;
    }

    /** method to remove all node  great than a target value from CustomLinkList
     * @param target of type int
     ***/
    public void removeNodeGreaterThanTarget(int target)
    {
        while(rootNode.getData() > target)
        {
            rootNode = rootNode.getNextNode();
            sizeCustomLinkList--;
        }
        Node currentNode = rootNode;

        while (currentNode.getNextNode().getData() > target)
        {
            if(currentNode.getNextNode().getNextNode() != null)
            {
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                if(currentNode.getNextNode().getData() == target)
                {
                    currentNode = currentNode.getNextNode();
                }
                sizeCustomLinkList--;
            }
            else{
                if(currentNode.getNextNode().getData() >target)
                {
                    currentNode.setNextNode(null);
                    sizeCustomLinkList--;
                    break;
                }
            }
        }

    }

    /** getters and setters to access private data from outside **/
    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public int getSizeCustomLinkList() {
        return sizeCustomLinkList;
    }

    public void setSizeCustomLinkList(int sizeCustomLinkList) {
        this.sizeCustomLinkList = sizeCustomLinkList;
    }
}
