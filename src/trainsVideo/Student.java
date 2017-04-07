package trainsVideo;

public class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
    public String toString() {
       return "Name is: "+this.name+" & Age is: "+this.age;
    }
	public static void main(String[] args) {
		Student [] student = new Student[]{
			new Student("Tom",22),
			new Student("Katrin",23),
			new Student("Lyli",25),
		};
		
		for(Student ourStudent:student){
			System.out.println(ourStudent);
		}
		for(int i=0;i<student.length;i++){
			System.out.println(student[i].getName()+" "+ student[i].getAge());
		}
	}
}