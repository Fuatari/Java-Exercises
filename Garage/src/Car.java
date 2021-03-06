
public class Car extends Vehicle {
	public boolean isConvertable;
	public int wheelSize;
	int price;

	public Car(int engineSize, int wheelCount, int wheelSize, boolean isConvertable) {
		super(engineSize, wheelCount);
		this.isConvertable = isConvertable;
		this.wheelSize = wheelSize;
	}

	int carPrice() {
		if (isConvertable) {
			price = 200 + engineSize + (wheelCount * (wheelSize * 5));
		} else {
			price = engineSize + (wheelCount * (wheelSize * 5));
		}
		return price;
	}

	public String toString() {
		return "Car -- Engine Size: " + super.engineSize + ", Wheels: " + super.wheelCount + ", Wheel Size: "
				+ this.wheelSize + ", Convertable? " + this.isConvertable + ", Price: " + carPrice();
	}

}
