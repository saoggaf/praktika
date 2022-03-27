/**
 * GitHub
 * <p>
 * Класс реализует базовый функционал GitHub
 *
 * @author Мелещенко Николай
 * @version 1.0
 */
@Getter
@Setter
public class GitHub {
    private String username;
    private String password;

    /**
     * Создание репозитория
     *
     * @param name название
     * @param nb   блокнот
     */
    public void createRepository(String name, Notebook nb) {

    }

    /**
     * Удаление репозитория
     *
     * @param link ссылка на репозиторий
     */
    public void deleteRepository(String link) {

    }

    /**
     * Добавление блокнота в репозиторий
     *
     * @param note блокнот
     */
    public void addNotebookToRepository(Notebook note) {

    }

    /**
     * Удаление блокнота из репозитория
     *
     * @param link     ссылка на репозиторий
     * @param notebook блокнот
     */
    public void deleteNotebookFromRepository(String link, Notebook notebook) {

    }

}