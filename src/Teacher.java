public class Teacher extends Staff {
    private String subject;
    private String currentClassroom;

    public Teacher(int id,String firstName,String lastName, String subject, String currentClassroom){
        super(id,firstName,lastName);
        this.subject = subject;
        this.currentClassroom = currentClassroom;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentClassroom() {
        return currentClassroom;
    }
    public void setCurrentClassroom(String currentClassroom) {
        this.currentClassroom = currentClassroom;
    }

    @Override
    public String toString() {
        return super.toString() + "subject: " +getSubject()+ "currentClassroom: " +getCurrentClassroom();
    }
}
