/**
 * 
 */
package weibo4j.examples.statuses;

import weibo4j.Status;
import weibo4j.Weibo;

/**
 * @author sina
 *
 */
public class UpdateStatus {

	/**
	 * 发布一条微博信息 
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
        try {
        	Weibo weibo = new Weibo();
			weibo.setToken();
        	Status status = weibo.updateStatus("生当如夏花之绚烂。 -- from my lovely doggy.");
        	System.out.println(status.getId() + " : "+ status.getText()+"  "+status.getCreatedAt());
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
