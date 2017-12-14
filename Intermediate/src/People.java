import java.util.ArrayList;

public class People {

	public static void main(String[] args) {
		// People search = new Person()
		ArrayList<Person> PersonList = new ArrayList<>();

		Person P = new Person("Dave", 23, "Vet");
		// System.out.println(P);
		Person P2 = new Person("Jane", 39, "Scientist");

		PersonList.add(P);
		PersonList.add(P2);
		// System.out.println(PersonList);

		for (Person arrayCount : PersonList) {
			// System.out.println(arrayCount);

		}

		System.out.println(PersonSearch(PersonList, "Dave"));
	}

	public static Person PersonSearch(ArrayList<Person> PersonList, String searchName) {
		for (Person arrayCount : PersonList) {
			if (arrayCount.name.equals(searchName)) {
				return arrayCount;
			}
		}
		return null;
	}

}
