import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TwitterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String consumerKey="Key";
		String consumerSecret="Secret";
		String accessToken="Token";
		String accessTokenSecret="TokenSecret";
		TwitterFactory tFactory=new TwitterFactory();
		Twitter twitter=tFactory.getInstance();
		twitter.setOAuthConsumer(consumerKey,consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken,accessTokenSecret));
		try{
			ResponseList<Status> a=twitter.getUserTimeline(new Paging(1,5));
			for (Status b:a){
				System.out.println(b.getText());
			}
		}
		catch(Exception ex){
			
		}
	}

}
