package main.com.crackingcodinginterview.practice.treesgraphs;

/**
 * Given two nodes from a binary tree, Find first common ancestor for both the nodes. Shouldnt store any extra nodes
 * in the data structure. Binary Tree not needed to be Binary Search Tree
 */
public class FindCommonAncestor {

    public BinaryNode findFirstCommonAncestor(BinaryNode root, BinaryNode node1, BinaryNode node2){

        //Assumption
        if(root == null || node1 == null || node2 == null) return null;

        //Before searching check whether two node exists
        boolean doesBothExists = doesNodeExists(root, node1);
        if(doesBothExists){
            doesBothExists = doesNodeExists(root, node2);
        }

        if(doesBothExists){
            return doDepthFirstSearch(root, node1, node2);
        }else{
            return null;
        }
    }

    private boolean doesNodeExists(BinaryNode root, BinaryNode node1) {

        if(root == null) return false;

        if(root.value == node1.value) return true;

        if(doesNodeExists(root.right, node1)){
            return true;
        }else if (doesNodeExists(root.left, node1)){
            return true;
        }else{
            return false;
        }
    }

    private BinaryNode doDepthFirstSearch(BinaryNode root, BinaryNode node1, BinaryNode node2) {

        BinaryNode nodeToReturn = null;
        if(root == null) return null;

        if(root.value == node1.value ){
            nodeToReturn = node1;
            return nodeToReturn;
        }else if(root.value == node2.value){
            nodeToReturn = node2;
            return nodeToReturn;
        }

        BinaryNode oneNode = doDepthFirstSearch(root.left, node1, node2);
        BinaryNode twoNode = null;
        if(oneNode== null || (oneNode!= null && (oneNode.value == node1.value || oneNode.value == node2.value))){
            twoNode = doDepthFirstSearch(root.right, node1, node2);
        }else{
            return oneNode;
        }

        if(oneNode != null && twoNode!= null){
            nodeToReturn = root;
        }else if(oneNode != null){
            return oneNode;
        }else if(twoNode != null){
            return twoNode;
        }

        return nodeToReturn;
    }
}
