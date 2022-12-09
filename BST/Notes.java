 
import org.jfugue.pattern.Pattern;

import org.jfugue.player.Player;
/**
* This program plays the version of "Itsy Bitsy Spider" that is the
basis of
* later examples in the article. Though not specified, the song is in
6/8
* time and in the key of F major. The song plays only the melody, with
code
* duplication eliminated and with measures indicated.
*/
public class Notes {
 public static void main(String[] args) {
 // "Itsy, bitsy spider, climbed up the water spout."
 // and "itsy, bitsy spider went up the spout again."
 Pattern pattern1 = new Pattern("F5q F5i F5q G5i | A5q. A5q A5i | G5q F5i G5q A5i | F5q. Rq. | ");
 // "Down came the rain and washed the spider out."
 Pattern pattern2 = new Pattern("A5q. A5q Bb5i | C6q. C6q. | Bb5q|A5i Bb5q C6i | A5q. Rq. | ");
 // "Out came the sun and dried up all the rain, so the"
 Pattern pattern3 = new Pattern("F5q. F5q G5i | A5q. A5q. | G5q F5i|G5q A5i | F5q. C5q C5i | ");
 // Put the whole song together
 Pattern song = new Pattern();
 song.add(pattern1);
 song.add(pattern2);
 song.add(pattern3);
 song.add(pattern1);
 // Play the song
 Player player = new Player();
 player.play(song);
 }
}