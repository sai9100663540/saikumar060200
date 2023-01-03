public class AutomaticCar {

    public class Automatic extends Car {

        public void selfDrive(){
            System.out.println("Self Drive Car");

        }

        public void main(String[] args) {
            AutomaticCar ac = new AutomaticCar();
            Car car = new Automatic();
            ac.Drive();
            ac.selfDrive();


        }
    }

    private void selfDrive() {
    }

    private void Drive() {
    }
}
