import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

  @Test
  public void expectPassedTest(){
    Person person = new Person("Ana", 2000);
    Assert.assertEquals("Ana", person.getName());
    Assert.assertEquals(2000, person.getBirthYear());
    Assert.assertFalse(person.isTeenager());
  }

}
