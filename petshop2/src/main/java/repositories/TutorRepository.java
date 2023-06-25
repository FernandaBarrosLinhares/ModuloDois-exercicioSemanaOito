package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Pet;
import models.Tutor;

public class TutorRepository {

		private static List<Tutor> tutores = new ArrayList<>();
		private  static int tutorSequence = 0;
		
		public void cadastra (Tutor tutor) {
			tutor.setId(incrementaSequence());
			tutores.add(tutor);
		}
		
		private static int incrementaSequence() {
			return ++tutorSequence;
			
		}
		public List<Tutor> busca(){
			return tutores;
		}

}
