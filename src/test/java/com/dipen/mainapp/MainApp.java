package com.dipen.mainapp;

import com.dipen.linklist.CustomLinkList;
import com.dipen.linklist.Node;

/**
 * Created by dipen on 5/6/2017.
 */
public class MainApp {

    /** main method to run the application
     * @param  args of type String Array
     * **/
    public static void main(String[] args)
    {
        Node node = new Node(5);
        CustomLinkList customLinkList = new CustomLinkList(node);

        //adding node to customLinkList
        customLinkList.addNode(1);
        customLinkList.addNode(5);
        customLinkList.addNode(2);
        customLinkList.addNode(3);
        customLinkList.addNode(4);

        //remove last node of customLinkList
        //customLinkList.removeNode();

        //remove all node greater than targeted value customLinkList
        customLinkList.removeNodeGreaterThanTarget(2);

        //printing all the values in the customLinkList
        while(customLinkList.getRootNode() != null)
        {
            System.out.println(customLinkList.getRootNode().getData());
            customLinkList.setRootNode(customLinkList.getRootNode().getNextNode());
        }

    }
}
