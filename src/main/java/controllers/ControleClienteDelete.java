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

@WebServlet("/remover.cliente")
public class ControleClienteDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleClienteDelete() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cliente cliente = new Cliente();
		
		try {

			DAOCliente daoCliente = new DAOCliente();
			
			cliente.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));

			daoCliente.delete(cliente);

			RequestDispatcher rd = request.getRequestDispatcher("cliente-deletado.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {

			DAOCliente daoCliente = new DAOCliente();
			String acao = request.getParameter("acao");
			
			if (acao.equals("ex")) {
				
				cliente.setCodigo(Integer.parseInt(request.getParameter("codigo")));

			    daoCliente.delete(cliente);
			    
			    RequestDispatcher rd = request.getRequestDispatcher("cliente-deletado.jsp");
			    rd.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
