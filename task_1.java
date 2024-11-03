@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    // Проверяем, что метод возвращает true для возраста 19
    assertEquals("Ожидается, что в возрасте 19 лет", true, isAdult);
}
