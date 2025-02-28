package lab1.num1;

class FinancialDepartmentHandler extends ComplaintHandler {
    @Override
    protected boolean canHandle(Complaint complaint) {
        return !complaint.isResolved();
    }

    @Override
    protected void resolveComplaint(Complaint complaint) {
        System.out.println("Финансовый отдел рассматривает жалобу: " + complaint.getDescription());
        complaint.setResolved(true);
        System.out.println("Жалоба решена финансовым отделом.");
    }
}