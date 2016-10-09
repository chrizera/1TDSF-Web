package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jobs.bean.Empresa;
import br.com.fiap.jobs.bo.EmpresaBO;

@WebServlet("/vagaServlet")
public class VagaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acao = req.getParameter("acao");
		
		EmpresaBO empresaBo = new EmpresaBO();
		
		switch (acao) {
		case "abrir-cadastro":
			//Recuperar todas as empresas no banco de dados
			List<Empresa> lista = empresaBo.listarTodos(); 
			//Passar a lista de empresa para JSP
			req.setAttribute("listaEmpresa", lista);
			//Redirecionar para a página JSP
			req.getRequestDispatcher("cadastro-vaga.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}
	
}






