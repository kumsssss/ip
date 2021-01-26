public class Event extends Task{
    Date date;
    String duration;

    public Event(String description, Date date, String duration, String type) {
        super(description, type);
        this.date = date;
        this.duration = duration;
    }

    /**
     * converts the Event object to a String
     *
     * @return String showing the details of the Event object
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + date.toFormattedString() + " " + duration + ")";
    }
}
