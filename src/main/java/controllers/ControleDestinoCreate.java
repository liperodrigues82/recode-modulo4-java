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

@WebServlet("/cadastrar.destino")
public class ControleDestinoCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleDestinoCreate() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			DAODestino daoDestino = new DAODestino();
			
			Destino destino = new Destino();
			destino.setNumeroBilhete(Integer.parseInt(request.getParameter("txtNumeroBilhete")));
			destino.setOrigem(request.getParameter("txtOrigem"));
			destino.setDestino(request.getParameter("txtDestino"));
			destino.setDataEmbarque(request.getParameter("txtDataEmbarque"));
			destino.setHorarioEmbarque(request.getParameter("txtHorarioEmbarque"));
			
			daoDestino.create(destino);
			
			RequestDispatcher rd = request.getRequestDispatcher("destino-cadastrado.jsp");
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
