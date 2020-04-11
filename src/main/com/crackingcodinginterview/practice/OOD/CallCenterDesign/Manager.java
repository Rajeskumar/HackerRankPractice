package main.com.crackingcodinginterview.practice.OOD.CallCenterDesign;

public class Manager extends Employee{

    private CallDispatcher callDispatcher;
    public Manager(int id){
        this.employeeId = id;
        this.employeeGrade = "Mgr";
        callDispatcher = CallDispatcher.getInstance();
    }

    @Override
    public void hanldeCalls() {
        boolean needDispatch = true;

        //Implement logic to decide call is done or can't handle and dispatch. Update needDispatch = false if not

        if(needDispatch){
            callDispatcher.dispatchCall(this);
        }
    }
}
