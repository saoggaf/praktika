/**
 * Блокнот
 * <p>
 * Класс реализует базовый функционал блокнота
 *
 * @author Мелещенко Николай
 * @version 1.0
 */
@Getter
@Setter
public class Notebook {
    private File file;
    private List<String> buffer;
    private Theme theme;
    private Semantic semantic;

    /**
     * Создание файла блокнота
     *
     * @param filename название файла
     */
    public void create(String filename) {
        //создание файла
    }

    /**
     * Открыть файл блокнота
     *
     * @param filename название файла
     */
    public void open(String filename) {
        //открытие файла
    }

    /**
     * Сохранить файл блокнота
     */
    public void save() {
        //сохранение файла
    }

    /**
     * Сохранить файл блокнота под другим названием
     *
     * @param filename название файла
     */
    public void saveAs(String filename) {
        //сохранение файла как...
    }

    /**
     * Поиск строк по совпадению подстроки
     *
     * @param str подстрока для поиска совпадений
     * @return строки с данной подстрокой str
     */
    public List<String> find(String str) {
        //поиск по совпадению
    }

    /**
     * Замена подстрок from на подстроки to
     *
     * @param from подстроки для замены
     * @param to   подстроки замены
     * @return количество замен
     */
    public int replace(String from, String to) {
        //замена по совпадению
    }

}
