package lab1.num3;

class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "delivery":
                return new Motorbike();
            default:
                throw new IllegalArgumentException("Неизвестный тип транспорта: " + type);
        }
    }
}