import java.util.ArrayList;

public class GetTheExample {

	public static void main(String[] args) {
		
		HtmlParse html = new HtmlParse();
		ReadFile read = new ReadFile();
		ArrayList<String> movies = new ArrayList<String>();//For MovieIds
		read.ReadLine(movies, "dataset/movies");
		String url = "http://www.omdbapi.com/?t="; //The basic address  -- add the movieId
		Movie movie = new Movie(); //put the information into this object
		WriteFile wrt = new WriteFile();
		

		for(String s : movies)
		{
			String[] arr = s.split("\\|");
			s= arr[1];
			s=s.replace("_", "+");
			if(s.contains(":"))
				s=s.replace(":", "%3A");
			if(s.contains("'"))
				s=s.replace("'", "%27");
			if(s.contains("&"))
				s=s.replace("&", "%26");
			
			
			String tempName = url + s;
			String movieInfo = html.Parse(tempName);
			
			movie = html.examineMovie(movieInfo);
			
			
			String write = movie.movieID + "|" + movie.title + "|" + movie.year + "|" +  movie.director + "|" + movie.writer + "|" + movie.genre
					 + "|" + movie.actors  + "|" + movie.imdbRating +  "\n";
			wrt.Write("dataset/moviesLens", write );
			

		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
