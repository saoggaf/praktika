/**
 * Семантика C
 * <p>
 * Класс реализует интерфейс семантики {@link Semantic}
 * для языка C
 *
 * @author Мелещенко Николай
 * @version 1.0
 * @see Semantic
 */
@Getter
public class С implements Semantic {
    private List<Rules> rules;

    /**
     * Конструктор
     */
    C() {
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