package homework5;

public class MusicTrack implements Comparable<MusicTrack>{
	private String title;
	private String artist;
	private double duration;
	private double rating;	// 0.0 - 5.0
	
	public MusicTrack(String title, String artist, double duration, double rating) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", artist: " + artist + ", duration: " + duration + ", rating: " + rating;
	}

	@Override
	public int compareTo(MusicTrack music) {
		return title.compareToIgnoreCase(music.title);
	}
	
}
