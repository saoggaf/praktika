/**
 * Семантика PHP
 * <p>
 * Класс реализует интерфейс семантики {@link Semantic}
 * для языка PHP
 *
 * @author Мелещенко Николай
 * @version 1.0
 * @see Semantic
 */
@Getter
public class Php implements Semantic {
    private List<Rules> rules;

    /**
     * Конструктор
     */
    Php() {
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