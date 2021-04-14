package class13;

public class dogObjects {
	public static void main(String[] args) {
		
		Dog bulldog = new Dog();
		
		bulldog.breed = "Bulldog";
		bulldog.size = "large";
		bulldog.Color="light gray";
		bulldog.Age = 5;
		bulldog.bark();
		bulldog.Sleep();
		bulldog.Run();
		bulldog.Name();
		bulldog.look();
		
		Dog beagle = new Dog();
		
		beagle.breed = "beagle ";
		beagle.size = "large";
		beagle.Color="orange";
		beagle.Age = 6;
		beagle.bark();
		beagle.Sleep();
		beagle.Run();
		beagle.Name();
		beagle.look();
		
		Dog GermanShepherd = new Dog();
		
		GermanShepherd.breed = "German Shepherd ";
		GermanShepherd.size = "large";
		GermanShepherd.Color="white & orange";
		GermanShepherd.Age = 6;
		GermanShepherd.bark();
		GermanShepherd.Sleep();
		GermanShepherd.Run();
		GermanShepherd.Name();
		
	}
}
