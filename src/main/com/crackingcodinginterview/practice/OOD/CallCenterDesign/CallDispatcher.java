package main.com.crackingcodinginterview.practice.OOD.CallCenterDesign;

import java.util.LinkedList;
import java.util.Queue;

public class CallDispatcher {
    Queue<Employee> availableResp;
    Queue<Employee> availableMgr;
    Queue<Employee> availableDtr;

    private static CallDispatcher instance = null;

    public CallDispatcher() {
        this.availableResp = new LinkedList<>();
        this.availableMgr = new LinkedList<>();
        this.availableDtr = new LinkedList<>();
    }

    public static CallDispatcher getInstance(){
        if(instance == null){
            instance = new CallDispatcher();
        }
        return instance;
    }

    /**
     *
     * @param employee
     */
    public void dispatchCall (Employee employee){
        if(employee.employeeGrade.equalsIgnoreCase("Resp")){
            if(availableMgr.size() > 0){
                Employee mgr = availableMgr.remove();
                mgr.hanldeCalls();
            }else if(availableDtr.size() > 0){
                Employee dtr = availableDtr.remove();
                dtr.hanldeCalls();
            }
        }else{
            if(availableDtr.size()>0){
                Employee dtr = availableDtr.remove();
                dtr.hanldeCalls();
            }
        }
    }
}
