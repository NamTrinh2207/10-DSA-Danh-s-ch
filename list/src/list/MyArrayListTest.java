package list;

public class MyArrayListTest {
    ArrayList<Person> personArrayList;
    public MyArrayListTest(){
        personArrayList = new ArrayList<>(5);
        personArrayList.add(new Person("Nam",26));
        personArrayList.add(new Person("Hoàng",26));
        personArrayList.add(new Person("Lực",26));
        personArrayList.add(new Person("Tân",35));
    }
    public static void main(String[] args) {
        MyArrayListTest myArrayListTest = new MyArrayListTest();
        myArrayListTest.display();

        System.out.println(myArrayListTest.personArrayList.get(3));
        System.out.println("--------------------------");

        myArrayListTest.personArrayList.remove(3);
        myArrayListTest.display();

        myArrayListTest.personArrayList.copy();
        myArrayListTest.display();

        System.out.println(myArrayListTest.personArrayList.indexOf("abc"));

    }

    public void display(){
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }
        System.out.println("---------------------------");
    }
}
