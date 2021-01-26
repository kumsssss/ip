public class Event extends Task{
    protected Date date;
    protected String duration;

    public Event(String description, Date date, String duration, String type) {
        super(description, type);
        this.date = date;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + date.toFormattedString() + " " + duration + ")";
    }
}
