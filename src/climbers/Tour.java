package climbers;

import java.util.Date;
import java.util.Objects;

public class Tour {
    private String id;
    private String description;
    private int days;
    private Date startDate;

    public Tour(String id, String description, int days, Date startDate) {
        this.id = id;
        this.description = description;
        this.days = days;
        this.startDate = startDate;
    }

    public Tour(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", days=" + days +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && Objects.equals(id, tour.id) && Objects.equals(description, tour.description) && Objects.equals(startDate, tour.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, days, startDate);
    }
}
