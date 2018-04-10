
public enum Transport {

	CAR(65),BOAT(22),AIRPLANE(600),TRAIN(70),TRUCK(55);
	
	private int speed;
	Transport(int speed){this.speed = speed;}
	
	int getSpeed() {return speed;}
	
}
