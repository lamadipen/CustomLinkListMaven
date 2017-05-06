package com.dipen.linklist;

/**
 * Created by dipen on 5/6/2017.
 */
public class Node {

    private int data;
    private Node nextNode;

    /** overloaded constructor
     * @param  data of int type
     * **/
    public Node(int data) {
        this.data = data;
        this.nextNode =null;
    }

    /** getters and setters to access private data from outside **/
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }




}
