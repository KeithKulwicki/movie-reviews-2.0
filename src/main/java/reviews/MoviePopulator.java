package reviews;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MoviePopulator implements CommandLineRunner {

	@Resource
	private MoviesRepository movieRepo;

	@Resource
	private GenreRepository genreRepo;

	@Override
	public void run(String... args) throws Exception {

		Genre drama = new Genre("Drama", "Serious tone or subject.");
		Genre comedy = new Genre("Comedy", "Light and amusing character.");
		Genre adventure = new Genre("Adventure", "Involving danger and unknown risks.");
		Genre family = new Genre("Family", "Fun for the whole family.");

		genreRepo.save(drama);
		genreRepo.save(comedy);
		genreRepo.save(adventure);
		genreRepo.save(family);

		Movie savingPrivateRyan = new Movie(drama, "Saving Private Ryan (1998)",
				"Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.",
				"A touching tale of war and redemption. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/SavingPrivateRyan.jpg");
		Movie reservoirDogs = new Movie(drama, "Reservoir Dogs (1992)",
				"Four perfect killers. One perfect crime. Now all they have to fear is each other.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/resdogs.jpg");

		Movie theLegoMovie = new Movie(family, "The LEGO Movie (2014)",
				"Everything is awesome! The story of a nobody who saved everybody",
				"Great family entertainment. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/TheLegoMovie.jpg");

		Movie theLegoBatmanMovie = new Movie(family, "The LEGO Batman Movie (2017)",
				"Always be yourself... unless you can be Batman",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/legoBatmane.jpg");

		Movie batman89 = new Movie(adventure, "Batman (1989)",
				"The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.",
				"Action-packed bat adventure. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1989.jpg");

		Movie batmanTheMovie66 = new Movie(adventure, "Batman: The Movie (1966)",
				"The Dynamic Duo faces four supervillains planning to hold the world for ransom.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1966.jpg");

		Movie thisIsSpinalTap = new Movie(comedy, "This Is Spinal Tap (1984)",
				"Does for rock and roll what The Sound of Music did for hills",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/spinaltap.jpg");

		Movie historyOfTheWorld = new Movie(comedy, "History of the World: Part I (1981)",
				"Ten million years in the making. The truth, the whole truth, and everything, but the truth! And a little something to offend everyone...",
				"Mel Brooks brings his one-of-a-kind comic touch to the history of mankind covering events from the Old Testament to the French Revolution in a series of episodic comedy vignettes. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/historyOfTheWorld.jpg");

		movieRepo.save(savingPrivateRyan);
		movieRepo.save(reservoirDogs);
		movieRepo.save(theLegoMovie);
		movieRepo.save(theLegoBatmanMovie);
		movieRepo.save(batman89);
		movieRepo.save(batmanTheMovie66);
		movieRepo.save(thisIsSpinalTap);
		movieRepo.save(historyOfTheWorld);

	}

	// private void save(Movie savingPrivateRyan) {
	// // TODO Auto-generated method stub
	//
	// }

}