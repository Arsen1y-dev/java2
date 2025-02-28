package lab1.num3;

public class Main {
    public static void main(String[] args) {
        Transport businessCar = TransportFactory.createTransport("business");
        System.out.println("BusinessCar: " + businessCar.getSpecifications());

        Transport familyVan = TransportFactory.createTransport("family");
        System.out.println("FamilyVan: " + familyVan.getSpecifications());

        Transport motorbike = TransportFactory.createTransport("delivery");
        System.out.println("Motorbike: " + motorbike.getSpecifications());
    }
}
