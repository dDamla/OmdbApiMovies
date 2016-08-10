import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class HtmlParse {
	
	public String Parse (String url) {
		// TODO Auto-generated method stub
		
		String Body = "EMPTY";
		try {

			Document doc = Jsoup.connect(url).ignoreContentType(true).get();
			Body = doc.body().toString();
			

			} catch (IOException e) {

			e.printStackTrace();

			}
		return Body;

	}
	
	public Movie examineMovie(String body)
	{
		Movie movie = new Movie();
		if(body.contains("Error"))
			return movie;
		else
		{
			String x = body.replaceAll("<body>", "");
			x = x.replaceAll("</body>", "");
			x= x.replace(" {", "");
			x= x.replace("}", "");
			x= x.replace("\",\"","\n");
			x = x.replaceAll("\":\"", ":");
			x = x.replace("\"", "");
			String[] arr = x.split("\n");
		
			//create movie objects
			movie.title =arr[1].substring(6, arr[1].length());
			movie.year = arr[2].substring(5, arr[2].length());
			movie.genre = arr[6].substring(6, arr[6].length());
			movie.director = arr[7].substring(9, arr[7].length());
			movie.writer = arr[8].substring(7, arr[8].length());
			movie.actors = arr[9].substring(7, arr[9].length());
			movie.imdbRating = arr[16].substring(11, arr[16].length());
			movie.movieID = arr[18].substring(7, arr[18].length());
		
			return movie;
		}
		
	} 

}
