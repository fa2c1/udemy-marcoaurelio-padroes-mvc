import controller.ClienteController;
import model.Cliente;
import view.ClienteFormulario;

public class App {
    public static void main(String[] args) {
        // Model
        Cliente model = new Cliente();
        // View
        ClienteFormulario view = new ClienteFormulario();
        // Controller
        ClienteController controller = new ClienteController(model, view);
        controller.registerControls();

        view.pack();
        view.setVisible(true);
    }

}
