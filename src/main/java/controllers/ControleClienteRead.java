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

@WebServlet("/consultar.cliente")
public class ControleClienteRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleClienteRead() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			DAOCliente daoCliente = new DAOCliente();
			
			Cliente cliente = new Cliente();
			cliente.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));
			
			daoCliente.read(cliente);
			
			request.setAttribute("refCliente", cliente);
			RequestDispatcher rd = request.getRequestDispatcher("cliente-consulta.jsp");
			rd.forward(request, response);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
