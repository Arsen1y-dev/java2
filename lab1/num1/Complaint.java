package lab1.num1;


class Complaint {
    private String description;
    private int severity; // Уровень серьезности (1 - низкий, 5 - критический)
    private boolean resolved = false;

    public Complaint(String description, int severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "description='" + description + '\'' +
                ", severity=" + severity +
                ", resolved=" + resolved +
                '}';
    }
}
