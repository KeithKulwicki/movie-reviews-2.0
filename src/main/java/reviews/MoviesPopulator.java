package reviews;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MoviesPopulator implements CommandLineRunner {

	@Resource
	private MovieRepository movieRepo;

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Genre drama = new Genre("Drama",
				"Realistic characters in conflict with either themselves, others, or forces of nature. .",
				"/images/icon_drama.jpg");
		Genre comedy = new Genre("Comedy", "Make 'em laugh films designed to elicit laughter from the audience.",
				"/images/icon_comedy.jpg");
		Genre action = new Genre("Action",
				"Resourceful hero(ine) struggles against incredible odds, life-threatening situations, or an evil villain.",
				"/images/icon_action.jpg");
		Genre family = new Genre("Family", "Wholesome, entertaining fun for the whole family.",
				"/images/icon_family.jpg");
		Genre crime = new Genre("Crime", "Sinister actions of underworld figures operating outside the law.",
				"/images/icon_crime.jpg");
		Genre animation = new Genre("Animation",
				"When combined with movement and storytelling, the illustrator's two-dimensional static art comes alive.",
				"/images/icon_animation.jpg");
		Genre horror = new Genre("Horror",
				"Unsettling films designed invoke our hidden worst fears",
				"/images/icon_horror.jpg");
		Genre adventure = new Genre("Adventure",
				"Action-filled, exciting, energetic experience.",
				"/images/icon_adventure.jpg");
		Genre war = new Genre("War",
				"The heroics, heartbreak, and horror of war.",
				"/images/icon_war1.jpg");
		Genre western = new Genre("Western",
				"A eulogy to the early days of the expansive American frontier.",
				"/images/icon_western.jpg");
		Genre historical = new Genre("Historical",
				"Expensive and lavish interpretation of past events.",
				"/images/icon_historical.jpg");
		Genre musical = new Genre("Musical",
				"Emphasize and showcase music and dance as part of the narrative",
				"/images/icon_music.jpg");
		Genre scifi = new Genre("Sci-Fi",
				"Explores the potential consequences of scientific and other innovations,",
				"/images/icon_scifi.jpg");
		
		genreRepo.save(action);
		genreRepo.save(adventure);
		genreRepo.save(animation);
		genreRepo.save(comedy);
		genreRepo.save(crime);
		genreRepo.save(drama);
		genreRepo.save(family);
		genreRepo.save(historical);
		genreRepo.save(horror);
		genreRepo.save(musical);
		genreRepo.save(scifi);
		genreRepo.save(war);
		genreRepo.save(western);
		
		Tag adventure1 = new Tag("Adventure");
		tagRepo.save(adventure1);
		Tag action1 = new Tag("Action");
		tagRepo.save(action1);
		Tag fantasy = new Tag("Fantasy");
		tagRepo.save(fantasy);
		Tag war1 = new Tag("War");
		tagRepo.save(war1);
		Tag military = new Tag("Military");
		tagRepo.save(military);
		Tag music = new Tag("Music");
		tagRepo.save(music);
		Tag gangster = new Tag("Gangster");
		tagRepo.save(gangster);
		Tag organizedcrime = new Tag("Organized Crime");
		tagRepo.save(organizedcrime);
		Tag mafia = new Tag("Mafia");
		tagRepo.save(mafia);
		Tag heistcaper = new Tag("Heist - Caper");
		tagRepo.save(heistcaper);
		Tag historical1 = new Tag("Historical");
		tagRepo.save(historical1);
		Tag mockumentary = new Tag("Mock-umentary");
		tagRepo.save(mockumentary);
		Tag superheroes = new Tag("Super-Heroes");
		tagRepo.save(superheroes);
		Tag scifi1 = new Tag("Sci-Fi");
		tagRepo.save(scifi1);
		Tag comedy1= new Tag("Comedy");
		tagRepo.save(comedy1);
		Tag drama1 = new Tag("Drama");
		tagRepo.save(drama1);
		Tag horror1 = new Tag("Horror");
		tagRepo.save(horror1);
		Tag spaghettiwestern = new Tag("Spaghetti Western");
		tagRepo.save(spaghettiwestern);
		Tag outlaw = new Tag("Outlaw");
		tagRepo.save(outlaw);

		Movie savingPrivateRyan = new Movie(war, "Saving Private Ryan (1998)",
				"In the Last Great Invasion of the Last Great War, The Greatest Danger for Eight Men was Saving... One.",
				"Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/SavingPrivateRyan.jpg", "https://www.youtube.com/embed/zwhP5b4tD6g", war1, military,
				historical1);

		Movie reservoirDogs = new Movie(drama, "Reservoir Dogs (1992)",
				"Four perfect killers. One perfect crime. Now all they have to fear is each other.",
				"After a simple jewelry heist goes terribly wrong, the surviving criminals begin to suspect that one of them is a police informant. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/resdogs.jpg", "https://www.youtube.com/embed/vayksn4Y93A", organizedcrime, heistcaper);

		Movie legoMovie = new Movie(family, "The LEGO Movie (2014)",
				"Everything is awesome! The story of a nobody who saved everybody",
				"An ordinary Lego construction worker, thought to be the prophesied 'Special', is recruited to join a quest to stop an evil tyrant from gluing the Lego universe into eternal stasis.. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/TheLegoMovie.jpg", "https://www.youtube.com/embed/fZ_JOBCLF-I", adventure1);

		Movie legoBatman = new Movie(family, "The LEGO Batman Movie (2017)",
				"Always be yourself... unless you can be Batman",
				"A cooler-than-ever Bruce Wayne must deal with the usual suspects as they plan to rule Gotham City, while discovering that he has accidentally adopted a teenage orphan who wishes to become his sidekick. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/legoBatman.jpg", "https://www.youtube.com/embed/n9c83L8hevQ", adventure1, superheroes);

		Movie batman89 = new Movie(action, "Batman (1989)", "Only one will claim the night.",
				"The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1989.jpg", "https://www.youtube.com/embed/F07Mf1kxUKY", adventure1, superheroes);

		Movie batmanTheMovie66 = new Movie(action, "Batman: The Movie (1966)",
				"The Dynamic Duo faces four supervillains planning to hold the world for ransom.",
				"The Dynamic Duo faces four supervillains who plan to hold the world for ransom with the help of a secret invention that instantly dehydrates people. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/Batman1966.jpg", "https://www.youtube.com/embed/vvY5MgOgDUw", adventure1, superheroes);

		Movie thisIsSpinalTap = new Movie(comedy, "This Is Spinal Tap (1984)",
				"Does for rock and roll what The Sound of Music did for hills",
				"Spinal Tap, one of England's loudest bands, is chronicled by film director Marty DiBergi on what proves to be a fateful tour. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/spinaltap.jpg", "https://www.youtube.com/embed/N63XSUpe-0o", music, mockumentary, comedy1);

		Movie historyOfTheWorld = new Movie(comedy, "History of the World: Part I (1981)",
				"Ten million years in the making. The truth, the whole truth, and everything, but the truth! And a little something to offend everyone...",
				"Mel Brooks brings his one-of-a-kind comic touch to the history of mankind covering events from the Old Testament to the French Revolution in a series of episodic comedy vignettes. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/historyOfTheWorld.jpg", "https://www.youtube.com/embed/AILiI6f83L8", historical1, comedy1);

		Movie goodfellas = new Movie(crime, "Goodfellas (1990)",
				"In a world that's powered by violence, on the streets where the violent have power, a new generation carries on an old tradition.",
				"The story of Henry Hill and his life through the teen years into the years of mafia, covering his relationship with wife Karen Hill and his Mob partners Jimmy Conway and Tommy DeVitto in the Italian-American crime syndicate. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/goodfellas.jpg", "https://www.youtube.com/embed/h3QpxNI-PtE", organizedcrime, mafia, gangster);

		Movie godfather = new Movie(crime, "The Godfather (1972)", "An offer you can't refuse.",
				"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/godfather.jpg", "https://www.youtube.com/embed/nSWF-Df5wMo", organizedcrime, mafia, gangster);

		Movie heavymetal = new Movie(animation, "Heavy Metal (1981)",
				"A step beyond science-fiction. Louder and nastier than ever.",
				"A glowing green orb - which embodies ultimate evil - terrorizes a young girl with an anthology of bizarre and fantastic stories of dark fantasy, eroticism and horror. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/heavymetal.jpg", "https://www.youtube.com/embed/aCWg50TKqb4", music, scifi1, fantasy);

		Movie americanpop = new Movie(animation, "American Pop (1981)",
				"One family, four generations, in love with the sound of American Pop.",
				"The story of four generations of a Russian Jewish immigrant family of musicians whose careers parallel the history of American popular music in the 20th century. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/americanpop.jpg", "https://www.youtube.com/embed/VBwz9Pijr1E", music, historical1);
		
		Movie frankenstein = new Movie(scifi, "Frankenstein  (1931)",
				"The Man Who Made A Monster!",
				"An obsessed scientist assembles a living being from parts of exhumed corpses. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/frankenstein.jpg", "https://www.youtube.com/embed/AkSbwiKP3mo", scifi1, drama1);
		
		Movie voyageDansLaLune = new Movie(scifi, "Voyage Dans La Lune (A Trip to the Moon) (1902)",
				"A group of astronomers go on an expedition to the Moon.",
				"A group of men travel to the moon by being shot in a capsule from a giant cannon. They are captured by moon-men, escape, and return to the earth. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/voyageDansLaLune.jpg", "https://www.youtube.com/embed/9m830jhUi3E", scifi1);
		
		Movie apocalypseNow = new Movie(war, "Apocalypse Now (1979)",
				" The Horror. . . The Horror. . .",
				"During the Vietnam War, Captain Willard is sent on a dangerous mission into Cambodia to assassinate a renegade colonel who has set himself up as a god among a local tribe. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/apocalypseNow.jpg", "https://www.youtube.com/embed/FTjG-Aux_yQ", war1, drama1);
		
		Movie spartacus = new Movie(historical, "Spartacus (1960)",
				"History's most powerful story of love and rebellion",
				"The slave Spartacus leads a violent revolt against the decadent Roman Republic. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/sparticus.jpg", "https://www.youtube.com/embed/HcIMY1Ah3aw", war1, drama1);
	
		Movie raidersOfTheLostArk = new Movie(adventure, "Raiders of the Lost Ark (1981)",
				"The Return of the Great Adventure.",
				"Archaeologist and adventurer Indiana Jones is hired by the U.S. government to find the Ark of the Covenant before the Nazis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/raidersOfTheLostArk.jpg", "https://www.youtube.com/embed/XkkzKHCx154", action1, adventure1);
	
		Movie pitAndThePendulum = new Movie(horror, "The Pit and the Pendulum (1961)",
				"Until now no one has dared to film this ...... the most diabolical classic of all time!",
				"In the sixteenth century, Francis Barnard travels to Spain to clarify the strange circumstances of his sister's death after she had married the son of a cruel Spanish Inquisitor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/pitAndThePendulum.jpg", "https://www.youtube.com/embed/QChBy15UiTs", drama1, horror1,fantasy);
		
		Movie aHardDaysNight = new Movie(musical, "A Hard Day's Night (1964)",
				"THE BEATLES in Their First Full Length, Hilarious Action-Packed Film",
				"A \"typical\" day in the life of The Beatles, including many of their famous songs. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/aHardDaysNight.jpg", "https://www.youtube.com/embed/4YKZg_dbcNQ", comedy1, music);
		
		Movie goodBadUgly = new Movie(western, "The Good, the Bad, and the Ugly (1966) ",
				"For Three Men The Civil War Wasn't Hell. It Was Practice!",
				"A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.",
				"/images/goodBadUgly.jpg", "https://www.youtube.com/embed/WCN5JJY_wiA", spaghettiwestern, outlaw);
		
		movieRepo.save(aHardDaysNight);
		movieRepo.save(americanpop);
		movieRepo.save(apocalypseNow);
		movieRepo.save(batmanTheMovie66);
		movieRepo.save(batman89);
		movieRepo.save(frankenstein);
		movieRepo.save(godfather);
		movieRepo.save(goodBadUgly);
		movieRepo.save(goodfellas);
		movieRepo.save(heavymetal);
		movieRepo.save(historyOfTheWorld);
		movieRepo.save(legoBatman);
		movieRepo.save(legoMovie);
		movieRepo.save(reservoirDogs);
		movieRepo.save(pitAndThePendulum);
		movieRepo.save(savingPrivateRyan);
		movieRepo.save(spartacus);
		movieRepo.save(thisIsSpinalTap);
		movieRepo.save(voyageDansLaLune);
		movieRepo.save(raidersOfTheLostArk);
	}

}