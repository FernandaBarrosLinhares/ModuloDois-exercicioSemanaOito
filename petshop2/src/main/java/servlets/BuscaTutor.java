package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pet;
import models.Tutor;
import repositories.PetRepository;
import repositories.TutorRepository;

public class BuscaTutor  extends HttpServlet {
	
private static final long serialVersionUID = 1L;
	
	private TutorRepository repository = new TutorRepository();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		List<Tutor> tutores = repository.busca();
		PrintWriter writer = response.getWriter();
		writer.print("<ul>");
		
		for (Tutor tutor: tutores) {
			writer.printf("<li>Nome Pet:%s</li>", pet.getNome());
		}
		writer.print("</ul>");
	}

}
