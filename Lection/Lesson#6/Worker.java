public class Worker {
    int id;
    int salari;
    String firstName;
    String LastName;

    @Override
    public String toString() {
       return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, LastName, salari );

    }


    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;

    }

    @Override
    public int hashCode() {
        return id;
    }
}