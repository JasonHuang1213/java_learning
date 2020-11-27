package homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Homework5 {

	public static void main(String[] args) {
		List<MusicTrack> tracks = new ArrayList<>();
		tracks.add(new MusicTrack("Alanner", "James", 2.8, 3.8));
		tracks.add(new MusicTrack("Blinding", "James", 3.5, 3.7));
		tracks.add(new MusicTrack("Cyrio", "James", 3.1, 4.0));
		tracks.add(new MusicTrack("Sea", "Marry", 3.2, 4.1));
		tracks.add(new MusicTrack("Firework", "Duncan", 3.5, 3.6));
		tracks.add(new MusicTrack("Grassland", "Tim", 2.6, 4.3));
		
		Collections.sort(tracks);
		System.out.println("Tracks sorted by titles in alphabetical order: ");
		for(MusicTrack track : tracks) {
			System.out.println(track);
		}
		
		System.out.println("\nTracks sorted by rating in descending order: ");
		// Anonymous inner class for Comparator
		Collections.sort(tracks, new Comparator<MusicTrack>() {
			@Override
			public int compare(MusicTrack m1, MusicTrack m2) {
				int a = 0;
				if (m1.getRating() < m2.getRating()) a = 1;
				else if (m1.getRating() > m2.getRating()) a = -1;
				else a = 0;
				return a;
			}
		});
		for(MusicTrack track : tracks) {
			System.out.println(track);
		}
		
		System.out.println("\nTracks sorted by artists in alphabetical order using Lambda expression: ");
		tracks.sort((m1, m2) -> m1.getArtist().compareTo(m2.getArtist()));
		for(MusicTrack track : tracks) {
			System.out.println(track);
		}
		
		System.out.println("\nTracks of James sorted by duration in ascending order: ");
		List<MusicTrack> tracks2 = tracks.stream()
			.filter(a -> a.getArtist().equals("James"))
			.collect(Collectors.toList());
		tracks2.sort((m1, m2) -> m1.getDuration() < m2.getDuration() ? -1 : 1);
		for(MusicTrack track : tracks2) {
			System.out.println(track);
		}
	}
}
