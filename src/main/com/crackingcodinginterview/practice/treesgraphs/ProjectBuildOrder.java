package main.com.crackingcodinginterview.practice.treesgraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProjectBuildOrder {

    public ArrayList<String> buildOrder(List<String> projects, List<List<String>> deps){

        HashMap<String, List<String>> projDepsMap = buildMapForm(deps);
        ArrayList<String> projectBuildOrder = new ArrayList<>();

        for(String proj : projects){

            if(! projectBuildOrder.contains(proj)){
                List<String> childList = projDepsMap.get(proj);
                if(childList!=null && !childList.isEmpty()){
                    buildOrderForChilds(projectBuildOrder, childList, projDepsMap);
                }
                projectBuildOrder.add(proj);
            }
        }

        return projectBuildOrder;
    }

    /**
     * Builds all project for child.
     * @param projectBuildOrder
     * @param childList
     * @param projDepsMap
     */
    private void buildOrderForChilds(ArrayList<String> projectBuildOrder, List<String> childList,
                                     HashMap<String, List<String>> projDepsMap) {

        for(String child: childList){
            if(!projectBuildOrder.contains(child)){
                List<String> nextLevelchild = projDepsMap.get(child);
                if(nextLevelchild!= null && !nextLevelchild.isEmpty()){
                    buildOrderForChilds(projectBuildOrder, nextLevelchild, projDepsMap);
                    projectBuildOrder.add(child);
                }else{
                    projectBuildOrder.add(child);
                }
            }
        }
    }

    /**
     * Builds Map format for the dependencies, Key => Parent Project, Value => dependency project list.
     * @param deps
     * @return
     */
    private HashMap<String, List<String>> buildMapForm(List<List<String>> deps) {
        HashMap<String, List<String>> projDepsMap = new HashMap<>();
        for(List<String> dep : deps){
            String parent = dep.get(1);
            String child = dep.get(0);
            if(projDepsMap.get(parent) != null){
                List<String> childList = projDepsMap.get(parent);
                childList.add(child);
                projDepsMap.put(parent, childList);
            }else{
                List<String> childList = new ArrayList<>();
                childList.add(child);
                projDepsMap.put(parent, childList);
            }
        }

        return projDepsMap;
    }
}
