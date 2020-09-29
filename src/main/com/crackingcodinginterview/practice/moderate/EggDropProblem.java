package main.com.crackingcodinginterview.practice.moderate;

public class EggDropProblem {

    private int eggBreakFloor;

    public int findMaxFloor_Egg_Unbroken(int floors, int eggs, int breakingFloor){

        eggBreakFloor = breakingFloor;
        if(floors == 0 ) return 0;

        return findmaxfloor (1, floors, floors/2, eggs);
    }

    private int findmaxfloor(int start, int end, int mid, int eggs) {

        if(start == end && checkEggDrop(start)) return start-1;

        if (eggs == 1) {
            if (checkEggDrop(start)) {
                return start - 1;
            }else{
                return findmaxfloor(start+1, end, mid, eggs);
            }
        }else{
            if(checkEggDrop(mid)){
                return findmaxfloor(start, mid, mid/2, eggs-1);
            }else{
                start = mid;
                mid = (end - mid)/2 + mid;
                return findmaxfloor(start, end, mid, eggs);
            }
        }
    }

    private boolean checkEggDrop(int start) {

        if (start >= eggBreakFloor){
            return true;
        }else{
            return false;
        }
    }
}
