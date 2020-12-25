package ua.lviv.lgs.task2;

public class Car {

	private String color;
	private boolean available;
		private Helm helm;
		private Wheel wheel;
		private Body body;
		
		public Car(String color, boolean available, Helm helm, Wheel wheel, Body body) {
			super();
			this.color = color;
			this.available = available;			
			this.helm = helm;
			this.wheel = wheel;
			this.body = body;
		}
		
		public String changColor(){
			if(!(this.color == "red" || this.color == "green" || this.color == "blue")) {
				this.color = "red";
				return this.color;
			}
			if(this.color == "red") {
				this.color = "green";
				return this.color;
			}
			if(this.color == "green") {
				this.color = "blue";
				return this.color;
			}
			if(this.color == "blue") {
				this.color = "red";
				return this.color;
			}
			return this.color;
		}
		
		public boolean changAvailable() {
			this.available = !this.available;
			return  this.available;			
		}
		
		public Helm changHelm() {
			this.helm.changBigger();
			return helm;			
		}
		
		public Wheel changWheel() {
			this.wheel.changBigger();
			return wheel;			
		}
		
		public Body changBody() {
			this.body.changlength();
			return body;			
		}
		

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isAvailable() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}

		public Helm getHelm() {
			return helm;
		}

		public void setHelm(Helm helm) {
			this.helm = helm;
		}

		public Wheel getWheel() {
			return wheel;
		}

		public void setWheel(Wheel wheel) {
			this.wheel = wheel;
		}

		public Body getBody() {
			return body;
		}

		public void setBody(Body body) {
			this.body = body;
		}

		public String toString() {
			return "Car [color=" + color + ", available=" + available + ", helm=" + helm + ", wheel=" + wheel
					+ ", body=" + body + "]";
		}
			
}
