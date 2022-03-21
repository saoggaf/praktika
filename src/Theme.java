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

public void save(String filename) {
//сохранение темы в файл
}

public void load(String filename) {
//загрузка темы из файла
}

public basedOn(Theme theme) {
//создание темы на основании другой
}

}