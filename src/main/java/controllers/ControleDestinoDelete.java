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

@WebServlet("/remover.destino")
public class ControleDestinoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleDestinoDelete() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Destino destino = new Destino();
		
		try {
			
			DAODestino daoDestino = new DAODestino();
			
			destino.setNumeroBilhete(Integer.parseInt(request.getParameter("txtNumeroBilhete")));
			
			daoDestino.delete(destino);
			
			RequestDispatcher rd = request.getRequestDispatcher("destino-deletado.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {

			DAODestino daoDestino = new DAODestino();
			String acao = request.getParameter("acao");
	
			if (acao.equals("ex")) {
				
				destino.setNumeroBilhete(Integer.parseInt(request.getParameter("codigo")));

			    daoDestino.delete(destino);
			    
			    RequestDispatcher rd = request.getRequestDispatcher("destino-deletado.jsp");
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
