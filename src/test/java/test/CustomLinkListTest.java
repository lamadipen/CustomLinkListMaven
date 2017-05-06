package test;

import com.dipen.linklist.CustomLinkList;
import com.dipen.linklist.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by dipen on 5/6/2017.
 */
public class CustomLinkListTest {

    Node node;
    CustomLinkList customLinkList;

    @Before
    public void loadResources()
    {
        node = new Node(5);
        customLinkList = new CustomLinkList(node);
    }

    @Test
    public void addNode() throws Exception {
        customLinkList.addNode(1);
        int addedNodeData = customLinkList.getRootNode().getNextNode().getData();
        assertEquals("Test Success",21,addedNodeData);
    }

    @Test
    public void removeNode() throws Exception {
    }

    @Test
    public void removeNodeGreaterThanTarget() throws Exception {
    }

}