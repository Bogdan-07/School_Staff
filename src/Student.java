public class Student extends Staff {
    private float avgGrade;
    private String currentSubject;

    public Student(int id,String firstName,String lastName, float avgGrade, String currentSubject){
        super(id,firstName,lastName);
        this.avgGrade = avgGrade;
        this.currentSubject = currentSubject;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getCurrentSubject() {
        return currentSubject;
    }

    public void setCurrentSubject(String currentSubject) {
        this.currentSubject = currentSubject;
    }

    @Override
    public String toString() {
        return  "id: "+getId()+
                "firstName: "+getFirstName()+
                "lastName: "+getLastName()+
                "arrivalTime: "+getArrivalTime()+
                "avgGrade: "+getAvgGrade()+
                "currentSubject: "+getCurrentSubject();
    }
}
