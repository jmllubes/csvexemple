import com.opencsv.bean.CsvBindByPosition;

public class review {

	@CsvBindByPosition(position = 0)
	private String ReviewTitle;
	@CsvBindByPosition(position = 1)
	private String ReviewText;
	@CsvBindByPosition(position = 2)
	private int wordcount;	
	@CsvBindByPosition(position = 3)
	private String titleSentiment;	
	@CsvBindByPosition(position = 4)
	private String textSentiment;	
	@CsvBindByPosition(position = 5)
	private int StarRating;	
	@CsvBindByPosition(position = 6)
	private float sentimentValue;
	
	public review() {
		
	}
	
	public review(String reviewTitle, String reviewText, int wordcount, String titleSentiment, String textSentiment,
			int starRating, float sentimentValue) {
		super();
		ReviewTitle = reviewTitle;
		ReviewText = reviewText;
		this.wordcount = wordcount;
		this.titleSentiment = titleSentiment;
		this.textSentiment = textSentiment;
		StarRating = starRating;
		this.sentimentValue = sentimentValue;
	}
	public String getReviewTitle() {
		return ReviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		ReviewTitle = reviewTitle;
	}
	public String getReviewText() {
		return ReviewText;
	}
	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}
	public int getWordcount() {
		return wordcount;
	}
	public void setWordcount(int wordcount) {
		this.wordcount = wordcount;
	}
	public String getTitleSentiment() {
		return titleSentiment;
	}
	public void setTitleSentiment(String titleSentiment) {
		this.titleSentiment = titleSentiment;
	}
	public String getTextSentiment() {
		return textSentiment;
	}
	public void setTextSentiment(String textSentiment) {
		this.textSentiment = textSentiment;
	}
	public int getStarRating() {
		return StarRating;
	}
	public void setStarRating(int starRating) {
		StarRating = starRating;
	}
	public float getSentimentValue() {
		return sentimentValue;
	}
	public void setSentimentValue(float sentimentValue) {
		this.sentimentValue = sentimentValue;
	}

	@Override
	public String toString() {
		return "review [ReviewTitle=" + ReviewTitle + ", ReviewText=" + ReviewText + ", wordcount=" + wordcount
				+ ", titleSentiment=" + titleSentiment + ", textSentiment=" + textSentiment + ", StarRating="
				+ StarRating + ", sentimentValue=" + sentimentValue + "]";
	}
	
	
	

}
