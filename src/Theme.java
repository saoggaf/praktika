/**
 * Тема оформления
 * <p>
 * Класс реализует функционал темы оформления
 *
 * @author Мелещенко Николай
 * @version 1.0
 */
@Getter
@Setter
public class Theme {
    private String name;
    private Font font;
    private Color backgroundColor;
    private Color textColor;
    private Image backgroundImage;
    private Markup markup;
    private List<Image> images;

    /**
     * Сохранение темы оформления в файл
     *
     * @param filename название файла
     */
    public void save(String filename) {
        //сохранение темы в файл
    }

    /**
     * Загрузка темы оформления из файла
     *
     * @param filename название файла
     */
    public void load(String filename) {
        //загрузка темы из файла
    }

    /**
     * Создание темы на основании другой
     *
     * @param theme основа для темы
     */
    public basedOn(Theme theme) {
        //создание темы на основании другой
    }

}