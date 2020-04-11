package main.com.crackingcodinginterview.practice.OOD.CallCenterDesign;

public class Director extends Employee {

    private CallDispatcher callDispatcher;
    public Director(int id){
        this.employeeId = id;
        this.employeeGrade = "Dtr";
        callDispatcher = CallDispatcher.getInstance();
    }

    @Override
    public void hanldeCalls() {
        //Handles the call. Can't dispatch anywhere
    }
}
