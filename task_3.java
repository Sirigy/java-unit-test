@RunWith(Parameterized.class)
public class CheckIsAdultTest {

  private final int age;
  private final boolean expectedResult;

  public CheckIsAdultTest(int age, boolean expectedResult) {
    this.age = age;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Object[][] getTestData() {
    return new Object[][] {
      {17, false},  // Under 18, not an adult
      {18, true},   // Adult in many places
      {20, true},   // Still an adult
      {21, true},   // Adult when 21 is required
      
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age); 
    assertEquals("Возраст " + age + " должен вернуть " + expectedResult, expectedResult, isAdult);
  }
}
