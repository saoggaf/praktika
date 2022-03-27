/**
 * Главный класс приложения
 *
 * @author Мелещенко Николай
 * @version 1.0
 */
public class Main {
    /**
     * Точка входа приложения
     *
     * @param args параметры
     */
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Theme theme = new Theme();
        theme.setTextColor(Color.RED);
        notebook.setTheme(theme);
        Semantic semantic = new Java();
        notebook.setSemantic(semantic);
        notebook.create("notebook1.txt");
        notebook.saveAs("notebook2.txt");
    }
}