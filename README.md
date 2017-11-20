Welcome to the SimpleUnitTest wiki!

## **Some notes about unit test:-**

1-You do not need to learn any framework to start Unit testing, there are many testing frameworks out there, like Mockito or PowerMock or Robolectric, each framework is available to solve a problem that will exist if the code is not designed to be testable .

2-TDD (Test Driven Development) is a way of Development where we write the test code first, then we write the code that passes these tests ... this skill is a different skill than Unit testing.

3-A Unit test is a "method" that tests the behavior of another method with certain input, so we can have multiple Unit tests for a single method, each Unit test is testing the result of the target method after giving it a certain input.

## Example
If we want to test this method


    public class TestClass {

    //This Class Contain All Methods That I Want To Test It.

    public int Add(int num1, int num2){
        return num1+num2;
    }

    public int Sub(int num1, int num2){
        return (num1-num2);
    }

} 

Now we want to make sure that the add() method is working properly, so we will make Unit tests for this method.

To create a Test class on Android Studio, you can press ( Ctrl + Shift + T) in any class (or select the class name and press Alt + Enter, then select Create Test), a menu will appear, you can select "Create New Test", then a wizard will be opened, do not edit any thing and press OK, another wizard will be open, under the "Directory Structure", choose the option which will be similar to this pattern [...\app\src\test\java\com\...] ... do not choose [...\app\src\androidTest\java\com\...]

Now we need to make a Unit tests that makes sure that the usage for the target method is executed properly, so we will create the Unit Test as follows :


    public class TestClassTest {

    @Test
    public void addWithTwoNumberThenReturnResultAsFifteen() throws Exception {
        int input1=10;
        int input2=5;
        int excepected=15;
        // arrange :
        TestClass aClass=new TestClass();
        // act :
        int output=aClass.Add(input1,input2);
        // assert :
        assertEquals(excepected,output);
    }
}
### **Unit test consist of 4 Main pois** :+1: 

* Unit Test Name : the name of the unit test must explain exactly what is happening, because if it failed, you should know what happened from the name of the Unit test in the logs, without looking inside the test code it self, the name should be similar to this pattern: [methodName]With[Input]Then[ ExpectedResult ] () this convention can be changed, but at the end, all the Unit tests must follow one convention that describes what happens

* Arrange : this part we prepare our Objects that will be used in the Unit test
* Act : this part we do the action that will affect the target method

* Assert : this part, we make sure that the expected behavior is done ... proper Unit tests does not have more than ONE assertion statement, and JUnit provides an Assert class that has methods that checks if the result is as we expect, else it will crash and make the Unit test fail
