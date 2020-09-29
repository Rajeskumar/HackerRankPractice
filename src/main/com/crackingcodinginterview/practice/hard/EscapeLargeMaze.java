package main.com.crackingcodinginterview.practice.hard;

import java.util.*;

/**
 * In a 1 million by 1 million grid, the coordinates of each grid square are (x, y) with 0 <= x, y < 10^6.
 *
 * We start at the source square and want to reach the target square.  Each move, we can walk to a 4-directionally adjacent square in the grid that isn't in the given list of blocked squares.
 *
 * Return true if and only if it is possible to reach the target square through a sequence of moves.
 *
 *
 * Example 1:
 *
 * Input: blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
 * Output: false
 * Explanation:
 * The target square is inaccessible starting from the source square, because we can't walk outside the grid.
 * Example 2:
 *
 * Input: blocked = [], source = [0,0], target = [999999,999999]
 * Output: true
 * Explanation:
 * Because there are no blocked cells, it's possible to reach the target square.
 *
 *
 * Note:
 *
 * 0 <= blocked.length <= 200
 * blocked[i].length == 2
 * 0 <= blocked[i][j] < 10^6
 * source.length == target.length == 2
 * 0 <= source[i][j], target[i][j] < 10^6
 * source != target
 */
public class EscapeLargeMaze {

    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {

        HashMap<Integer, HashSet<Integer>> blockedMap = addOrconvertToMap(blocked, new HashMap<>());

        if(blocked.length == 0) return true;

        ArrayList<ArrayList<Coordinate>> listToVisit = new ArrayList<>();
        Coordinate src = new Coordinate(source[0], source[1]);
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(src);
        listToVisit.add(coordinates);
        return isEscapePossibleFromCurrent(blockedMap, listToVisit, target, 0);

    }

    private boolean isEscapePossibleFromCurrent(HashMap<Integer, HashSet<Integer>> blockedMap, ArrayList<ArrayList<Coordinate>> listToVisit, int[] target, int level) {

        boolean isPathExists = false;
        boolean newPathExists = false;
        ArrayList<Coordinate> newListToVisit = new ArrayList<>();

        List<Coordinate> points = listToVisit.get(level);

        for(Coordinate point : points){

            if(point.x == target[0] && point.y==target[1]) return true;

            int[][] shifts = new int[][] {{1,0}, {0,1},{-1,0},{0,-1}};

            for (int[] s: shifts) {
                Coordinate newPoint = new Coordinate(point.x+s[0], point.y+s[1]);
                if(isFeasible(newPoint, blockedMap)){
                    newListToVisit.add(newPoint);
                    newPathExists = true;
                }
            }
            int[][] visited = {{point.x, point.y}};
            addOrconvertToMap(visited, blockedMap);
        }


        if(newPathExists){
            listToVisit.add(newListToVisit);
            isPathExists = isEscapePossibleFromCurrent(blockedMap, listToVisit, target, level+1);
        }

        return isPathExists;
    }

    private HashMap<Integer, HashSet<Integer>> addOrconvertToMap (int[][] blocked, HashMap<Integer, HashSet<Integer>> blockedMap){

        for(int i=0; i< blocked.length; i++){
            HashSet<Integer> set = new HashSet<>();
            if(blockedMap.containsKey(blocked[i][0])){
                set = blockedMap.get(blocked[i][0]);
            }
            set.add(blocked[i][1]);
            blockedMap.put(blocked[i][0], set);
        }
        return blockedMap;
    }

    private boolean isFeasible (Coordinate point, HashMap<Integer, HashSet<Integer>> blockedMap){
        HashSet<Integer> set = blockedMap.get(point.x);

        if(point.x < 0 || point.y < 0 || point.x>999999 || point.y > 999999) return false;

        if(set==null || set.isEmpty()) return true;

        return !set.contains(point.y);
    }
}
