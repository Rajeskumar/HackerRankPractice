package main.com.crackingcodinginterview.practice.OOD.CallCenterDesign;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {

    List<Employee> respondent;
    List<Employee> manager;
    List<Employee> director;

    CallDispatcher callDispatcher;

    public CallCenter() {
        respondent = new ArrayList<>();
        manager = new ArrayList<>();
        director = new ArrayList<>();
        callDispatcher = CallDispatcher.getInstance();
    }

    public void addEmployee(Employee employee){
        switch (employee.employeeGrade){
            case "Resp":
                respondent.add(employee);
                callDispatcher.availableResp.add(employee);
                break;
            case "Mgr":
                manager.add(employee);
                callDispatcher.availableMgr.add(employee);
                break;
            case "Dtr":
                director.add(employee);
                callDispatcher.availableDtr.add(employee);
                break;

        }
    }

    public void dispatchCall(){
        if(callDispatcher.availableResp.size()>0){
            callDispatcher.availableResp.remove().hanldeCalls();
        }

    }
}
