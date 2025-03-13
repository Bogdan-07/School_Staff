import java.util.ArrayList;

public class StaffManager {
    private ArrayList<Staff> staffManager = new ArrayList<Staff>();
    private int index;
    private final int head = 0;

    public StaffManager(){
        index = head;
    }

    public void setStaffManager(ArrayList<Staff> staffManager) {
        this.staffManager = staffManager;
    }
    public String getStaffAtIndex(){
        return staffManager.get(index).toString();
    }
    public void deleteStaffAtIndex(){
        staffManager.remove(index);
    }
    public String getAllStaff(){
        String result = "";
        for (Staff temp : staffManager)
            result += temp.toString() + "\n";
        return result;
    }
    public void increaseIndex(){
        if(index == staffManager.size()-1)
            index = head;
        else
            index++;
    }
    public void decreaseIndex(){
        if(index == head)
            index = staffManager.size()-1;
        else
            index--;
    }
    public int getIndex(){
        return index;
    }
}
