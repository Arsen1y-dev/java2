package lab1.num1;

class CallCenterHandler extends ComplaintHandler {
    @Override
    protected boolean canHandle(Complaint complaint) {
        return complaint.getSeverity() <= 2;
    }

    @Override
    protected void resolveComplaint(Complaint complaint) {
        System.out.println("Колл-центр обрабатывает жалобу: " + complaint.getDescription());
        complaint.setResolved(true);
        System.out.println("Жалоба решена колл-центром.");
    }
}
