package lab1.num1;


class LegalDepartmentHandler extends ComplaintHandler {
    @Override
    protected boolean canHandle(Complaint complaint) {
        return complaint.getSeverity() == 5;
    }

    @Override
    protected void resolveComplaint(Complaint complaint) {
        System.out.println("Юридический отдел обрабатывает жалобу: " + complaint.getDescription());
        complaint.setResolved(true);
        System.out.println("Жалоба решена юридическим отделом.");
    }
}