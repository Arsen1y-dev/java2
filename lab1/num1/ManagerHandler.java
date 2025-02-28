package lab1.num1;

class ManagerHandler extends ComplaintHandler {
    @Override
    protected boolean canHandle(Complaint complaint) {
        return complaint.getSeverity() <= 4; // Менеджер обрабатывает жалобы средней сложности
    }

    @Override
    protected void resolveComplaint(Complaint complaint) {
        System.out.println("Менеджер обрабатывает жалобу: " + complaint.getDescription());
        complaint.setResolved(true);
        System.out.println("Жалоба решена менеджером.");
    }
}

