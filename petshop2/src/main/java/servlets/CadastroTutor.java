package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pet;
import models.Tutor;
import repositories.PetRepository;
import repositories.TutorRepository;


@WebServlet("/tutores")
public class CadastroTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TutorRepository repository= new TutorRepository();
	
	



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		
		Tutor novoTutor = new Tutor();
			
			novoTutor.setNome(request.getParameter("nome"));
		
			
			repository.cadastra(novoTutor);
			
			
			PrintWriter writer = response.getWriter();
			writer.printf("<h1>Nome do tutor cadastrado: %s</h1>", novoTutor.getNome());
		}
	
		
	}

	



