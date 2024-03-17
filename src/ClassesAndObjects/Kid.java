package ClassesAndObjects;

public class Kid {
	
	String name;
	int age;
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void play() {
		System.out.println(this.name +" is playing... ");
	}
	public void studyingclass(int stud) {
		System.out.println(stud +"standard...");
	}
	public void studyingclass(int age, int stud) {
		System.out.println(stud +"standard...");
	}
}
