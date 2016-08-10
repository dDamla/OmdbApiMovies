
public class Movie {
	
	public String movieID = "EMPTY";
	public String title = "EMPTY";
	public String year = "EMPTY";
	public String genre = "EMPTY";
	public String director = "EMPTY";
	public String writer = "EMPTY";
	public String actors = "EMPTY";
	public String imdbRating = "EMPTY";
	
	public void ShowInfo()
	{
		System.out.println("movieID:" + movieID + "\n" + "title:" + title + "\n" + "year:" + year + "\n" +
				"genre:" + genre + "\n" + "director:" + director + "\n" + "writer:" + writer + "\n" +
				"actors:" + actors + "\n" + "imdbRating:" + imdbRating + "\n");
	
	}

}
