package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BSTSequence {

    public List<List<Integer>> findBSTSequence(BinaryNode root){
        if (root == null) return null;

        List<List<Integer>> possibleArrays = new ArrayList<>();
        List<BinaryNode> nodesToVisit = new ArrayList<>();
        nodesToVisit.add(root);

        return findAllPossibleSequence(nodesToVisit, possibleArrays);
    }

    private List<List<Integer>> findAllPossibleSequence(List<BinaryNode> nodesToVisit, List<List<Integer>> possibleArrays) {

        if(nodesToVisit == null || nodesToVisit.size() < 1) return possibleArrays;

        List<BinaryNode> nodesToVisitAtThisLevel = new ArrayList<>();
        ArrayList<List<Integer>> newPossibleArray = new ArrayList<>();

        for(BinaryNode<Integer> visitNode: nodesToVisit){
            int rootVal = visitNode.value;
            int rightVal = -1;
            int leftVal = -1;

            if(possibleArrays.isEmpty()){
                List<Integer> subList = new ArrayList<>();
                subList.add(rootVal);
                possibleArrays.add(subList);
            }
            if(visitNode.left != null || visitNode.right != null){
                if(visitNode.left != null){
                    nodesToVisitAtThisLevel.add(visitNode.left);
                    leftVal = visitNode.left.value;
                }
                if(visitNode.right != null){
                    nodesToVisitAtThisLevel.add(visitNode.right);
                    rightVal = visitNode.right.value;
                }
                for(List<Integer> subList : possibleArrays){
                    if(leftVal > -1 && rightVal > -1){
                        ArrayList<Integer> newSubList = new ArrayList<>();
                        newSubList.addAll(subList);
                        subList.add(leftVal);
                        subList.add(rightVal);
                        newSubList.add(rightVal);
                        newSubList.add(leftVal);
                        newPossibleArray.addAll(Collections.singleton(subList));
                        newPossibleArray.addAll(Collections.singleton(newSubList));
                    }else if(rightVal > -1){
                        subList.add(rightVal);
                        newPossibleArray.addAll(Collections.singleton(subList));
                    }else if(leftVal > -1){
                        subList.add(leftVal);
                        newPossibleArray.addAll(Collections.singleton(subList));
                    }
                }
            }else{
                return possibleArrays;
            }
            possibleArrays = new ArrayList<>();
            possibleArrays.addAll(newPossibleArray);
        }

        if(!nodesToVisitAtThisLevel.isEmpty()){
            return findAllPossibleSequence(nodesToVisitAtThisLevel, newPossibleArray);
        }
        return possibleArrays;
    }
}
