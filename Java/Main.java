class Main{
    public static void main(String[] args) {
        System.out.println("\nHola mundo");
        Car car = new Car("AMQ321", new Account("Kenet", "HYGT234"));
        car.passengenger = 4;
        car.printDataCar();
        

        Car car2 = new Car("AMQ321", new Account("Lisbeth", "GBSFT123"));
        car2.passengenger = 3;
        car2.printDataCar();
    }
}