import org.openjdk.jol.vm.VM;

/*

To set up JOL https://openjdk.java.net/projects/code-tools/jol/
---------------------------------------------------------------
* Download from https://github.com/openjdk/jol
* Unpack into some local directory
* Build with mvn clean install
* Copy jol-core-0.17-SNAPSHOT.jar from jol-master\jol-core\target\ to your current directory where HelloWorld.java is.

To compile:
javac -cp jol-core-0.17-SNAPSHOT.jar/;. HelloWorld.java

To run:
java -cp jol-core-0.17-SNAPSHOT.jar/;. HelloWorld

To disassemble:
javap -verbose HelloWorld.class

*/

// More details: https://metebalci.com/blog/digging-into-jep-280-indify-string-concatenation/

class MyString {

}

class HelloWorld {
  static {
    String str1 = "Hello world!";
    String str2 = new String(str1);
    String str3 = new String(str1).intern();
    String str4 = str1;

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(new MyString().hashCode());
    System.out.println(new MyString().hashCode());
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    System.out.println(str1 == "Hello world!");
    System.out.println(str3);

    System.out.println("The memory address of \"str1\" is " + VM.current().addressOf(str1));
    System.out.println("The memory address of \"str2\" is " + VM.current().addressOf(str2));
    System.out.println("The memory address of \"str3\" is " + VM.current().addressOf(str3));
    System.out.println("The memory address of \"str4\" is " + VM.current().addressOf(str4));
    System.out.println("The memory address of \"Hello world!\" is " + VM.current().addressOf("Hello world!"));

    String str = "Hello " + "World" + "!"; // How many objects created? Of those, how many in the pool?
    //String str = "World";
    //str = str + "Hello " + "!"; // How many objects created? Of those, how many in the pool?
    //str += "Hello " + "!"; // How many objects created? Of those, how many in the pool?
    // See https://www.geeksforgeeks.org/difference-between-concat-and-operator-in-java/
    //str = str.concat("Hello " + "!");
    //str = "Hello " + str + "!"; // How many objects created? Of those, how many in the pool?
    System.out.println(str);
  }
  public static void main(String... args) {
    HelloWorld hw = new HelloWorld();
    System.out.println(hw);
  }
}