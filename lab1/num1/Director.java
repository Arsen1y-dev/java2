package lab1.num1;

class Director extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 50000;
    }

    @Override
    protected void approve(int amount) {
        System.out.println("Директор одобрил запрос на $" + amount);
    }
}