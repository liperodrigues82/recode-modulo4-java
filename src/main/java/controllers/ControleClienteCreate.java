package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.Cliente;
import modelo.persistencia.DAOCliente;

@WebServlet("/cadastrar.cliente")
public class ControleClienteCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ControleClienteCreate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			DAOCliente daoCliente = new DAOCliente();
			
			Cliente cliente = new Cliente();
			cliente.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));
			cliente.setNome(request.getParameter("txtNome"));
			cliente.setRg(request.getParameter("txtRG"));
			cliente.setEmail(request.getParameter("txtEmail"));
			cliente.setTelefone(request.getParameter("txtTelefone"));
			
			daoCliente.create(cliente);
			
			RequestDispatcher rd = request.getRequestDispatcher("cliente-cadastrado.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
