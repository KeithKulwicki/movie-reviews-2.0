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

		Genre drama = new Genre("Drama", "Serious tone or subject.", "/images/icon_drama.jpg");
		Genre comedy = new Genre("Comedy", "Make 'em laugh films designed to elicit laughter from the audience..", "/images/icon_comedy.jpg");
		Genre action = new Genre("Action", "Involving danger and unknown risks.", "/images/icon_action.jpg");
		Genre family = new Genre("Family", "Fun for the whole family.", "/images/icon_family.jpg");

		genreRepo.save(drama);
		genreRepo.save(comedy);
		genreRepo.save(action);
		genreRepo.save(family);

		Movie savingPrivateRyan = new Movie(drama, "Saving Private Ryan (1998)",
				"In the Last Great Invasion of the Last Great War, The Greatest Danger for Eight Men was Saving... One.",
				"Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/SavingPrivateRyan.jpg", "https://www.youtube.com/embed/zwhP5b4tD6g");
		
		Movie reservoirDogs = new Movie(drama, "Reservoir Dogs (1992)",
				"Four perfect killers. One perfect crime. Now all they have to fear is each other.",
				"After a simple jewelry heist goes terribly wrong, the surviving criminals begin to suspect that one of them is a police informant. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/resdogs.jpg","https://www.youtube.com/embed/vayksn4Y93A");

		Movie theLegoMovie = new Movie(family, "The LEGO Movie (2014)",
				"Everything is awesome! The story of a nobody who saved everybody",
				"An ordinary Lego construction worker, thought to be the prophesied 'Special', is recruited to join a quest to stop an evil tyrant from gluing the Lego universe into eternal stasis.. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/TheLegoMovie.jpg", "https://www.youtube.com/embed/fZ_JOBCLF-I");

		Movie theLegoBatmanMovie = new Movie(family, "The LEGO Batman Movie (2017)",
				"Always be yourself... unless you can be Batman",
				"A cooler-than-ever Bruce Wayne must deal with the usual suspects as they plan to rule Gotham City, while discovering that he has accidentally adopted a teenage orphan who wishes to become his sidekick. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/legoBatman.jpg", "https://www.youtube.com/embed/n9c83L8hevQ");

		Movie batman89 = new Movie(action, "Batman (1989)",
				"Only one will claim the night.",
				"The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1989.jpg", "https://www.youtube.com/embed/F07Mf1kxUKY");

		Movie batmanTheMovie66 = new Movie(action, "Batman: The Movie (1966)",
				"The Dynamic Duo faces four supervillains planning to hold the world for ransom.",
				"The Dynamic Duo faces four supervillains who plan to hold the world for ransom with the help of a secret invention that instantly dehydrates people. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1966.jpg", "https://www.youtube.com/embed/vvY5MgOgDUw");

		Movie thisIsSpinalTap = new Movie(comedy, "This Is Spinal Tap (1984)",
				"Does for rock and roll what The Sound of Music did for hills",
				"Spinal Tap, one of England's loudest bands, is chronicled by film director Marty DiBergi on what proves to be a fateful tour. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/spinaltap.jpg", "https://www.youtube.com/embed/N63XSUpe-0o");

		Movie historyOfTheWorld = new Movie(comedy, "History of the World: Part I (1981)",
				"Ten million years in the making. The truth, the whole truth, and everything, but the truth! And a little something to offend everyone...",
				"Mel Brooks brings his one-of-a-kind comic touch to the history of mankind covering events from the Old Testament to the French Revolution in a series of episodic comedy vignettes. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/historyOfTheWorld.jpg", "https://www.youtube.com/embed/AILiI6f83L8");

		movieRepo.save(savingPrivateRyan);
		movieRepo.save(reservoirDogs);
		movieRepo.save(theLegoMovie);
		movieRepo.save(theLegoBatmanMovie);
		movieRepo.save(batman89);
		movieRepo.save(batmanTheMovie66);
		movieRepo.save(thisIsSpinalTap);
		movieRepo.save(historyOfTheWorld);

	}

}