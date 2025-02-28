package lab1.num1;

public class Main {
    public static void main(String[] args) {

        CallCenterHandler callCenter = new CallCenterHandler();
        ManagerHandler manager = new ManagerHandler();
        LegalDepartmentHandler legal = new LegalDepartmentHandler();
        FinancialDepartmentHandler financial = new FinancialDepartmentHandler();


        callCenter.setNextHandler(manager);
        manager.setNextHandler(legal);
        legal.setNextHandler(financial);


        Complaint complaint1 = new Complaint("жалоба уровня менеджера", 3);
        Complaint complaint2 = new Complaint(":жалоба уровня колл-центра", 1);
        Complaint complaint3 = new Complaint("жалоба уровня юридического отдела", 5);
        Complaint complaint4 = new Complaint("жалоба уровня колл-центра", 2);
        Complaint complaint5 = new Complaint("жалоба уровня менеджера", 4);


        System.out.println("Обрабатываем жалобу 1:");
        callCenter.handleComplaint(complaint1);

        System.out.println("\nОбрабатываем жалобу 2:");
        callCenter.handleComplaint(complaint2);

        System.out.println("\nОбрабатываем жалобу 3:");
        callCenter.handleComplaint(complaint3);

        System.out.println("\nОбрабатываем жалобу 4:");
        callCenter.handleComplaint(complaint4);

        System.out.println("\nОбрабатываем жалобу 5:");
        callCenter.handleComplaint(complaint5);
    }
}