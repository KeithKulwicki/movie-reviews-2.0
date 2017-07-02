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

		Genre drama = new Genre("Drama", "Realistic characters in conflict with either themselves, others, or forces of nature. .", "/images/icon_drama.jpg");
		Genre comedy = new Genre("Comedy", "Make 'em laugh films designed to elicit laughter from the audience.",
				"/images/icon_comedy.jpg");
		Genre action = new Genre("Action", "Resourceful hero(ine) struggles against incredible odds, life-threatening situations, or an evil villain.", "/images/icon_action.jpg");
		Genre family = new Genre("Family", "Wholesome, entertaining fun for the whole family.", "/images/icon_family.jpg");
		Genre crime = new Genre("Crime", "Sinister actions of underworld figures operating outside the law.",
				"/images/icon_crime.jpg");
		Genre animated = new Genre("Animated", "When combined with movement, the illustrator's two-dimensional static art comes alive.",
				"/images/icon_animated.jpg");
		
		genreRepo.save(action);
		genreRepo.save(animated);		
		genreRepo.save(comedy);
		genreRepo.save(crime);
		genreRepo.save(drama);
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

		Movie goodfellas = new Movie(crime, "Goodfellas (1990)",
				"In a world that's powered by violence, on the streets where the violent have power, a new generation carries on an old tradition.",
				"The story of Henry Hill and his life through the teen years into the years of mafia, covering his relationship with wife Karen Hill and his Mob partners Jimmy Conway and Tommy DeVitto in the Italian-American crime syndicate. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/goodfellas.jpg", "https://www.youtube.com/embed/h3QpxNI-PtE");

		Movie godfather = new Movie(crime, "The Godfather (1972)",
				"An offer you can't refuse.",
				"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/godfather.jpg", "https://www.youtube.com/embed/nSWF-Df5wMo");

		Movie heavymetal = new Movie(animated, "Heavy Metal (1981)",
				"A step beyond science-fiction. Louder and nastier than ever.",
				"A glowing green orb - which embodies ultimate evil - terrorizes a young girl with an anthology of bizarre and fantastic stories of dark fantasy, eroticism and horror. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/heavymetal.jpg", "https://www.youtube.com/embed/aCWg50TKqb4");
		
		Movie americanpop = new Movie(animated, "American Pop (1981)",
				"One family, four generations, in love with the sound of American Pop.",
				"The story of four generations of a Russian Jewish immigrant family of musicians whose careers parallel the history of American popular music in the 20th century. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/americanpop.jpg", "https://www.youtube.com/embed/VBwz9Pijr1E");
		
		
		
		
		
		
		
		movieRepo.save(savingPrivateRyan);
		movieRepo.save(reservoirDogs);
		movieRepo.save(theLegoMovie);
		movieRepo.save(theLegoBatmanMovie);
		movieRepo.save(batman89);
		movieRepo.save(batmanTheMovie66);
		movieRepo.save(thisIsSpinalTap);
		movieRepo.save(historyOfTheWorld);
		movieRepo.save(goodfellas);
		movieRepo.save(godfather);
		movieRepo.save(heavymetal);
		movieRepo.save(americanpop);
		
	}

}