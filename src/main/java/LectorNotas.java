import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;

public class LectorNotas extends MainWindow<AlumnoViewModel> {
	private AlumnoViewModel alumnoVM = new AlumnoViewModel();
	public LectorNotas() {
		super(new AlumnoViewModel());
	}

	@Override
	public void createContents(Panel panelActions) {
		
		setTitle("Lector De Notas");
		
		Panel mainLayout = new Panel(panelActions);
		mainLayout.setLayout(new HorizontalLayout());
		
		Panel columns = new Panel(mainLayout);
		columns.setLayout(new ColumnLayout(2));
		
		new Label(columns).setText("Token");
		TextBox Token = new TextBox(columns);
		Token.bindValueToProperty("token");
		Token.setWidth(114);
		
		new Label(columns).setText("Legajo");
		TextBox Legajo = new TextBox(columns);
		Legajo.bindValueToProperty("alumno.code");
		Legajo.setWidth(114);
		
		new Label(columns).setText("Nombre");
		TextBox Nombre = new TextBox(columns);
		Nombre.bindValueToProperty("alumno.first_name");
		Nombre.setWidth(114);
		
		new Label(columns).setText("Apellido");
		TextBox Apellido = new TextBox(columns);
		Apellido.bindValueToProperty("alumno.last_name");
		Apellido.setWidth(114);
		
		new Label(columns).setText("Usuario de GitHub");
		TextBox UsuarioDeGitHub = new TextBox(columns);
		UsuarioDeGitHub.bindValueToProperty("alumno.github_user");
		UsuarioDeGitHub.setWidth(114);
		
		
		new Button(columns).setCaption("Modificar Datos").onClick(()-> this.getModelObject().actualizarDatos());
		new Button(columns).setCaption("Consultar Datos").onClick(()-> this.getModelObject().consultarDatos());
		
		Panel rightPanel = new Panel(mainLayout);
		Table<Tarea> table = new Table<Tarea>(rightPanel, Tarea.class);
		table.setHeight(200);
		table.setWidth(420);
		table.bindItemsToProperty("tareas.assignments");
		table.setNumberVisibleRows(6);
		new Button(rightPanel).setCaption("Ver Notas").onClick(()-> this.getModelObject().verNotas());
		
		new Column<Tarea>(table)
	    .setTitle("ID")
	    .setFixedSize(40)
	    .bindContentsToProperty("id");
		
		new Column<Tarea>(table)
	    .setTitle("Nombre")
	    .setFixedSize(100)
	    .bindContentsToProperty("title");
		
		new Column<Tarea>(table)
	    .setTitle("Descripcion")
	    .setFixedSize(100)
	    .bindContentsToProperty("description");
		
		new Column<Tarea>(table)
	    .setTitle("Nota Actual")
	    .setFixedSize(100)
	    .bindContentsToProperty("grades")
	    .setTransformer(new NotasToStringTransformer());
		
		new Column<Tarea>(table)
		.setTitle("Aprobado")
		.setFixedSize(100)
		.bindContentsToProperty("grades")
		.setTransformer(new NotasToBooleanTransformer());
		
	}
	
	public static void main(String[] args) {
		new LectorNotas().startApplication();
	}

}
