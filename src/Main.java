public class Main {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.create();
		notebook.save();
		Theme theme = new Theme();
		theme.setTextColor(Color.RED);
	}
}