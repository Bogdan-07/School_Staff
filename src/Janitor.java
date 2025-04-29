public class Janitor extends Staff {
    private int roomsToClean;

    public Janitor(int id,String firstName,String lastName, int roomsToClean){
        super(id,firstName,lastName);
        this.roomsToClean = roomsToClean;
    }

    public int getRoomsToClean() {
        return roomsToClean;
    }
    public void setRoomsToClean(int roomsToClean) {
        this.roomsToClean = roomsToClean;
    }

    @Override
    public String toString() {
        return super.toString() +"roomsToClean: " +getRoomsToClean();
    }
}
