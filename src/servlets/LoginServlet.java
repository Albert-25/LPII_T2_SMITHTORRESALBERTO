@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    private IUsuarioDAO usuarioDAO = new UsuarioDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        Usuario user = usuarioDAO.validar(usuario, password);
        if (user != null) {
            request.getSession().setAttribute("usuario", user);
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    }
}