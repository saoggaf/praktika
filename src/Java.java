/**
 * Семантика JAVA
 * <p>
 * Класс реализует интерфейс семантики {@link Semantic}
 * для языка JAVA
 *
 * @author Мелещенко Николай
 * @version 1.0
 * @see Semantic
 */
@Getter
public class Java implements Semantic {
    private List<Rules> rules;

    /**
     * Конструктор
     */
    Java() {
        //создание правил
    }

    /**
     * Проверка правил для строк
     *
     * @param strings строки
     */
    void check(List<String> strings) {
        //проверка правил
    }
}