package lab1.num1;

class JuniorManager extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 1000;
    }

    @Override
    protected void approve(int amount) {
        System.out.println("Младший менеджер одобрил запрос на $" + amount);
    }
}