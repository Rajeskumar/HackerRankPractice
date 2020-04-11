package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem :: Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth.
 */
public class DepthLists {

    public List<List<BinaryNode>> depthLists (BinaryNode root){

        List<List<BinaryNode>> resultNodeList = new ArrayList<>();

        int depth = 0;

        List<BinaryNode>  nodeList = new ArrayList<BinaryNode>();

        nodeList.add(root);

        resultNodeList.add(nodeList);

        findNodesAtDepth(resultNodeList, depth);

        return resultNodeList;
    }

    private void findNodesAtDepth(List<List<BinaryNode>> resultNodeList, int depth){
        List<BinaryNode> nodesAtDepth = resultNodeList.get(depth);

        if(nodesAtDepth.isEmpty()){
            return;
        }
        List<BinaryNode> childNodes = new ArrayList<BinaryNode>();
        Boolean doesChildExists = false;
        for(int i=0;i<nodesAtDepth.size();i++){
            BinaryNode node = nodesAtDepth.get(i);
            if(node.right != null) {
                childNodes.add(node.right);
                doesChildExists = true;
            }
            if(node.left != null) {
                childNodes.add(node.left);
                doesChildExists = true;
            }
        }

        if(doesChildExists){
            resultNodeList.add(childNodes);
            findNodesAtDepth(resultNodeList, depth+1);
        }else{
            return;
        }
    }

}
