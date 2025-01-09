import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();

        u.setNome("teste");
        u.setLogin("teste");
        u.setSenha("teste");
        u.setEmail("teste@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
