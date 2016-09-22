package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar as informa��es da p�gina JSP
		String usuario = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		//Validar 
		if (usuario.equals("fiap") && senha.equals("1234")){
			req.setAttribute("olalogin", usuario);
			//Redireciona para a p�gina home.jsp
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}else{
			//Passar informa��o para a p�gina
			req.setAttribute("qualquer", "Usu�rio e/ou senha inv�lidos");
			//Redirecionar o usu�rio para a p�gina de Login
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
}









