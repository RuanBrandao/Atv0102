package aula;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			String nome = request.getParameter("nome");
			String idade = request.getParameter("idade");
			String cpf = request.getParameter("cpf");
			String esc = request.getParameter("escola");
			String expprof = request.getParameter("profissional");
			String cor = request.getParameter("cor");
			Cookie cookie1 = new Cookie("nome",nome);
			Cookie cookie2 = new Cookie("idade",idade);
			Cookie cookie3 = new Cookie("cpf",cpf);
			Cookie cookie4 = new Cookie("escola",esc);
			Cookie cookie5 = new Cookie("profissional",expprof);
			Cookie cookie6 = new Cookie("cor",cor);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);
			response.addCookie(cookie4);
			response.addCookie(cookie5);
			response.addCookie(cookie6);
			PrintWriter writer = response.getWriter();
			writer.append("<HTML> <BODY> ");
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> Nome: "+cookie1.getValue());
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> Idade: "+cookie2.getValue());
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> CPF: "+cookie3.getValue());
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> Escola: "+cookie4.getValue());
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> Profissional: "+cookie5.getValue());
			writer.append("<br><h2 style=color:"+cookie6.getValue()+"> Cor: "+cookie6.getValue());	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
