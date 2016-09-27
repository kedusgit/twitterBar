package com.twitter;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.Paging;

public class TwitterConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String consumerKey="OZP4VD43jqTxSWFv2fHRsY8LQ";
		String consumerSecret="8HLMGkoJ5Rsr95uoNI0WqkcXlDqXKB5AVTKq0cAFejPwWDOyzF";
		String accessToken="780805317609132032-rwNhKdcUlF4nyg4LkbAu6REYuBXuhia";
		String accessTokenSecret="NQB1JSH98DLTtRxUFtNce9X7R6hINNTELpzabGyxDCHJt";
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
