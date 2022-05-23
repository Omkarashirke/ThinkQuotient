
interface MusicalInstrument 
{
	void play();
}
abstract class Sound 
{
	abstract void listenSound();
}
class PercussionInstrument extends Sound implements  MusicalInstrument
{
	public void play()
	{
		System.out.println(" Play Percussion Instrument ");
	}
	void listenSound()
	{
		System.out.println(" listen Sound Percussion Instrument ");
	}
}
class StringedInstrument extends Sound implements  MusicalInstrument
{
	public void play()
	{
		System.out.println(" Play Stringed Instrument ");
	}
	void listenSound()
	{
		System.out.println(" listen Sound Stringed Instrument ");
	}
}

public class Music {

	public static void main(String[] args) 
	{
		
		PercussionInstrument table = new PercussionInstrument();
		table.play();
		table.listenSound();
		StringedInstrument violin = new StringedInstrument();
		violin.play();
		violin.listenSound();

	}

}
