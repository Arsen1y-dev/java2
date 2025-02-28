package lab1.num1;


abstract class ComplaintHandler {
    protected ComplaintHandler nextHandler;

    public void setNextHandler(ComplaintHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleComplaint(Complaint complaint) {
        if (canHandle(complaint)) {
            resolveComplaint(complaint);
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(complaint);
        } else {
            System.out.println("Жалоба не может быть обработана ни одним из уровней.");
        }
    }

    protected abstract boolean canHandle(Complaint complaint);

    protected abstract void resolveComplaint(Complaint complaint);
}
