@Getter
@Setter
public class Notebook {
private File file;
private List<String> buffer;
private Font font;

public void create()
{
//создание файла
}

public void open(String filename)
{
//открытие файла
}

public void save()
{
//сохранение файла
}

public void saveAs(String filename)
{
//сохранение файла как...
}

public List<String> find(String str)
{
//поиск по совпадению
}

public int replace(String from, String to)
{
//замена по совпадению
}

}
