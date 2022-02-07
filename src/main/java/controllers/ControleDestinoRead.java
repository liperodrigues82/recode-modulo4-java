package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.destino.Destino;
import modelo.persistencia.DAODestino;

@WebServlet("/consultar.destino")
public class ControleDestinoRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleDestinoRead() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			
			DAODestino daoDestino = new DAODestino();
			
			Destino destino = new Destino();
			destino.setNumeroBilhete(Integer.parseInt(request.getParameter("txtNumeroBilhete")));
			
			daoDestino.read(destino);
			
			request.setAttribute("refDestino", destino);
			RequestDispatcher rd = request.getRequestDispatcher("destino-consulta.jsp");
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
